package Offer_20;

public class Main {

	public static void main(String[] args) {
		printMatrixClockWisely printMatrix = new printMatrixClockWisely();
		int[][] arr = {{1,2,3,4},
				       {5,6,7,8},
				       {9,10,11,12},
				       {13,14,15,16}};
		printMatrix.printMatrix(arr, 4, 4);
	}

}
