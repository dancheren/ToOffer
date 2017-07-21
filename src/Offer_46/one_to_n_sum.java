package Offer_46;

public class one_to_n_sum {

	public static void main(String[] args) {
           System.out.println(oneton(10));
	}

	public static int oneton(int n) {
		int sum = n;
		boolean result = (n > 0 && (sum += oneton(n - 1)) > 0);
		return sum;
	}

}
