package Offer_28_RelatedQuestion;

public class EightQueen {
	private int number = 0;

	public void eightQueen() {
		int queens = 8;
		int[] columnIndex = new int[queens];
		for (int i = 0; i < queens; i++) {   
			columnIndex[i] = i;    //数组中第i个数字表示第i行皇后所在的列号
		}
		permutation(columnIndex, queens, 0);
		System.out.println("The total ways is :"+number);
	}

	/**
 * 
 * @param columnIndex    给定的数组
 * @param queens         皇后的个数
 * @param index          当前皇后所在的行
 * @return               返回所有皇后摆放满足条件的排列个数
 */
	private  int permutation(int[] columnIndex, int queens, int index) {
		if (index == queens - 1) {
			if (check(columnIndex, queens)) {
				++ number;
				print(columnIndex, queens);
			}

		} else {
			for (int j = index; j < queens; j++) {
				int temp = columnIndex[index];
				columnIndex[index] = columnIndex[j];
				columnIndex[j] = temp;

				permutation(columnIndex, queens, index + 1);

				temp = columnIndex[index];
				columnIndex[index] = columnIndex[j];
				columnIndex[j] = temp;
			}
		}
		return number;     //一共有92 中不同的摆法；
	}

	private  void print(int[] columnIndex, int queens) {
		for (int i = 0; i < queens; i++) {
			System.out.print(columnIndex[i] + " ");
		}
		System.out.println("");
	}

	private boolean check(int[] columnIndex, int queens) {
		for (int i = 0; i < queens; i++) {
			for (int j = i + 1; j < queens; j++) {
				if (i - j == columnIndex[i] - columnIndex[j] || // 如果处在同一对角线上，则不符合
						j - i == columnIndex[i] - columnIndex[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
