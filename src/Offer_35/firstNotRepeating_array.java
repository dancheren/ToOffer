package Offer_35;

public class firstNotRepeating_array {
    public void firstNotRepeating(String str){
    	if(str == null || str.equals(" ")){
    		return;
    	}
    	char[] ch = new char[256];     //����256���ַ����������ַ�Ԥ���ռ�
    	for(int i=0;i<str.length();i++){
    		ch[str.charAt(i)] ++;//ͳ��ÿ���ַ����ִ��� ��st.charAt(i)���ַ������±꣬ch[st.charAt(i)]��Ϊ���ִ���
    	}
    	for(int i=0;i<str.length();i++){
    		if(ch[str.charAt(i)] == 1){  //�����Ӧ���ַ�ֻ����һ�Σ������������ѭ��
    			System.out.println(str.charAt(i));
    			break;
    		}
    		if(ch[str.charAt(i)] != 1 && i == str.length()-1){//���û�г���ֻ��һ�ε��ַ������ .
    			System.out.println("û��ֻ����һ�ε��ַ���");
    		}
    	}
    }
}
