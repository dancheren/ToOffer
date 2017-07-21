package Offer_33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrintMinNumber {
	
	public static void main(String[] args){
		int[] numbers = {3,32,321};
		System.out.println(printMinNumber(numbers));
		
	}
	public static String printMinNumber(int[] numbers) {
		String[] s = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			s[i] = String.valueOf(numbers[i]);
		}
		List<String> list = new ArrayList<>();
		for (String ss : s) {
			list.add(ss);
		}
		String result = "";

		Collections.sort(list, new Comparator<String>() {
			public int compare(String s1, String s2) {
				String s3 = s1 + s2;
				String s4 = s2 + s1;
				return s3.compareTo(s4);
			}
		});
		for (String sss : list)
			result += sss;
		return result;
	}
}
