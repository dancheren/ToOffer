package Offer_10_RelatedQuestion;
/*
 * �ж�һ�������ǲ���2�������η���
 *   ˼·��һ�����������2�������η�����ô���Ķ����Ʊ�ʾ������ֻ��һλ��1��1�������һλ����Ϊ���һλ��1��ʾ����1��������������λ����0.
 *       �����������ȥ1����ԭ���������������㣬��������е�1�ͻ���0.
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
    			   n = (n-1) & n;   //���n��2�������η���(n-1) & n ������ֵΪ0.
    		   }
    	   }
    	   return ans;
       }
}
