package Offer_29;
/*
 * �ڱ��������ʱ�򱣴�����ֵ��һ���������е�һ�����֣�һ���Ǵ����������Ǳ�������һ�����ֵ�ʱ�������һ�����ֺ�����֮ǰ�����������ͬ���������1��
 * �����ͬ��������1.�������Ϊ0��������Ҫ������һ�����֣����Ѵ�����Ϊ1,����������Ҫ�ҵ����ֳ��ֵĴ����������������ֳ��ֵĴ�����Ҫ�࣬��ôҪ�ҵ�
 * ���ֿ϶������һ�ΰѴ�����Ϊ1���Ǹ�����
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
