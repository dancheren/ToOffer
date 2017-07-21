package Offer_40;

import java.util.Scanner;

/* 题目：一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 *     要求时间复杂度是O(n)，空间复杂度是O(1)。
 * 解题思路：
 *    1.此题给定只有两个出现一次的数字，因此，我们可以将数组拆分为2，每个数组中有一个只出现一次的
 *      数字，其他数字都是成对出现的。由于一个数字跟自己做异或操作都等于0，因此，对于拆分后的数组，
 *      我们依次对数组中的元素做异或操作，最后得到只出现一次的那个数字。对两个子数组分别做同样的操
 *      作，我们可以得到两个只出现一次的数字。因此，如何将数组拆分为两个子数组是本题的关键。
 *    2.拆分数组：对数组中的所有数字做异或操作，最后得到只出现一次的两个数字的异或值，由于两个数字
 *              不相等，异或后的二进制值必然存在至少有一位等于1，假设是从右到左第n位，由此我们
 *              划分标准定义为从右到左第n位为1的为同一组，第n位不为1的为同一组。
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
			number ^= i;    //将所有数字做异或操作
		}
		int index = findFirst1(number);//找到只出现一次的两个数异或后的二进制值中
		int number1 = 0;                //第一个为1的下标，这个下标作为划分数组的标志
		int number2 = 0;
		for (int j : data) {
			if (is1(j, index)) { //数字j第index位上为1
				number1 ^= j;     //将数字j第index位上为1的数字作为一组做异或操作
			} else {   //数字j第index位上不为1
				number2 ^= j;  //将数字j第index位上不为1的数字作为一组做异或操作
			}
		}
		System.out.println("The first appear number is: " + number1);
		System.out.println("The second appear number is: " + number2);
	}

	//判断数字j是否在第index位上为1
	private static boolean is1(int j, int index) {  
			j = j >> index - 1;
		if ((j & 1) == 0) {
			return false;
		}
		return true;
	}

	//找到number中第一个为1的位数index
	private static int findFirst1(int number) {
		int index = 1;
		while ((number & 1) == 0) {  
			number = number >> 1;
			index++;     
		}
		return index;   // 第index位上为1
	}
	


}
