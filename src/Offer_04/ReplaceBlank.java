package Offer_04;
/*
 * �滻�ո�
 *    ˼·���ȱ����ַ����飬�������еĿո������Ȼ������滻�������ĳ��ȣ��½�һ���ַ����飬��������ָ�룬һ��ָ��
 *         ԭ�����ĩβ��һ��ָ���������ĩβ��ͬʱ��ǰ�ƶ����������ո�ʱ�����������м�����滻���ַ���������ǿո�
 *         �ͽ�ԭ�����е��ַ����Ƶ��������У�ͬʱ��ǰ�ƶ�ָ�롣ֱ������ָ���غϣ�������ǰ�滹���ַ�û�и��ƣ���
 *         ʣ����ַ����Ƶ��������С�������
 *      
 */
public class ReplaceBlank {
	public void replaceBlank(String str) {
        if(str == null)
        	return ;
        char[] chars = str.toCharArray();
        int num = 0;
        int originalLength = str.length();
        for(int i =0;i<chars.length;++ i){
        	if(chars[i] == ' ' ){
        		++ num;
        	}
        }
        int newLength = originalLength + num * 2;
        char[] temp = new char[newLength];
        //System.arraycopy(chars, 0, temp, 0, originalLength);
        int indexOfOriginal = originalLength -1;
        int indexNew = newLength -1;
        while(indexOfOriginal >= 0 && indexNew > indexOfOriginal){
        	if(chars[indexOfOriginal] == ' '){
        		temp[indexNew --] = '0';
        		temp[indexNew --] = '2';
        		temp[indexNew --] = '%';
        	}else{
        		temp[indexNew --] = chars[indexOfOriginal];
        	}
        	-- indexOfOriginal;
        }
        while(indexOfOriginal >= 0){    //������ָ���ص���ָ��ǰ����ַ����Ƶ����ַ�������
    		temp[indexNew --] = chars[indexOfOriginal];
    		-- indexOfOriginal;
        }
        print(temp);
	}
	public void print(char[] chars){
		for(char c : chars){
			System.out.print(c);
		}
	}
}
