package Offer_35_RelatedQuestion;
/*
 * ɾ���ַ����������ظ����ֵ��ַ����������롰google����ɾ���ظ����ַ�֮��Ľ���ǡ�gole����
 */
public class RelatedQueation2 {
    public String deleteRepeatintCharacter(String str){
    	StringBuffer result = new StringBuffer();
    	boolean[] ch = new boolean[256];
    	for(int i=0;i<ch.length;i++){
    		ch[i] = false;
    	}
    	for(int i=0;i<str.length();i++){
    		if(ch[str.charAt(i)] == false){
    			result.append(str.charAt(i));
    			ch[str.charAt(i)] = true;
    		}
    	}
    	return result.toString();
    }
}

/*   ����һ�ֽⷨ
public class StringCtrl {
    public static void main(String[] args){
        String s = "ajjbaacsa";
        StringCtrl sctrl = new StringCtrl();
        System.out.println(sctrl.rmRepeated(s));
    }
    /*
     * ����ַ������ظ���ĸ�㷨
     *
    String rmRepeated(String s){
        int len = s.length();
        int k = 0;
        int count = 0;
        String str = "";
        char[] c = new char[len];
        for(int i=0;i<len;i++){
            c[i] = s.charAt(i);
        }
        for(int i=0;i<len;i++){
                k=i+1;
                while(k<len-count){
                if(c[i]==c[k]){
                    for(int j=k;j<len-1;j++){
                    c[j] = c[j+1];//�����ظ���ĸ����kλ�ÿ�ʼ��������ǰŲλ
                    }
                    count++;//�ظ���ĸ���ֵĴ���
                    k--;
                }
                k++;
                }
             
            }
        for(int i=0;i<len-count;i++){
             str+=String.valueOf(c[i]);
        }
        return str;
         
    }
}
*/