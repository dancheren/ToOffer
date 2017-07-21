package Offer_03;

public class Main {

	public static void main(String[] args) {
		Find f = new Find();
		int[][] arr = {{0,1,2,4},
				       {2,3,4,7},
				       {4,4,4,8},
				       {5,7,7,9}};
		boolean result = f.find(arr, 9);
		System.out.println(result);
	}

}
