package Offer_40;

import java.util.Scanner;

/* ��Ŀ��һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
 *     Ҫ��ʱ�临�Ӷ���O(n)���ռ临�Ӷ���O(1)��
 * ����˼·��
 *    1.�������ֻ����������һ�ε����֣���ˣ����ǿ��Խ�������Ϊ2��ÿ����������һ��ֻ����һ�ε�
 *      ���֣��������ֶ��ǳɶԳ��ֵġ�����һ�����ָ��Լ���������������0����ˣ����ڲ�ֺ�����飬
 *      �������ζ������е�Ԫ���������������õ�ֻ����һ�ε��Ǹ����֡�������������ֱ���ͬ���Ĳ�
 *      �������ǿ��Եõ�����ֻ����һ�ε����֡���ˣ���ν�������Ϊ�����������Ǳ���Ĺؼ���
 *    2.������飺�������е����������������������õ�ֻ����һ�ε��������ֵ����ֵ��������������
 *              ����ȣ�����Ķ�����ֵ��Ȼ����������һλ����1�������Ǵ��ҵ����nλ���ɴ�����
 *              ���ֱ�׼����Ϊ���ҵ����nλΪ1��Ϊͬһ�飬��nλ��Ϊ1��Ϊͬһ�顣
 */
public class FindNumbersAppearOnce {

	public static void main(String[] args) {
		//int[] data = { 2, 4, 3, 8, 3, 2, 5, 5 };
		Scanner scan = new Scanner(System.in);
		String strb = "" ;
		
		while(scan.hasNext()){
			strb = scan.next();
			strb.split(",");
			char datas[] = strb.toCharArray();
			int n = datas.length;
			int[] data = new int[n];
			for(int i=0;i<n;i++){
			 data[i] = datas[i]-'0';
		    }
		
		findNumbersAppearOnce(data);
		}
	}

	public static void findNumbersAppearOnce(int[] data) {
		if (data == null) {
			return;
		}
		int number = 0;
		for (int i : data) {
			number ^= i;    //������������������
		}
		int index = findFirst1(number);//�ҵ�ֻ����һ�ε�����������Ķ�����ֵ��
		int number1 = 0;                //��һ��Ϊ1���±꣬����±���Ϊ��������ı�־
		int number2 = 0;
		for (int j : data) {
			if (is1(j, index)) { //����j��indexλ��Ϊ1
				number1 ^= j;     //������j��indexλ��Ϊ1��������Ϊһ����������
			} else {   //����j��indexλ�ϲ�Ϊ1
				number2 ^= j;  //������j��indexλ�ϲ�Ϊ1��������Ϊһ����������
			}
		}
		System.out.println("The first appear number is: " + number1);
		System.out.println("The second appear number is: " + number2);
	}

	//�ж�����j�Ƿ��ڵ�indexλ��Ϊ1
	private static boolean is1(int j, int index) {  
			j = j >> index - 1;
		if ((j & 1) == 0) {
			return false;
		}
		return true;
	}

	//�ҵ�number�е�һ��Ϊ1��λ��index
	private static int findFirst1(int number) {
		int index = 1;
		while ((number & 1) == 0) {  
			number = number >> 1;
			index++;     
		}
		return index;   // ��indexλ��Ϊ1
	}
	


}
