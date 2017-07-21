package Offer_20;
/*
 * ˳ʱ���ӡ����
 * ˼·��
 * �����Ϸ��ĵ�һ��Ԫ�ؿ�ʼ����һ��ѭ������ӡ����ÿ�δ�ӡ�����е�һ��Ȧ������������������Ϊrows,
 * ����Ϊcolumns,��ӡ��һȦ�����Ϸ�������Ϊ��0,0�����ڶ�Ȧ�����Ϸ�����Ϊ��1,1�����Դ�������һ��
 * ���Խ����ϣ��к����к���ͬ������ѡȡ���Ͻǵģ�start��start����һȦ��Ϊ����Ŀ�ꡣ
 * ����һ��5 X 5 �ľ�����˵�����һȦֻ��һ�����֣���Ӧ������Ϊ��2,2���� 5>(2 X 2),
 * ��һ�� 6 X 6 �ľ�����˵���һȦֻ���ĸ����֣���ʵ���ֵ�����Ϊ��2,2����
 *  �� 6 >(2 X 2),���Եĳ�ѭ���˳�����Ϊcolumns >(endX * 2),rows > (endY * 2),
 *  endX,endY�ֱ�Ϊ��ӡȦ����ʼ���꣨endX,endY��;    
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
