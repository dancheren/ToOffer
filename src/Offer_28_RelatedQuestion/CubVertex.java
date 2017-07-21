package Offer_28_RelatedQuestion;


/*
 * 剑指offer上的全排列相关题目。

	    输入一个含有8个数字的数组，判断有么有可能把这8个数字分别放到正方体的8个顶点上，使得正方体上三组相对的面上的4个顶点的和相等。
	
	    思路：相当于求出8个数字的全排列，判断有没有一个排列符合题目给定的条件，即三组对面上顶点的和相等。 
 */
public class CubVertex {
	public boolean cubVertex(int[] arr, int start,int end) {
		if (arr.length != 8 || arr == null) {
			return false;
		}
		boolean result = false;
		if (start == end) {
			if (arr[0] + arr[1] + arr[2] + arr[3] == arr[4] + arr[5] + arr[6] + arr[7]
					&& arr[0] + arr[2] + arr[4] + arr[6] == arr[1] + arr[3] + arr[5] + arr[7]
					&& arr[0] + arr[1] + arr[4] + arr[5] == arr[2] + arr[3] + arr[6] + arr[7]) {
				for (int i = 0; i < arr.length; i++) {
					
					System.out.print(arr[i] +" ");
					
				}
				System.out.println("");
				result = true;
				//return true;
			}
		} else {
			for (int i = start; i <= end; i++) {
				int temp = arr[i];
				arr[i] = arr[start];
				arr[start] = temp;
				result = cubVertex(arr, start+1, end);
				if (result){
					break;
				}
				temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
			}
		}
		return result;
	}
}
