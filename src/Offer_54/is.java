package Offer_54;

public class is {
	static int i = 0;
	
	public static void main(String[] args) {
		String str1 = "+500";
		char[] str = str1.toCharArray();
		System.out.println(isNumeric(str));
	}
	public static boolean isNumeric(char[] str) {
        if(str == null || str.length ==0)
            return false;
        boolean numeric = true;
        if(str[i] =='+' || str[i] == '-'){
            i++;
        }
        scanNum(str);
        if(i<str.length){
            if(str[i] == '.'){
                i ++;
                if(i>=str.length) return numeric;
                scanNum(str);
                if(str[i] == 'e' || str[i] == 'E'){
                        numeric = is(str);
                }
            }else if(str[i] == 'e' || str[i] == 'E'){
                numeric = is(str);
            }else{
                numeric = false;
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
