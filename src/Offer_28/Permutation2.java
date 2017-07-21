package Offer_28;


public class Permutation2 {
	/*
	 * 字符串的排列 给一个字符串，比如ABC， 把所有的排列，即：ABC, ACB, BAC, BCA, CAB, CBC 都找出来。 解题思路：
	 * 对于一个n 位的字符串来讲，它是n-1位字符串的排列 加上 没有在 n -1 位字符串里 那个字符 的排列。 有点难理解，用例子说明：
	 * 对于字符串ABC来讲，它所有的排列就是 A + BC 的排列 加上 B + AC 的排列，再加上 C + AB的排列。 而BC的排列是 B + C
	 * 的排列 加上 C + B 的排列。 所以，对一个字符串，我们从中去一个值，然后求剩余部分的排列，然后把它们再组合在一起
	 */
	public void permutation(char[] arr, int start, int end) {
		if (start == end) { // 到了末尾，将排好序的字符串打印出来
			for (int i = 0; i <= end; i++) {
				System.out.print(arr[i]);
			}
			System.out.println("");
		} else {
			for (int i = start; i <= end; i++) { // 固定第一个字符不动
				char temp = arr[start]; // 第一次start=1,i=1
										// 排列时都是自己跟自己交换位置，当i=2时，第一个字符跟第二个字符交换位置
				arr[start] = arr[i];
				arr[i] = temp;
				permutation(arr, start + 1, end); // 对第二个字符开始排列，递归对后面的字符串进行排列
				temp = arr[start]; // 后面字符串排列结束后恢复为排列之前的顺序
				arr[start] = arr[i];
				arr[i] = temp;
			}
		}

	}
}
