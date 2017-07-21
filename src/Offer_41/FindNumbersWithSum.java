package Offer_41;

import java.util.ArrayList;

/*
 * ��Ŀ����ΪS���������֣�����ж�����ֵĺ͵���S���������һ�Լ��ɡ�
 *   ˼·��������ָ��ֱ�ָ���������β���֣�������ߵĺ�ΪS��������������ּȿ��ԣ�����ʹ���S��
 *       �ú����ָ����ǰ�ƶ�һλ���ٴαȽϣ������С��S��ǰ��ָ������ƶ�һλ���ٴαȽϣ�
 *       ֱ������ָ���غ�Ϊֹ   
 *       
 */
public class FindNumbersWithSum {

	public static void main(String[] args) {
      int [] data = {2,3,4,4,5,6,7,8};
      findNumbersWithSum(data, data.length, 20);
	}
   
	public static boolean findNumbersWithSum(int[] data,int length,int num){
		boolean found = false;
		if(data == null || length < 1)
			return found;
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		int ahead = length - 1;
		int behind = 0;
		while(behind < ahead){
			sum = data[ahead]+ data[behind];
			if(sum == num){
				num2 = data[ahead];
				num1 = data[behind];
				System.out.println(num1+" "+num2);
				found = true;
				break;
			}else if(sum < num){   //��С��num��ǰ��ָ�������ƶ�һλ
				behind ++;
			}else{
				ahead --;    //�ʹ���num������ָ����ǰ�ƶ�һλ
			}
		}
		if(found == false)
			System.out.println("Not found!");
		return found;
	}
	
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        
		 ArrayList<Integer> list = new ArrayList<>();
	        if(array == null || array.length < 2 || array[0] + array[1] >sum)
	            return list;
	        int start = 0;
	        int end = array.length-1;
	        while(end > start){
               int s= array[start] + array[end];
	            if( s == sum){
	                   list.add(array[start]);
	                   list.add(array[end]);
	                   break;
	            }else if(s>sum){
	                end --;
	            }else{
	                start ++;
	            }
	        } 
	        return list;
	    }
}
