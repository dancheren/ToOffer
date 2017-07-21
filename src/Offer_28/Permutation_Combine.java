package Offer_28;

import java.util.Stack;
import java.util.TreeSet;

public class Permutation_Combine {
	/*
	 * 字符串的组合 给一个字符串，比如ABC， 把所有的组合，即：A, B, C, AB, AC, BC, ABC, 都找出来。 解题思路：
	 * 假设我们想在长度为n的字符串中求m个字符的组合。我们先从头扫描字符串的第一个字符。
	 * 针对第一个字符，我们有两种选择：一是把这个字符放到组合中去，接下来我们需要在剩下的n-1个字符中选取m-1个字符；
	 * 二是不把这个字符放到组合中去，接下来我们需要在剩下的n-1个字符中选择m个字符。这两种选择都很容易用递归实现。
	 */

	// 求出所有的组合
	private TreeSet<String> set = new TreeSet<>();

	public void combiantion1(char[] chars) {
		if (chars.length == 0)
			return;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 1; i <= chars.length; i++) {
			combine(chars, 0, i, stack); // 从第0位置起取i个字符
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
		combine(chars, start + 1, number - 1, stack); // 从start+1位置起取
														// number-1个字符
		stack.pop();
		combine(chars, start + 1, number, stack);

	}
}
