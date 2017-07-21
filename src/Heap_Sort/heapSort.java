package Heap_Sort;


/*
 * �������㷨
 */
public class heapSort {

	// ��ȡ��i�����ĸ��ڵ�
	public int parent(int i) {
		return (i - 1) / 2;
	}

	// ��ȡ��i���������ӽڵ�
	public int left(int i) {
		return 2 * i + 1;
	}

	// ��ȡ��i���������ӽڵ�
	public int right(int i) {
		return 2 * i + 2;
	}

	
	/*
	 * ���ѵĹ��̾��ǲ��϶Զѵ����Ĺ��̣�������������������洢ʱ������ͨ����i=(length-1)/2λ�ÿ�ʼ������i--,ֱ��i=0
	 * (��Ϊ�±����n/2��������Ҷ�ӽڵ㣬�������Ѿ�����ѵ�������).
	 */
	public void buildHeap(int[] arr, int heap_size) {
		for (int i = (heap_size - 1) / 2; i >= 0; i--) {   
			heapAdjust(arr, i, heap_size);    //�Ե�i��������µ����н����жѵ���
		}
	}

	private void heapAdjust(int[] arr, int start, int heap_size) {   
		int l = this.left(start); //�������е�start������ʼ���������Ե�start����Ϊ���ڵ�����������ɶѵ����ԣ�Ȼ���˻ص���start-1��Ԫ�ؽ��е���
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
			heapAdjust(arr, largest, heap_size); //�ݹ齫���ڵ�Ϊi����������Ϊһ��С��
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
