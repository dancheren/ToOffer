package Offer_42;

/*
 * ����ת�ַ���,���ַ������n�������ƶ����ַ���ĩβ
 *    ˼·���Ƚ�ǰ���n���ַ���ת�������ٽ�����ʣ����ַ���ת������������е��ַ���ת����
 */
    
import java.util.*;
public class LeftRotateString {

	/*public static void main(String[] args) {
      String str = "abcdefg";
      char[] ch = str.toCharArray();
      leftRotateString(ch, 8);
	}*/
	
	public static void leftRotateString(char[] ch,int n){
		if(ch == null || ch.length <1 || n > ch.length){
			System.out.println("error");
			return ;
		}
		int len = ch.length;
		reverse(ch,0,n-1);   //�Ƚ�ǰ��n���ַ���ת����
		reverse(ch,n,len-1);  //�ٽ�������ַ���ת����
		reverse(ch,0,len-1);   //�����е��ַ���ת����
		
		for(char c: ch){
			System.out.print(c);
		}
	}
	
	public static void reverse(char[] data, int start, int end) {
		if (data == null || start > end) {
			return;
		}
		while (start < end) {
			char temp = data[end];
			data[end] = data[start];
			data[start] = temp;
			start++;
			end--;
		}
	}
	
	
}
