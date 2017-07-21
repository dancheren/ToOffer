package Offer_49;

public class strToInt {
	 public int StrToInt(String str) {
	        char[] ch = str.toCharArray();
	        int f=0;
	        if(ch == null)
	        	return 0;
	        if(ch[0] == '0' && ch.length == 1)
	            return 0;
	        if(ch[f] == '-')
	            f = 1;
	        int result = 0;
	        for(int i=f;i<ch.length;i++){
	            if((ch[i]-'0')>=0 && (ch[i]-'0')<=9)
	                result = result * 10 + (ch[i]-'0');
	            else{
	                result = 0;
	                break;
	            }
	        }
	            return f==0?result:result*-1;
	    }
}
