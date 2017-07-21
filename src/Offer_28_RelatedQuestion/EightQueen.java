package Offer_28_RelatedQuestion;

public class EightQueen {
	private int number = 0;

	public void eightQueen() {
		int queens = 8;
		int[] columnIndex = new int[queens];
		for (int i = 0; i < queens; i++) {   
			columnIndex[i] = i;    //�����е�i�����ֱ�ʾ��i�лʺ����ڵ��к�
		}
		permutation(columnIndex, queens, 0);
		System.out.println("The total ways is :"+number);
	}

	/**
 * 
 * @param columnIndex    ����������
 * @param queens         �ʺ�ĸ���
 * @param index          ��ǰ�ʺ����ڵ���
 * @return               �������лʺ�ڷ��������������и���
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
		return number;     //һ����92 �в�ͬ�İڷ���
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
				if (i - j == columnIndex[i] - columnIndex[j] || // �������ͬһ�Խ����ϣ��򲻷���
						j - i == columnIndex[i] - columnIndex[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
