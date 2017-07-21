package Offer_35_RelatedQuestion;

/*
 * 输入两个字符串，从第一个字符串中删除在第二个字符串中出现过的所有字符
 * 
 *   1. 用两个数组存放带比较的字符串，设置一个boolean变量，初始值设为false,当两个数组中有相同的字符时设置为true，
 *   2. 如果为false,则将char1中的字符存储到临时数组中，最后返回临时数组
 *   
 *   
 *    用java写删除一个字符串中与另一个字符串中相同字符的代码的基本思想是：

        (1)从键盘中分别输入两个字符串，然后用tocharArray()方法把字符串转换为字符数组，

        (2)然后让两个字符数组遍历，并设定一个boolean类型的变量，默认值为false,

              (3)在遍历的过程中，如果数组中的两个字符相等，则把变量设为true，

         (4)一个分别与另一个字符串中的字符进行比较，如果返回结果仍未false

                (5)则把这个字符添加到一个空的字符数组中去，最后输出者个字符数组即可。
 */

public class RelatedQueation1 {
	public void deleteCharacter(String s1, String s2) {
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		char[] char3 = new char[char1.length];//将临时数组的大小设置为 待删除数组的大小，因为char2 中的字符在char1中不存在
		int i = 0;
		for (char ch1 : char1) {
			boolean item = false;
			for (char ch2 : char2) {   //时间复杂度为O（n^2）  空间复杂度为O（n）
				if (ch1 == ch2) {
					item = true;
				}
			}
			if (!item)
				char3[i++] = ch1;
		}
		for(int j=0;j<char3.length;j++){
			System.out.print(char3[j]+" ");
		}
	}
	
	/*
	 * 用数组实现简单哈希表
	 *   创建一个数组实现的哈希表来存储第二个字符串，我们从头至尾扫描第一个字符串的每一个字符时，
	 *   用O（1）时间就能判定出该字符是不是在第二个字符串中。
	 */
	public void deleteCharacter2(String str1,String str2){
		int[] ch1 = new int[256];    //空间复杂度为O（1）
		StringBuilder str = new StringBuilder();   //在方法体内定义的字符串变量用StringBuilder
		for(int i=0;i<str2.length();i++){      //时间复杂度为O（n）
			ch1[str2.charAt(i)]++;
		}
		for(int i=0;i<str1.length();i++){
			if(ch1[str1.charAt(i)] < 1){
				str.append(str1.charAt(i));
			}
		}
		System.out.println(str.toString());
  }
}