package Offer_44;

import java.util.Arrays;

/*
 * 从扑克牌中随机抽取5张牌，判断是不是一个顺子，A为1，J、Q、K分别为11,12,13表示，大王可以看成是任意的数字
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
	             zero ++;        //统计0的个数
	        }
	           
	        for(int i=zero+1;i<n;i++){    //从非0的第二个数开始统计间隔的个数
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
