package Offer_35;

public class firstNotRepeating_array1 {
	public void firstNotRepeating_array(String str) {
		if (str == null)
			return ;
		int[] temp = new int[255];
		int len = str.length();
		for (int i = 0; i < len; ++i) {
			temp[str.charAt(i)]++;
		}
		for (int i = 0; i < len; ++i) {
			if (temp[str.charAt(i)] == 1) {
				System.out.println(str.charAt(i));
				break;
			}else if(temp[str.charAt(i)] != 1 && i == len-1){
				System.out.println("error");
			}
		}
	}
}
