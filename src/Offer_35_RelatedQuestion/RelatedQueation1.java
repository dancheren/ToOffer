package Offer_35_RelatedQuestion;

/*
 * ���������ַ������ӵ�һ���ַ�����ɾ���ڵڶ����ַ����г��ֹ��������ַ�
 * 
 *   1. �����������Ŵ��Ƚϵ��ַ���������һ��boolean��������ʼֵ��Ϊfalse,����������������ͬ���ַ�ʱ����Ϊtrue��
 *   2. ���Ϊfalse,��char1�е��ַ��洢����ʱ�����У���󷵻���ʱ����
 *   
 *   
 *    ��javaдɾ��һ���ַ���������һ���ַ�������ͬ�ַ��Ĵ���Ļ���˼���ǣ�

        (1)�Ӽ����зֱ����������ַ�����Ȼ����tocharArray()�������ַ���ת��Ϊ�ַ����飬

        (2)Ȼ���������ַ�������������趨һ��boolean���͵ı�����Ĭ��ֵΪfalse,

              (3)�ڱ����Ĺ����У���������е������ַ���ȣ���ѱ�����Ϊtrue��

         (4)һ���ֱ�����һ���ַ����е��ַ����бȽϣ�������ؽ����δfalse

                (5)�������ַ���ӵ�һ���յ��ַ�������ȥ���������߸��ַ����鼴�ɡ�
 */

public class RelatedQueation1 {
	public void deleteCharacter(String s1, String s2) {
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		char[] char3 = new char[char1.length];//����ʱ����Ĵ�С����Ϊ ��ɾ������Ĵ�С����Ϊchar2 �е��ַ���char1�в�����
		int i = 0;
		for (char ch1 : char1) {
			boolean item = false;
			for (char ch2 : char2) {   //ʱ�临�Ӷ�ΪO��n^2��  �ռ临�Ӷ�ΪO��n��
				if (ch1 == ch2) {
					item = true;
				}
			}
			if (!item)
				char3[i++] = ch1;
		}
		for(int j=0;j<char3.length;j++){
			System.out.print(char3[j]+" ");
		}
	}
	
	/*
	 * ������ʵ�ּ򵥹�ϣ��
	 *   ����һ������ʵ�ֵĹ�ϣ�����洢�ڶ����ַ��������Ǵ�ͷ��βɨ���һ���ַ�����ÿһ���ַ�ʱ��
	 *   ��O��1��ʱ������ж������ַ��ǲ����ڵڶ����ַ����С�
	 */
	public void deleteCharacter2(String str1,String str2){
		int[] ch1 = new int[256];    //�ռ临�Ӷ�ΪO��1��
		StringBuilder str = new StringBuilder();   //�ڷ������ڶ�����ַ���������StringBuilder
		for(int i=0;i<str2.length();i++){      //ʱ�临�Ӷ�ΪO��n��
			ch1[str2.charAt(i)]++;
		}
		for(int i=0;i<str1.length();i++){
			if(ch1[str1.charAt(i)] < 1){
				str.append(str1.charAt(i));
			}
		}
		System.out.println(str.toString());
  }
}