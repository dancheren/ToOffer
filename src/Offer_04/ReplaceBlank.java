package Offer_04;
/*
 * 替换空格
 *    思路：先遍历字符数组，计算其中的空格个数，然后计算替换后的数组的长度，新建一个字符数组，设置两个指针，一个指向
 *         原数组的末尾，一个指向新数组的末尾，同时往前移动，当遇到空格时，在新数组中加入带替换的字符，如果不是空格
 *         就将原数组中的字符复制到新数组中，同时往前移动指针。直到两个指针重合，最后如果前面还有字符没有复制，则将
 *         剩余的字符复制到新数组中。结束。
 *      
 */
public class ReplaceBlank {
	public void replaceBlank(String str) {
        if(str == null)
        	return ;
        char[] chars = str.toCharArray();
        int num = 0;
        int originalLength = str.length();
        for(int i =0;i<chars.length;++ i){
        	if(chars[i] == ' ' ){
        		++ num;
        	}
        }
        int newLength = originalLength + num * 2;
        char[] temp = new char[newLength];
        //System.arraycopy(chars, 0, temp, 0, originalLength);
        int indexOfOriginal = originalLength -1;
        int indexNew = newLength -1;
        while(indexOfOriginal >= 0 && indexNew > indexOfOriginal){
        	if(chars[indexOfOriginal] == ' '){
        		temp[indexNew --] = '0';
        		temp[indexNew --] = '2';
        		temp[indexNew --] = '%';
        	}else{
        		temp[indexNew --] = chars[indexOfOriginal];
        	}
        	-- indexOfOriginal;
        }
        while(indexOfOriginal >= 0){    //将两个指针重叠后指针前面的字符复制到新字符数组中
    		temp[indexNew --] = chars[indexOfOriginal];
    		-- indexOfOriginal;
        }
        print(temp);
	}
	public void print(char[] chars){
		for(char c : chars){
			System.out.print(c);
		}
	}
}
