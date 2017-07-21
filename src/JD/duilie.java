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
     * ��˼·��������һ������ʱ���ͽ������ӷ�Χ�ڵ�С͵ץ����������С͵�滻����ͨ�ˣ�����������Ѱ�Ҿ���
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

	//�ֱ��¼С͵�ڶ����г��ֵ�λ�ã�T[i] = j,��ʾ��i��С͵�ڶ����е�λ��Ϊj����
	//�Լ��������ܼ��ӵ�����(P[k-n]~P[k+n] == 1������������ȫΪ1)��Ȼ���ж�P[T[i]] ==1,
	//���Ϊ1����λ���ϵ�С͵�ᱻץס��
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
