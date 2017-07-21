package Offer_36;

public class InversePair {
	public int inversePair(int[] arr, int len) {
		if (arr == null)
			return 0;
		int[] temp = new int[len];
		int count = 0;
		count = iPair(arr, temp, 0, len - 1);
		return count;
	}

	private int iPair(int[] arr, int[] temp, int start, int end) {
		if (start == end)
			return 0;
		int mid = (end + start) / 2;
		int left = iPair(arr, temp, start, mid);
		int right = iPair(arr, temp, mid + 1, end);

		int i = mid;
		int j = end;
		int pos = end;
		int count = 0;
		while (i >= start && j >= mid + 1) {
			if (arr[i] > arr[j]) {
				count += j - mid;
				temp[pos--] = arr[i--];
			} else if (arr[i] < arr[j]) {
				temp[pos--] = arr[j--];
			} else {
				temp[pos--] = arr[j--];
			}
		}
		while (i >= start) {
			temp[pos--] = arr[i--];
		}
		while (j >= mid + 1) {
			temp[pos--] = arr[j--];
		}
		return count + left + right;
	}
}
