package Offer_14;

public class Solution {
	/*
	 * 此方法不能保证稳定性，不是最佳解法
	 */
	public void reOrderArray1(int[] array) {
		if (array == null || array.length == 0)
			return;
		int len = array.length;
		int start = 0;
		int end = len - 1;
		while (start < end) {
			while (start < end && (array[start] & 1) != 0) {
				start++;
			}
			while (start < end && (array[end] & 1) == 0) {
				end--;
			}
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
		}
	}
	/*
	 * 此方法能够保证稳定性，较上面方法好
	 */
	 public void reOrderArray2(int [] array) {
	        if(array == null || array.length == 0)
	            return ;
	        int odd = 0;
	        for(int i=0;i<array.length;i++){
	            if((array[i] & 1) == 1)
	                odd++;
	        }
	        if(odd <= 0)
	            return;
	        int even = array.length - odd;
	        int[] arr1 = new int[odd];
	        int[] arr2 = new int[even];
	        int a1 =0;
	        int a2 = 0;
	        int start = 0;
	        int end = array.length - 1;
	        while(start <= end){
	            if(start <= end && (array[start] & 1) != 0){
	                arr1[a1++] = array[start];
	            }else{
	                arr2[a2++] = array[start];
	            }
	            start ++;
	        }
	        for(int i = 0;i< odd;i++){
	            array[i] = arr1[i];
	        }
	         for(int i = 0;i< even;i++){
	            array[odd++] = arr2[i];
	        }
	    }
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] array = {1,2,3,4,5,6,7,8,9};
		s.reOrderArray2(array);
		for(int i:array){
			System.out.print(i+" ");
		}
	}
}
