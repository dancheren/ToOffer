package Offer_41;

import java.util.ArrayList;

/*
 * 题目：输入一个正数s，打印出所有和为s的连续正数序列（至少有两个数字），例如输入15，
 *      由于1+2+3+4+5=15，4+5+6=15,7+8=15，因此输出1~5,4~6,7~8.
 *      思路：
 *         用两个整数small和big分别代表当前连续子串第一个数字和最后一个数字，计算当前子串的和，
 *         如果当前子串和小于s，则将big加1，子串和也加1；如果当前管大于s，将当前和减去small
 *         然后small加1，与s比较；
 */
public class FindContinousSequence {

	public static void main(String[] args) {
       findContinousSequence(27);
	}

	public static void findContinousSequence(int num) {
		if (num < 3) {
			return;
		}
		int small = 1;
		int big = 2;
		int middle = (1 + num) / 2;
		int curSum = small + big;
		while (small < middle) {
			if (curSum == num) {
				printContinousSequence(small, big);
			}
			//子串和大于s，一次减去子串第一个数字后与s比较，用循环来比较；
			while (curSum > num && small < middle) {
				curSum -= small;
				small++;
				if (curSum == num) {
					printContinousSequence(small, big);
				}
			}
			
			big++;
			curSum += big;
		}
	}
	
	

	private static void printContinousSequence(int small, int big) {
		for (int i = small; i < big; i++) {
			System.out.print(i + ",");
		}
		System.out.println(big);
	}
	
	//方法二
	 public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	       ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer> >();
	        if(sum == 0)
	            return list;
	        int small = 1;
	        int big = 2;
	        while(small != (sum+1)/2 ){
	           
	            int sums = sumn(small,big);
	            if(sums == sum){
	                ArrayList<Integer> alist = new ArrayList<>();
	                for(int i=small;i<=big;i++)
	                    alist.add(i);
	                list.add(alist);
	                small++;
	                big++;
	            }else if(sums <sum){
	                big++;
	            }else{
	                small++;
	            }
	        }
	        return list;
	    }
	    public static int sumn(int begin,int end){
	        int x = 0;
	        for(int i=begin;i<=end;i++){
	            x+=i;
	        }
	        return x;
	    }
}
