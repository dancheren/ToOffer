package Offer_28;

import java.util.ArrayList;
import java.util.TreeSet;

public class Permutation {
	public ArrayList<String> Permutation(String str) {
		ArrayList<String> result = new ArrayList<String>();
		if (str == null)
			return result;
		char[] ch = str.toCharArray();
		TreeSet<String> treeSet = new TreeSet<>(); // 用TreeSet来去除相同的排列
		help(ch, treeSet, 0, ch.length - 1);
		result.addAll(treeSet); // 将所有的排列添加到result中
		for(String s : result)
			System.out.print(s+" ");
		return result;
		
	}

	public void help(char[] ch, TreeSet<String> treeSet, int start, int end) {
		if (start == end) {
			String str = String.valueOf(ch);
			treeSet.add(str); // 将当前的一个排列加到treeSet中
			return;
		} else {
			for (int i = start; i <= end; i++) {
				swap(ch, start, i); // 交换第start个字符和第i个字符
				help(ch, treeSet, start + 1, end); // 固定前start个字符，继续递归排列后面剩余的字符
				swap(ch, start, i); // 将两个字符换回来
			}
		}
	}

	public void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
}
