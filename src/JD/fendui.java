package JD;

import java.util.Scanner;
/*
 * 小明对于给定数量石头进行分堆，要求如下：
 * 1.每堆至少有一个石头；
 * 2.相邻两堆石头个数不同；
 * 3.所有石头均在堆中。给定总石头个数n，希望合理对石头分堆，使得大于等于k个石头的石头堆个数最多。
 * 
 * 理想情况为 k、k+1、k、k+1、k、k+1、k、k+1、。。。。排列，因此判断 n % (k+k+1) 是否大于等于k，
 * 如果大于k，则可以再分为一个堆，如果小于k，就只能将剩余的石头分别加到前面的石堆中
 */
public class fendui {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long n = sc.nextLong();
			int k = sc.nextInt();
			int x = (int) (n % (2*k+1));
			int y =  (int) (n / (2*k+1));
			if(x >= k){
				System.out.println(2*y+1);
			}else{
				System.out.println(2*y);
			}
			
		}
	}


}
