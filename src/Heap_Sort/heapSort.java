package Heap_Sort;


/*
 * 堆排序算法
 */
public class heapSort {

	// 获取第i个结点的父节点
	public int parent(int i) {
		return (i - 1) / 2;
	}

	// 获取第i个结点的左子节点
	public int left(int i) {
		return 2 * i + 1;
	}

	// 获取第i个结点的右子节点
	public int right(int i) {
		return 2 * i + 2;
	}

	
	/*
	 * 建堆的过程就是不断对堆调整的过程，当待排序序列用数组存储时，我们通常从i=(length-1)/2位置开始调整，i--,直到i=0
	 * (因为下标大于n/2的数都是叶子节点，其子树已经满足堆的性质了).
	 */
	public void buildHeap(int[] arr, int heap_size) {
		for (int i = (heap_size - 1) / 2; i >= 0; i--) {   
			heapAdjust(arr, i, heap_size);    //对第i个结点以下的所有结点进行堆调整
		}
	}

	private void heapAdjust(int[] arr, int start, int heap_size) {   
		int l = this.left(start); //从数组中第start个数开始调整，将以第start个数为根节点的字数调整成堆的特性，然后退回到底start-1个元素进行调整
		int r = this.right(start);
		int temp;
		int largest;
		if (l < heap_size && arr[l] > arr[start]) {
			largest = l;
		} else {
			largest = start;
		}
		if (r < heap_size && arr[r] > arr[largest]) {
			largest = r;
		}
		if (largest != start) {
			temp = arr[start];
			arr[start] = arr[largest];
			arr[largest] = temp;
			heapAdjust(arr, largest, heap_size); //递归将根节点为i的子树调整为一个小堆
		}
	}

	public void heap_Sort(int[] arr, int heap_size) {
		buildHeap(arr, heap_size);
		for (int i = heap_size - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapAdjust(arr, 0, i-1);
		}

		this.print(arr, heap_size);
	}

	public void print(int[] arr, int heap_size) {
		for (int i = 0; i < heap_size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 7, 45, 81, 1,5,8,100,13, 49, 23, 78, 90 };
		int heap_size = arr.length;
		heapSort heap = new heapSort();
		heap.heap_Sort(arr, heap_size);
	}

}
