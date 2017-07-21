package JD;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		input.nextInt();
		String line = input.next();
		System.out.print(findThief(line));
	}

	private static int findThief(String str) {
		int count = 0;
		char[] chars = str.toCharArray();

		for (int j = 0; j < chars.length; j++) {
			if ((chars[j] >= '1') && (chars[j] <= '9')) {
				for (int k = j; k <= j + (chars[j] - '0'); k++) {
					if (k > chars.length - 1)
						break;
					if (chars[k] == 'X') {
						count++;
						chars[k] = '#';
					}
				}

				for (int k = j; k >= j - (chars[j] - '0'); k--) {
					if (k < 0)
						break;
					if (chars[k] == 'X') {
						count++;
						chars[k] = '#';
					}
				}
			}

		}

		return count;
	}
}
