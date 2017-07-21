package Offer_54;

//public class IsNumeric {
//	static int i = 0;
//	public static void main(String[] args) {
//      String str = "+1.4e-1.2";
//      char[] ch = str.toCharArray();
//      System.out.println(isNumeric(ch));
//	}
//  
	public class IsNumeric {
		static int i = 0;
		public static void main(String[] args) {
	      String str = "+500";
	      char[] ch = str.toCharArray();
	      System.out.println(isNumeric(ch));
		}
	    public static boolean isNumeric(char[] str) {
	        if(str == null)
	            return false;
	        boolean numeric = true;
	        if(str[i] =='+' || str[i] == '-'){
	            i++;
	        }
	        scanNum(str);
	        if(i<str.length){
	            if(str[i] == '.'){
	                i ++;
	                scanNum(str);
	                if(str[i] == 'e' || str[i] == 'E'){
	                    numeric = is(str);
	                }
	            }else if(str[i] == 'e' || str[i] == 'E'){
	                numeric = is(str);
	            }
	        }
	        return numeric;
	    }
	    public static void scanNum(char[] str){
	        while(i<str.length && (str[i] -'0') >=0 && (str[i] - '0') <= 9){
	            i++;
	        }
	    }
	    
	    public static boolean is(char[] str){
	        if(str[i] != 'e' && str[i] != 'E'){
	            return false;
	        }
	        i ++;
	        if(str[i] == '+' || str[i] == '-'){
	            i++;
	        }
	        if(i>str.length)
	            return false;
	        scanNum(str);
	        return (i>=str.length)?true:false;
	    }
	}

