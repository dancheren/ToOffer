package Offer_10_RelatedQuestion;
/*
 * ��������������������Ҫ�ı�m�Ķ����Ʊ�ʾ�еĶ���λ���ܵõ�n������10�Ķ����Ʊ�ʾΪ1010,13�Ķ����Ʊ�ʾΪ1101��
 * ��Ҫ�ı�1010�е�3λ���ܵõ�1101.
 *   ��Ϊ�������裺
 *      1�����������������
 *      2��ͳ���������1�ĸ�����
 */
public class MtoNSame {
     public int mToN(int m,int n){
    	 NumberOf1 n1 = new NumberOf1();
    	 int result = 0;
    	 int ans = (m ^ n);   //����m��n�����
    	 result = n1.numberOf1(ans);   //ͳ�ƶ�������1�ĸ���
    	 return result;
     }
}
