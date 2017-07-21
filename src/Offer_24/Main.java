package Offer_24;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VertifySquenceOfBST vertifySquenceOfBST = new VertifySquenceOfBST();
		int[] arr1 = {7,4,6,5};
		int[] arr2 = {5,7,6,9,11,10,8};
		boolean result1 = vertifySquenceOfBST.vertifySquenceOfBST(arr1,0,3);
		boolean result2 = vertifySquenceOfBST.vertifySquenceOfBST(arr2,0,6);
		System.out.println(result1);
		System.out.println(result2);
	}

}
