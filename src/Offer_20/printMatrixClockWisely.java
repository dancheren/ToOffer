package Offer_20;
/*
 * 顺时针打印矩阵
 * 思路：
 * 从左上方的第一个元素开始，用一个循环来打印矩阵，每次打印矩阵中的一个圈。假设这个矩阵的行数为rows,
 * 列数为columns,打印第一圈的左上方的坐标为（0,0），第二圈的左上方坐标为（1,1），以此类推在一个
 * 主对角线上，行号与列号相同，可以选取左上角的（start，start）的一圈作为分析目标。
 * 对于一个5 X 5 的矩阵来说，最后一圈只有一个数字，对应的坐标为（2,2）有 5>(2 X 2),
 * 对一个 6 X 6 的矩阵来说左后一圈只有四个数字，其实数字的坐标为（2,2），
 *  有 6 >(2 X 2),可以的出循环退出条件为columns >(endX * 2),rows > (endY * 2),
 *  endX,endY分别为打印圈的起始坐标（endX,endY）;    
 */

public class printMatrixClockWisely {
	public void printMatrix(int[][] arr, int columns, int rows) {
		if (arr == null || columns <= 0 || rows <= 0) 
			return;
		int start = 0;
		while (columns > start * 2 && rows > start * 2) {
			printMatrixInCircle(arr, columns, rows, start);
			++ start;
		}
	}

	private void printMatrixInCircle(int[][] arr, int columns, 
			                         int rows, int start) {
        int endX = columns - 1 - start;
        int endY = rows - 1 - start;
        for(int i = start;i <= endX;i++){
        	System.out.print(arr[start][i]+" ");
        }
        if(start < endY){
        	for(int i=start+1;i<= endY;i++){
        		System.out.print(arr[i][endX]+" ");
        	}
        }
        if(start < endX && start < endY){
        	for(int i=endX-1;i>=start;i--){
        		System.out.print(arr[endY][i]+" ");
        	}
        }
        if(start < endX && start <endY-1){
        	for(int i=endY-1;i>=start+1;i--){
        		System.out.print(arr[i][start]+" ");
        	}
        }
	}
}
