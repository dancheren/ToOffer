package Offer_29;

/*
 *  找出数组中出现次数超过数组长度一半的数
 *  思路：首先将无需数组经过排序后成为有序数组，结合题目问题我们可以知道当一个元素出现次数超过数组长度一半时
 *  该元素很定会在数组的中位线上由此我们可以用快速排序的思想来找到排好序后的数组的中位线上的元素，
 *  然后遍历数组查看该元素出现的次数，如果大于数组的一半，返回该元素，反之返回 0 此种方法会破坏原始数组的顺序
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
