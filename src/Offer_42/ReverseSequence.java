package Offer_42;

/*
 * ��Ŀ����ת����˳��       VS   ����ת�ַ���
 *     ��ת����˳�򣬲���ת�����ڲ���˳��
 *     ����ת�ַ����ǽ�ǰ�����ɸ��ַ��ƶ����ַ���ĩβ
 */
public class ReverseSequence {

	public static void main(String[] args) {
		String str = "I am a student";
		char[] ch = str.toCharArray();
		reverseSequence(ch);
	}

	public static void reverse(char[] data, int start, int end) {
		if (data == null || start > end) {
			return;
		}
		while (start < end) {
			char temp = data[end];
			data[end] = data[start];
			data[start] = temp;
			start++;
			end--;
		}
	}

	public static void reverseSequence(char[] data) {
		if (data == null || data.length < 1) {
			return;
		}
		int start = 0;
		int end = data.length - 1;
		// ��ת���е��ַ�
		reverse(data, start, end);

		start = end = 0;  //end�����ƶ�ֱ�������ո���ߵ��ַ���ĩβ��1ʱ����ǰ����ַ�����ת
		while (end < data.length) {
			if (data[start] == ' ') { //��β����ǿո񣬲��÷�ת
				start++;
				end++;
			}
			if (data[end] == ' ' || end == data.length) {
				reverse(data, start, --end); //��start~end���ַ�����ת����
				start = ++end;   //��ת��start end���ڿո���һ���ַ���
			} else {
				end++;   //�����û���ո�����ַ���ĩβ��1λ�ã���end�����ƶ�
			}
		}
		for (char ch : data) {
			System.out.print(ch);   //����ת��Ϻ���ַ�����ӡ����
		}
	}
}
