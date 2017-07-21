package Offer_28;

import java.util.Stack;
import java.util.TreeSet;

public class Permutation_Combine {
	/*
	 * �ַ�������� ��һ���ַ���������ABC�� �����е���ϣ�����A, B, C, AB, AC, BC, ABC, ���ҳ����� ����˼·��
	 * �����������ڳ���Ϊn���ַ�������m���ַ�����ϡ������ȴ�ͷɨ���ַ����ĵ�һ���ַ���
	 * ��Ե�һ���ַ�������������ѡ��һ�ǰ�����ַ��ŵ������ȥ��������������Ҫ��ʣ�µ�n-1���ַ���ѡȡm-1���ַ���
	 * ���ǲ�������ַ��ŵ������ȥ��������������Ҫ��ʣ�µ�n-1���ַ���ѡ��m���ַ���������ѡ�񶼺������õݹ�ʵ�֡�
	 */

	// ������е����
	private TreeSet<String> set = new TreeSet<>();

	public void combiantion1(char[] chars) {
		if (chars.length == 0)
			return;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 1; i <= chars.length; i++) {
			combine(chars, 0, i, stack); // �ӵ�0λ����ȡi���ַ�
		}
		for (String s : set) {
			System.out.print(s + " ");
		}
	}

	public void combine(char[] chars, int start, int number, Stack<Character> stack) {
		if (number == 0) {
			set.add(String.valueOf(stack));
			// System.out.println(stack.toString());
			return;
		}
		if (start == chars.length)
			return;
		stack.push(chars[start]);
		combine(chars, start + 1, number - 1, stack); // ��start+1λ����ȡ
														// number-1���ַ�
		stack.pop();
		combine(chars, start + 1, number, stack);

	}
}
