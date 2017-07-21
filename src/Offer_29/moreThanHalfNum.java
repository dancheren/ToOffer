package Offer_29;

/*
 *  �ҳ������г��ִ����������鳤��һ�����
 *  ˼·�����Ƚ��������龭��������Ϊ�������飬�����Ŀ�������ǿ���֪����һ��Ԫ�س��ִ����������鳤��һ��ʱ
 *  ��Ԫ�غܶ������������λ�����ɴ����ǿ����ÿ��������˼�����ҵ��ź������������λ���ϵ�Ԫ�أ�
 *  Ȼ���������鿴��Ԫ�س��ֵĴ�����������������һ�룬���ظ�Ԫ�أ���֮���� 0 ���ַ������ƻ�ԭʼ�����˳��
 *   
 *   
 */

public class moreThanHalfNum {

	boolean InputInvalid = false;

	public boolean CheckInvalidArray(int[] arr, int length) {
		InputInvalid = false;
		if (arr == null || length <= 0) {
			InputInvalid = true;
		}
		return InputInvalid;
	}

	public boolean CheckMoreThanHalf(int[] arr, int length, int number) {
		int times = 0;
		for (int i = 0; i < length; i++) {
			if (arr[i] == number) {
				times++;
			}
		}
		boolean isMoreThanHalf = true;
		if (times * 2 <= length) {
			InputInvalid = true;
			isMoreThanHalf = false;
		}
		return isMoreThanHalf;
	}

	public int MoreThanHalfNum(int[] arr, int length) {
		if (CheckInvalidArray(arr, length)) {
			return 0;
		}
		int middle = length >> 1;
		int start = 0;
		int end = length - 1;
		int index = Partition.partition(arr, start, end);
		while (middle != index) {
			if (index > middle) {
				end = index - 1;
				index = Partition.partition(arr, start, end);
			} else {
				start = index + 1;
				index = Partition.partition(arr, start, end);
			}
		}
		int result = arr[middle];
		if (!CheckMoreThanHalf(arr, length, result)) {
			return 0;
		}
		return result;
	}
}
