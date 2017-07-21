package Offer_41;

import java.util.ArrayList;

/*
 * ��Ŀ������һ������s����ӡ�����к�Ϊs�������������У��������������֣�����������15��
 *      ����1+2+3+4+5=15��4+5+6=15,7+8=15��������1~5,4~6,7~8.
 *      ˼·��
 *         ����������small��big�ֱ����ǰ�����Ӵ���һ�����ֺ����һ�����֣����㵱ǰ�Ӵ��ĺͣ�
 *         �����ǰ�Ӵ���С��s����big��1���Ӵ���Ҳ��1�������ǰ�ܴ���s������ǰ�ͼ�ȥsmall
 *         Ȼ��small��1����s�Ƚϣ�
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
			//�Ӵ��ʹ���s��һ�μ�ȥ�Ӵ���һ�����ֺ���s�Ƚϣ���ѭ�����Ƚϣ�
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
	
	//������
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
