package Offer_24_RelatedQuestion;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VertifySquenceOfFST vertifySquenceOfFST = new VertifySquenceOfFST();
		int[] arr = {8,5,6,3,12};
		boolean result = vertifySquenceOfFST.vertifySquenceOfFST(arr,0,4);
		System.out.println(result);
	}

}
