package Offer_35;



public class Main {

	public static void main(String[] args) {
		//≤‚ ‘firstNotRepeating¿‡
		firstNotRepeating f = new firstNotRepeating();
		char ans = f.firstNotRepeat("acbdfgeavnedx");
		System.out.println(ans);
       
		//≤‚ ‘  firstNotRepeating_array¿‡
		firstNotRepeating_array f1 = new firstNotRepeating_array();
		f1.firstNotRepeating("abacbdefde");
		
		//≤‚ ‘firstNotRepeating_array1
		firstNotRepeating_array1 f11 = new firstNotRepeating_array1();
		f11.firstNotRepeating_array("abaccbdeffde");
	}

}
