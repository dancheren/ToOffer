package Offer_35;

public class firstNotRepeating_array {
    public void firstNotRepeating(String str){
    	if(str == null || str.equals(" ")){
    		return;
    	}
    	char[] ch = new char[256];     //共有256个字符，给所有字符预留空间
    	for(int i=0;i<str.length();i++){
    		ch[str.charAt(i)] ++;//统计每个字符出现次数 ，st.charAt(i)即字符数组下标，ch[st.charAt(i)]即为出现次数
    	}
    	for(int i=0;i<str.length();i++){
    		if(ch[str.charAt(i)] == 1){  //如果对应的字符只出现一次，则输出并结束循环
    			System.out.println(str.charAt(i));
    			break;
    		}
    		if(ch[str.charAt(i)] != 1 && i == str.length()-1){//如果没有出现只有一次的字符，输出 .
    			System.out.println("没有只出现一次的字符！");
    		}
    	}
    }
}
