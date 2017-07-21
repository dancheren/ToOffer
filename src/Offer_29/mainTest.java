package Offer_29;

public class mainTest {
	public static void main(String[] args) {
		//moreThanHalfNum m = new moreThanHalfNum();
		MoreThanHalfNum2 m2 = new MoreThanHalfNum2();
		int arr[] = { 2, 3, 3, 3, 3, 1, 5 };
		//System.out.println("More than half num is :" + m.MoreThanHalfNum(arr, arr.length));
		System.out.println("---------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("---------------------------");
		//调用MoreThanHalfNum2的MoreThanHalfNum方法不会修改原数组的顺序
		System.out.println("More than half num is :" +m2.MoreThanHalfNum(arr, arr.length));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
