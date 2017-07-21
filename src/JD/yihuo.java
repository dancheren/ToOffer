package JD;

import java.util.Scanner;

public class yihuo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String str1 = sc.next();
			String str2 = sc.next();
            int x = Integer.parseInt(str1, 2);
            int y = Integer.parseInt(str2, 2);
			System.out.println(x ^ y);

		}
	}

	public static int binTO10(String str1, String str2, int n) {
		if (str1.length() != n || str2.length() != n)
			return -1;
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < n; i++) {
			str.append((ch1[i] - '0') ^ (ch2[i] - '0'));
		}
		String st = str.toString();
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += ((int) st.charAt(i)) * (2^(n - 1 - i));
		}
		return result;
	}

}
