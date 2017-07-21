package Offer_44;

import java.util.Arrays;

/*
 * ���˿����������ȡ5���ƣ��ж��ǲ���һ��˳�ӣ�AΪ1��J��Q��K�ֱ�Ϊ11,12,13��ʾ���������Կ��������������
 */
public class IsContinuous {

	public static void main(String[] args) {
		int[] data = { 0, 0, 0, 0, 1 };
		boolean result = isContinuous(data);
		System.out.println(result);
		
	}

	 public static boolean isContinuous(int [] numbers) {
	      
	        int n = numbers.length;
	        if(numbers == null || n == 0)
	            return false;
	        Arrays.sort(numbers);
	        int zero = 0;
	        int gap = 0;
	        for(int i=0;i<n && numbers[i] == 0;i++){
	             zero ++;        //ͳ��0�ĸ���
	        }
	           
	        for(int i=zero+1;i<n;i++){    //�ӷ�0�ĵڶ�������ʼͳ�Ƽ���ĸ���
	            if(numbers[i] == numbers[i-1] && numbers[i] != 0)
	                return false;
	            gap += numbers[i] - numbers[i-1]-1;
	            
	        }
	        if(zero>=gap)
	           return true;
	        else
	           return false;
	    }
	 
	
	 
	 public String LeftRotateString(String str,int n) {
	        if(str == null || n==0)
	            return str;
	        StringBuilder s1 = new StringBuilder();
	        StringBuilder s2 = new StringBuilder();
	        for(int i=0;i<n;i++){
	            s1.append(str.charAt(i));
	        }
	        for(int i=n;i<str.length();i++){
	            s2.append(str.charAt(i));
	        }
	        String str1 = s1.toString();
	        String str2 = s2.toString();
	        String res1 = ReverseSentence(str1);
	        String res2 = ReverseSentence(str2);
	        String res = ReverseSentence(res1+res2);
	        return res;

	    }
	    
	    public String ReverseSentence(String str) {
	         if(str == null || str.length() == 0)
	             return null;
	         char[] c = str.toCharArray();
	        int start = 0;
	        int end = c.length-1;
	        while(start<end){
	            char temp = c[start];
	            c[start] = c[end];
	            c[end] = temp;
	            start ++;
	            end --;
	        }
	        String res = String.valueOf(c);
	        return res;
	     }
}
