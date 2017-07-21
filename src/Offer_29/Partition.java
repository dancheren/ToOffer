package Offer_29;

public class Partition {

	public static int partition(int[] arr, int start, int end) {
		int i = start;
		int j = end;
		int temp = arr[i]; // ��һ������Ϊ���� �˴���Ҫ���һ���������洢����ֵ
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
		} while (i != j); // ��i = j ʱ��iλ��Ϊ����Ĳ���λ��
		arr[i] = temp;
		return i; // ��������λ��
	}
}
