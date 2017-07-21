package JD;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 题目所求为公司的利益最大化，公司的利益最大化是指公司能够卖出的总金额。公司根据客户的出价，
 * 选出一个能让公司利益最大化的要价，公司选定一个要价后，客户出价低于公司要价的人则不能购买该产品，
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
		Arrays.sort(prices);    //将客户的出价进行从小到大排序，
		int found = prices.length - 1;
		int maxs = prices[found];
		int low = 0;
		if(prices.length > n)      
			low = prices.length - n;  //如果数组长度大于 n ，则从 low 位置开始
		for (int i = prices.length - 2; i >= low; i--) {
			int temp = prices[i] * (prices.length - i);// 公司总收入为当前要价乘以大于该要价的总客户
			if (temp >= maxs) {
				maxs = temp;
				found = i;
			}
		}
		return prices[found];   //返回公司利益最大的客户出价值
	}

}
