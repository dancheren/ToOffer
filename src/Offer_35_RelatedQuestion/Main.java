package Offer_35_RelatedQuestion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    //²âÊÔRelatedQueation1´úÂë
				RelatedQueation1 relate = new RelatedQueation1();
				Scanner scan = new Scanner(System.in);
				System.out.print("ÇëÊäÈë×Ö·û´®£º"+"\n");
				String str1 = scan.nextLine();
				System.out.print("ÇëÊäÈë¶Ô±È×Ö·û´®£º"+"\n");
				String str2 = scan.nextLine();
				//relate.deleteCharacter(str1, str2);
				relate.deleteCharacter2(str1, str2);
				scan.close();
				
				//²âÊÔRelatedQueation2Àà
				RelatedQueation2 relate2 = new RelatedQueation2();
				String str = relate2.deleteRepeatintCharacter("google");
				System.out.println(str);
				
				
				//²âÊÔRelatedQueation3Àà
				RelatedQueation3 relate3 = new RelatedQueation3();
				boolean item = relate3.isAnagram("listen", "selent");
				System.out.println(item);
	}

}
