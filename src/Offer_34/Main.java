package Offer_34;

public class Main {
	public static void main(String[] args) {
		Ugly ugly1 = new Ugly();
		UglyNumber ugly = new UglyNumber();
		int ans = ugly.getUglyNumber(1500);
		int ans1 = ugly1.ugly(1500);
		System.out.println(ans);
		System.out.println(ans1);

		ugly1 u1 = new ugly1();
		System.out.println(u1.ugly(1500));
	}
}
