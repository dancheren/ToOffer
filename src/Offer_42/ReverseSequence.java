package Offer_42;

/*
 * 题目：翻转单词顺序       VS   左旋转字符串
 *     翻转单词顺序，不翻转单词内部的顺序
 *     左旋转字符串是将前面若干个字符移动到字符串末尾
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
		// 翻转所有的字符
		reverse(data, start, end);

		start = end = 0;  //end往后移动直到遇到空格或者到字符串末尾加1时，将前面的字符串翻转
		while (end < data.length) {
			if (data[start] == ' ') { //首尾如果是空格，不用翻转
				start++;
				end++;
			}
			if (data[end] == ' ' || end == data.length) {
				reverse(data, start, --end); //将start~end的字符串翻转过来
				start = ++end;   //翻转后将start end置于空格后第一个字符上
			} else {
				end++;   //如果还没到空格或者字符串末尾加1位置，将end往后移动
			}
		}
		for (char ch : data) {
			System.out.print(ch);   //将反转完毕后的字符串打印出来
		}
	}
}
