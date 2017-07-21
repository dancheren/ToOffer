package Offer_30;

public class TopK {
	public int getParent(int i) {
		return (i - 1) / 2;
	}

	public int getLeft(int i) {
		return 2 * i + 1;
	}

	public int getRight(int i) {
		return 2 * i + 2;
	}

	public void buildHeap(int[] arr, int len) {
		for (int i = (len - 1) / 2; i >= 0; i--) {
			heapAdjust(arr, i, len);
		}
	}

	public void heapAdjust(int[] arr, int i, int len) {
		int left = getLeft(i);
		int right = getRight(i);
		int largest;
		if (left < len && arr[i] < arr[left]) {
			largest = left;
		} else {
			largest = i;
		}
		if (right < len && arr[largest] < arr[right]) {
			largest = right;
		}
		if (largest != i) {
			swap(arr[i], arr[largest]);
			heapAdjust(arr, largest, len);
		}
	}

	public void heapSort(int[] arr, int len) {
		buildHeap(arr, len);
		for (int i = len - 1; i >= 0; --i) {
			swap(arr[i], arr[0]);
			heapAdjust(arr, 0, i - 1);
		}
	}

	public void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public void getLeastIndex(int[] arr, int k) {
		if (arr == null || arr.length == 0 || k > arr.length)
			return;
		int[] array = new int[k];
		for (int i = 0; i < k; i++) {
			array[i] = arr[i];
		}
		for (int i = k; i < arr.length; i++) {
			buildHeap(array, k);
			if (arr[k] < array[k - 1]) {
				array[k - 1] = arr[k];
				buildHeap(array, k);
			}
		}
		//Partition1.partition1(array, 0, k-1);
		print(array);
	}

	public void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
}
