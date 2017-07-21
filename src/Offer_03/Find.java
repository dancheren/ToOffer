package Offer_03;
/*
 * �����ж��ź���ľ���������
 *    ˼·�������Ϸ�����a��ʼ�����a���ڴ����ҵ�����˵�������ҵ���ֻ�ܳ�����a����ߣ������ܳ�����a�����棬�����ų�
 *        ���һ�У���һ�δ�ǰһ�п�ʼ���ң����aС�ڴ����ҵ�����˵�������ҵ���ֻ���ܳ�����a���·�������ų���һ��
 *        �ӵڶ������Ϸ������ֿ�ʼ���ң�ֱ���ҵ������ҵ��������û�У�����false��
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
