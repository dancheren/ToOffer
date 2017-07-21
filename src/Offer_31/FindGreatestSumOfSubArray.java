package Offer_31;

/*
 * 连续子数组的最大和
 *    思路：用 CurSum 记录第i个数的前i-1个数的最大和，如果 CurSum（i-1）<0的话，就抛弃之前的累加和，
 *        从第i 个数开始为 CurSum，此过程也就是动态规划的思想
 */
public class FindGreatestSumOfSubArray {
	boolean InvalidInput = false;    //设置一个输入正确否判别标志，以区别输入错误返回0和最大子数组和为0；

	public int findGreatestSumOfSubArray(int[] arr, int length) {
		if (arr == null || length < 1) {
			InvalidInput = true;
			return 0;
		}
		InvalidInput = false;
		int CurSum = 0;
		int GreatestSum = Integer.MIN_VALUE; // 记录连续子数组的最大和,初始值设置为最小的负数
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
