package Offer_31;

public class mainTest {

	public static void main(String[] args) {
		FindGreatestSumOfSubArray findGreatestSumOfSubArray = 
				new FindGreatestSumOfSubArray();
		int[] arr = {5,-1,3,-3,1,7,-5,2,-7};
		int length = arr.length;
		int x = findGreatestSumOfSubArray.findGreatestSumOfSubArray(arr, length);
		System.out.println(x);
	}

}
