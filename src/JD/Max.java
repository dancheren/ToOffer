package JD;

import java.util.Arrays;
import java.util.Scanner;
/*
 * ��Ŀ����Ϊ��˾��������󻯣���˾�����������ָ��˾�ܹ��������ܽ���˾���ݿͻ��ĳ��ۣ�
 * ѡ��һ�����ù�˾������󻯵�Ҫ�ۣ���˾ѡ��һ��Ҫ�ۺ󣬿ͻ����۵��ڹ�˾Ҫ�۵������ܹ���ò�Ʒ��
 */
public class Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] prices = new int[m];
			for (int i = 0; i < m; i++) {
				prices[i] = sc.nextInt();
			}
			System.out.println(max(prices, n));
		}
	}

	public static int max(int[] prices, int n) {
		if (prices == null || prices.length<1)
			return -1;
		Arrays.sort(prices);    //���ͻ��ĳ��۽��д�С��������
		int found = prices.length - 1;
		int maxs = prices[found];
		int low = 0;
		if(prices.length > n)      
			low = prices.length - n;  //������鳤�ȴ��� n ����� low λ�ÿ�ʼ
		for (int i = prices.length - 2; i >= low; i--) {
			int temp = prices[i] * (prices.length - i);// ��˾������Ϊ��ǰҪ�۳��Դ��ڸ�Ҫ�۵��ܿͻ�
			if (temp >= maxs) {
				maxs = temp;
				found = i;
			}
		}
		return prices[found];   //���ع�˾�������Ŀͻ�����ֵ
	}

}
