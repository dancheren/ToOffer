package Offer_22;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		isPopOrder order = new isPopOrder();
		int[] arr1 ={1,2,3,4,5};
		int[] arr2 = {4,5,3,1,2};
        boolean ans = order.isOrder(arr1, arr2);
        System.out.println(ans);
	}

}
