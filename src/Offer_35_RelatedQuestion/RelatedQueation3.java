package Offer_35_RelatedQuestion;


/*
 *  如果两个单词中出现的的字母相同，而且每个字母出现的次数也相同，那么这两个单词互为“变位词”。例如 listen 和 silent，
 *     evil 和 live互为变位词。
 *  
 * 用一个数组实现的简单哈希表来统计字符串中的每个字符出现的次数，当扫描到第一个字符串中的每个字符时，为哈希表对应的项增加1，
 * 接下来扫描第二个字符串，扫描到每个字符时，为哈希表中所对应的项减1.如果扫描完第二个字符串后，哈希表中所有的值都是0，
 * 那么这两个字符串就是互为变位词。
 * 
 * 
 */
public class RelatedQueation3 {
    public boolean isAnagram(String str1,String str2){
    	char[] ch1 = new char[256];
    	boolean item = true;
    	for(int i=0;i<str1.length();i++){
    		ch1[str1.charAt(i)]++;
    	}
    	for(int i=0;i<str2.length();i++){
    		ch1[str2.charAt(i)]--;
    	}
    	for(int i=0;i<str1.length();i++){
    		if(ch1[str1.charAt(i)] != 0){
    			item = false;
    		}
    	}
    	return item;
    }
}
