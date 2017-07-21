package Offer_28_RelatedQuestion;

public class EightQueens {
	private int number = 0;

	public void eightQueen() {
		int queen = 8;
		int[] columnsIndex = new int[queen];
		for(int i=0;i<queen;i++){
			columnsIndex[i] = i;
		}
		int index = 0;
		number = select(columnsIndex, queen, index);
		System.out.println("The total number is: "+ number);
	}

	public int select(int[] columnsIndex, int queen, int index) {
		if (index == queen - 1) {
			if (check(columnsIndex, queen)) {
				number++;
				for (int i = 0; i < columnsIndex.length; i++) {
					System.out.print(columnsIndex[i] + " ");
				}
				System.out.println("");
			}
		} else {
			for (int i = index; i < queen; i++) {
				int temp = columnsIndex[index];
				columnsIndex[index] = columnsIndex[i];
				columnsIndex[i] = temp;
				select(columnsIndex, queen, index + 1);
				temp = columnsIndex[index];
				columnsIndex[index] = columnsIndex[i];
				columnsIndex[i] = temp;
			}
		}
		return number;
	}

	public boolean check(int[] columnsIndex, int queen) {
		for (int i = 0; i < queen; i++) {
			for (int j = i + 1; j < queen; j++) {
				if (i - j == columnsIndex[i] - columnsIndex[j] || j - i == columnsIndex[i] - columnsIndex[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
