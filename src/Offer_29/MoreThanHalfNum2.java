package Offer_29;
/*
 * 在遍历数组的时候保存两个值：一个是数组中的一个数字，一个是次数。当我们遍历到下一个数字的时候，如果下一个数字和我们之前保存的数字相同，则次数加1，
 * 如果不同，次数减1.如果次数为0，我们需要保存下一个数字，并把次数设为1,。由于我们要找的数字出现的次数比其他所有数字出现的次数都要多，那么要找的
 * 数字肯定是最后一次把次数设为1的那个数。
 */

public class MoreThanHalfNum2 {
	moreThanHalfNum m = new moreThanHalfNum();

	public int MoreThanHalfNum(int[] arr, int length) {
		if (m.CheckInvalidArray(arr, length)) {
			return 0;
		}
		int result = arr[0];
		int times = 1;
		for (int i = 0; i < length; i++) {
			if (times == 0) {
				result = arr[i];
				times = 1;
			} else if (arr[i] == result) {
				times++;
			} else {
				times--;
			}
		}
		if (!(m.CheckMoreThanHalf(arr, length, result))) {
			return 0;
		}
		return result;
	}
}
