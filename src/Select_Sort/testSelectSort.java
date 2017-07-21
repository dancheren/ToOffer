package Select_Sort;

/*
 * 简单选择排序算法
 *     在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，
 *     依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
 */

public class testSelectSort {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 7, 4, 6, 9, 3 };
		selectSort(arr, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int selectMinKey(int[] arr, int len, int i) {
		int k = i;
		int j ;
		for (j=i+1; j < len; j++) {
			if (arr[k] > arr[j])
				k = j;
		}
		return k;
	}

	public static void selectSort(int[] arr, int len) {
		int key;
		int temp;
		for (int i = 0; i < len; i++) {
			key = selectMinKey(arr, len, i);
			if (key != i) {
				temp = arr[i];
				arr[i] = arr[key];
				arr[key] = temp;
			}
		}
	}

}
