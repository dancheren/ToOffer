package Offer_10_RelatedQuestion;
/*
 * 输入两个整数，计算需要改变m的二进制表示中的多少位才能得到n。比如10的二进制表示为1010,13的二进制表示为1101，
 * 需要改变1010中的3位才能得到1101.
 *   分为两个步骤：
 *      1，求这两个数的异或；
 *      2，统计异或结果中1的个数。
 */
public class MtoNSame {
     public int mToN(int m,int n){
    	 NumberOf1 n1 = new NumberOf1();
    	 int result = 0;
    	 int ans = (m ^ n);   //先求m与n的异或
    	 result = n1.numberOf1(ans);   //统计二进制中1的个数
    	 return result;
     }
}
