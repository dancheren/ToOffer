package Offer_10_RelatedQuestion;
/*
 * 判断一个整数是不是2的整数次方。
 *   思路：一个整数如果是2的整数次方，那么他的二进制表示中有且只有一位是1（1不在最后一位，因为最后一位是1表示整数1），而其他所有位都是0.
 *       把这个整数减去1后与原来的整数做与运算，这个整数中的1就会变成0.
 */
public class is2sqrt {
       public boolean Is2sqrt(int n){
    	   boolean ans = false;
    	   if(n == 1 || (n % 2) != 0){
    		   return ans;
    	   }
    	   while(n!=0){
    		   if(((n-1) & n) == 0){
    			   ans = true;
    			   n = (n-1) & n;   //如果n是2的整数次方，(n-1) & n 操作后值为0.
    		   }
    	   }
    	   return ans;
       }
}
