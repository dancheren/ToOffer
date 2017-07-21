package Offer_66;

public class hasPath {
	public static boolean path(char[] matrix, int rows, int cols, char[] str) {
		boolean[] flag = new boolean[matrix.length];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (helper(matrix, rows, cols, i, j, str, 0, flag))
					return true;
			}
		}
		return false;
	}

	public static boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, boolean[] flag) {
		int index = i * cols + j;
		if (i < 0 || i >= rows || j < 0 || j >= cols || flag[index] || matrix[index] != str[k])
			return false;
		if (k == str.length - 1)
			return true;
		flag[index] = true;
		if (helper(matrix, rows, cols, i - 1, j, str, k + 1, flag)
				|| helper(matrix, rows, cols, i + 1, j, str, k + 1, flag)
				|| helper(matrix, rows, cols, i, j - 1, str, k + 1, flag)
				|| helper(matrix, rows, cols, i, j + 1, str, k + 1, flag))
			return true;
		flag[index] = false;
		return false;
	}

	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e' };
		char[] str = { 'b', 'c', 'c', 'e', 'd' };
		System.out.println(path(ch, 4, 3, str));
	}
}
