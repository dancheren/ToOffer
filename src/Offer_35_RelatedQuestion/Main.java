package Offer_35_RelatedQuestion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    //����RelatedQueation1����
				RelatedQueation1 relate = new RelatedQueation1();
				Scanner scan = new Scanner(System.in);
				System.out.print("�������ַ�����"+"\n");
				String str1 = scan.nextLine();
				System.out.print("������Ա��ַ�����"+"\n");
				String str2 = scan.nextLine();
				//relate.deleteCharacter(str1, str2);
				relate.deleteCharacter2(str1, str2);
				scan.close();
				
				//����RelatedQueation2��
				RelatedQueation2 relate2 = new RelatedQueation2();
				String str = relate2.deleteRepeatintCharacter("google");
				System.out.println(str);
				
				
				//����RelatedQueation3��
				RelatedQueation3 relate3 = new RelatedQueation3();
				boolean item = relate3.isAnagram("listen", "selent");
				System.out.println(item);
	}

}
