package JD;

import java.util.Scanner;

public class duilie {
	public static void main(String[] rags) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String str = sc.next();
			System.out.println(findTheif(str));
		}
	}
    /*
     * 简单思路：当发现一个警察时，就将他监视范围内的小偷抓出来，并将小偷替换成普通人，继续向后遍历寻找警察
     */
	public static int findThrif(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		int len = ch.length;
		for (int i = 0; i < len; i++) {
			if (ch[i] - '0' >= 0 && ch[i] - '0' <= 9) {
				for (int j = i; j < len && j <= i + (ch[i] - '0'); j++) {
					if (ch[j] == 'X') {
						count++;
						ch[j] = '#';
					}
				}

				for (int j = i; j >= 0 && j >= i - (ch[i] - '0'); j--) {
					if (ch[j] == 'X') {
						count++;
						ch[j] = '#';
					}
				}
			}
		}
		return count;
	}

	//分别记录小偷在队列中出现的位置（T[i] = j,表示第i个小偷在队列中的位置为j），
	//以及警察所能监视的区域(P[k-n]~P[k+n] == 1即所监视区域全为1)，然后判断P[T[i]] ==1,
	//如果为1，该位置上的小偷会被抓住，
	public static int findTheif(String str) {
		int count = 0;
		if (str == null)
			return count;
		char[] ch = str.toCharArray();
		int n = ch.length;
		int[] T = new int[n + 1];
		int[] P = new int[n];
		int m = 1;
		for (int i = 0; i < n; i++) {

			if (ch[i] == 'X') {
				T[m++] = i;
			} else {
				T[m++] = -1;
			}
		}
		for (int i = 0; i < n; i++) {
			if ((ch[i] - '0') >= 0 && (ch[i] - '0') <= 9) {
				for (int j = i + 1; j < n && j <= i + (ch[i] - '0'); j++) {
					P[j] = 1;
				}
				for (int j = i - 1; j >= 0 && j >= (i - (ch[i] - '0')); j--) {
					P[j] = 1;
				}
			}
		}

		int k = 1;
		while (k < T.length) {
			if (T[k] != -1) {
				if (P[T[k]] == 1) {
					count++;
				}
			}
			k++;
		}
		return count;
	}
}
