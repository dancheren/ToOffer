package Offer_38;

public class GetNumberOfK {

	public static void main(String[] args) {
       int[] data = {1,2,3,3,3,3,4,5,5,6,7,8};
       int number = getNumberOfK(data, data.length, 5);
       System.out.println(number);
	}

	/*
	 * 二分查找数字k出现在数组中的第一位的下标
	 */
	public static int getFirstOfK(int[] data, int len, int k, int start, int end) {
		if (data == null)
			return -1;     //如果数字在数组中不存在，返回-1
		int middleIndex = (start + end) / 2;
		int middleData = data[middleIndex];
		
		if (middleData == k) {
			if (middleIndex == 0 || (middleIndex > 0 && data[middleIndex - 1] != k)) {
				return middleIndex;
			} else {
				end = middleIndex - 1;
			}
		} else if (middleData > k) {
			end = middleIndex - 1;
		} else {
			start = middleIndex + 1;
		}
		
		return getFirstOfK(data, len, k, start, end);
	}
	
	/*
	 * 二分查找数字k出现在数组中的最后一位的下标
	 */
	public static int getLastOfK(int[] data, int len, int k, int start, int end) {
		if (data == null)
			return -1;   //如果数字在数组中不存在，返回-1
		int middleIndex = (start + end) / 2;
		int middleData = data[middleIndex];
		
		if (middleData == k) {
			if (middleIndex == len - 1 || (middleIndex < len - 1 && data[middleIndex + 1] != k)) {
				return middleIndex;
			} else {
				start = middleIndex + 1;
			}
		} else if (middleData > k) {
			end = middleIndex - 1;
		} else {
			start = middleIndex + 1;
		}
		
		return getLastOfK(data, len, k, start, end);
	}

	
	public static int getNumberOfK(int[] data,int len,int k){
		int number = 0;
		if(data == null)
			return number;
		int start = 0;
		int end = len -1;
		int left = getFirstOfK(data, len, k, start, end);
		int right = getLastOfK(data, len, k, start, end);
		number = right - left + 1;
		return number;
	}

}
