package Offer_29;

public class Partition {

	public static int partition(int[] arr, int start, int end) {
		int i = start;
		int j = end;
		int temp = arr[i]; // 第一个数作为枢轴 此处需要添加一个变量来存储枢轴值
		do {
			while (arr[j] > temp && i < j) {
				j--;
			}
			if (i < j) {
				arr[i] = arr[j];
				i++;
			}
			while (arr[i] < temp && i < j) {
				i++;
			}
			if (i < j) {
				arr[j] = arr[i];
				j--;
			}
		} while (i != j); // 当i = j 时，i位置为枢轴的插入位置
		arr[i] = temp;
		return i; // 返回枢轴位置
	}
}
