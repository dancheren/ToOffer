package Select_Sort;

/*
 * ��ѡ�������㷨
 *     ��Ҫ�����һ�����У�ѡ����С��������󣩵�һ�������1��λ�õ���������Ȼ����ʣ�µ�������������С��������󣩵����2��λ�õ���������
 *     �������ƣ�ֱ����n-1��Ԫ�أ������ڶ��������͵�n��Ԫ�أ����һ�������Ƚ�Ϊֹ��
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
