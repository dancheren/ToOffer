package Offer_35_RelatedQuestion;


/*
 *  ������������г��ֵĵ���ĸ��ͬ������ÿ����ĸ���ֵĴ���Ҳ��ͬ����ô���������ʻ�Ϊ����λ�ʡ������� listen �� silent��
 *     evil �� live��Ϊ��λ�ʡ�
 *  
 * ��һ������ʵ�ֵļ򵥹�ϣ����ͳ���ַ����е�ÿ���ַ����ֵĴ�������ɨ�赽��һ���ַ����е�ÿ���ַ�ʱ��Ϊ��ϣ���Ӧ��������1��
 * ������ɨ��ڶ����ַ�����ɨ�赽ÿ���ַ�ʱ��Ϊ��ϣ��������Ӧ�����1.���ɨ����ڶ����ַ����󣬹�ϣ�������е�ֵ����0��
 * ��ô�������ַ������ǻ�Ϊ��λ�ʡ�
 * 
 * 
 */
public class RelatedQueation3 {
    public boolean isAnagram(String str1,String str2){
    	char[] ch1 = new char[256];
    	boolean item = true;
    	for(int i=0;i<str1.length();i++){
    		ch1[str1.charAt(i)]++;
    	}
    	for(int i=0;i<str2.length();i++){
    		ch1[str2.charAt(i)]--;
    	}
    	for(int i=0;i<str1.length();i++){
    		if(ch1[str1.charAt(i)] != 0){
    			item = false;
    		}
    	}
    	return item;
    }
}
