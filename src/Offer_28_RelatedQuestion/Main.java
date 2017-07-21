package Offer_28_RelatedQuestion;

public class Main {
	public static void main(String[] args) {
		CubVertex cub = new CubVertex();
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		//int B[] = { 1, 2, 3, 1, 8, 3, 2, 2 };
		System.out.println(cub.cubVertex(A, 0, 7));   //已解决
		//cub.cubVertex(B, B.length, 0);
		
		
		//八皇后问题
		EightQueen queen = new EightQueen();
		EightQueens queens = new EightQueens();
//		int[] columnIndex = new int[8];
//		int queens = 8;
//		int index = 0;
//		queen.permutation(columnIndex, queens, index);
	    queens.eightQueen();    

	}
}
