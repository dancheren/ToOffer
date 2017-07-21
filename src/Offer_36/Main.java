package Offer_36;

public class Main {
	public static void main(String[] args) {   
		InversePairs inverse = new InversePairs();
		InversePair inverses = new InversePair();
		int array[] = { 1, 3, 11, 10, 7, 8, 2, 4, 6, 5 };
		int len = array.length;
		int count = inverse.inversePairs(array, len);
		int counts = inverses.inversePair(array, len);
		System.out.println(count);
		System.out.println(counts);

	}
}
