package Offer_03;
/*
 * 在行列都排好序的矩阵中找数
 *    思路：从右上方的数a开始，如果a大于待查找的数，说明待查找的数只能出现在a的左边，不肯能出现在a的下面，所以排除
 *        最后一列，下一次从前一列开始查找；如果a小于待查找的数，说明待查找的数只可能出现在a的下方，因此排除第一行
 *        从第二行右上方的数字开始查找；直到找到待查找的数，如果没有，返回false。
 */
public class Find {
    public boolean find(int[][] arr,int k){
    	if(arr == null || arr.length < 0 || arr[0].length < 0)
    		return false;
    	int rows = arr.length - 1;
    	int columns = arr[0].length - 1;
    	int row = 0;
    	while(rows >= row && columns > -1){
    		if(arr[row][columns] == k){
    			return true;
    		}else if(arr[row][columns] > k){
    			-- columns;
    		}else{
    			++ row;
    		}
    	}
    	return false;
    }
}
