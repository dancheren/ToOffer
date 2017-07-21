package Offer_28;

import java.util.ArrayList;
import java.util.TreeSet;

public class Permutation {
	public ArrayList<String> Permutation(String str) {
		ArrayList<String> result = new ArrayList<String>();
		if (str == null)
			return result;
		char[] ch = str.toCharArray();
		TreeSet<String> treeSet = new TreeSet<>(); // ��TreeSet��ȥ����ͬ������
		help(ch, treeSet, 0, ch.length - 1);
		result.addAll(treeSet); // �����е�������ӵ�result��
		for(String s : result)
			System.out.print(s+" ");
		return result;
		
	}

	public void help(char[] ch, TreeSet<String> treeSet, int start, int end) {
		if (start == end) {
			String str = String.valueOf(ch);
			treeSet.add(str); // ����ǰ��һ�����мӵ�treeSet��
			return;
		} else {
			for (int i = start; i <= end; i++) {
				swap(ch, start, i); // ������start���ַ��͵�i���ַ�
				help(ch, treeSet, start + 1, end); // �̶�ǰstart���ַ��������ݹ����к���ʣ����ַ�
				swap(ch, start, i); // �������ַ�������
			}
		}
	}

	public void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
}
