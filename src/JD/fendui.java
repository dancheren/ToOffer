package JD;

import java.util.Scanner;
/*
 * С�����ڸ�������ʯͷ���зֶѣ�Ҫ�����£�
 * 1.ÿ��������һ��ʯͷ��
 * 2.��������ʯͷ������ͬ��
 * 3.����ʯͷ���ڶ��С�������ʯͷ����n��ϣ�������ʯͷ�ֶѣ�ʹ�ô��ڵ���k��ʯͷ��ʯͷ�Ѹ�����ࡣ
 * 
 * �������Ϊ k��k+1��k��k+1��k��k+1��k��k+1�������������У�����ж� n % (k+k+1) �Ƿ���ڵ���k��
 * �������k��������ٷ�Ϊһ���ѣ����С��k����ֻ�ܽ�ʣ���ʯͷ�ֱ�ӵ�ǰ���ʯ����
 */
public class fendui {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long n = sc.nextLong();
			int k = sc.nextInt();
			int x = (int) (n % (2*k+1));
			int y =  (int) (n / (2*k+1));
			if(x >= k){
				System.out.println(2*y+1);
			}else{
				System.out.println(2*y);
			}
			
		}
	}


}
