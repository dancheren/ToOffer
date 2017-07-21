package Offer_31;

/*
 * ���������������
 *    ˼·���� CurSum ��¼��i������ǰi-1���������ͣ���� CurSum��i-1��<0�Ļ���������֮ǰ���ۼӺͣ�
 *        �ӵ�i ������ʼΪ CurSum���˹���Ҳ���Ƕ�̬�滮��˼��
 */
public class FindGreatestSumOfSubArray {
	boolean InvalidInput = false;    //����һ��������ȷ���б��־��������������󷵻�0������������Ϊ0��

	public int findGreatestSumOfSubArray(int[] arr, int length) {
		if (arr == null || length < 1) {
			InvalidInput = true;
			return 0;
		}
		InvalidInput = false;
		int CurSum = 0;
		int GreatestSum = Integer.MIN_VALUE; // ��¼���������������,��ʼֵ����Ϊ��С�ĸ���
		for (int i = 0; i < length; i++) {
			if (CurSum <= 0) {
				CurSum = arr[i];
			} else {
				CurSum += arr[i];
			}
			if (CurSum > GreatestSum) {
				GreatestSum = CurSum;
			}
		}
		return GreatestSum;
	}
}
