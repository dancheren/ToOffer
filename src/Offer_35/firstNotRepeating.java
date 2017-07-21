package Offer_35;

import java.util.LinkedHashMap;
/*
 * 题目：在字符串中找出第一个只出现一次的字符。如输入"abaccdeff"，则输出'b'.
	看到这样的题目，我们最直观的想法就是从头开始扫描这个字符串中的字符。当访问某个字符时拿这个字符和后面的每个字符相比较，
	如果在后面没有发现重复的字符，则该字符就是只出现一次的字符。如果字符串有n个字符，每个字符可能与后面的O(n)个字符想比较，
	因此这种思路的时间复杂度为O(n^2)，面试官不会满意这种思路，它会提示我们继续想更快的思路。
	由于题目与字符出现的次数有关，我们是不是可疑统计每个字符在该字符串中出现的次数，要达到这个目的，我们需要一个数据容器来存放每个字符出现的次数。
	在这个容器中可以根据字符来查找它出现的次数，也就是说这个容器的作用就是把一个字符映射称一个数字。在常用的数据容器中，哈希表正是这个用途。
	为了解决这个问题，我们可以定义哈希表的键值（key)是字符，而值（Value)是该字符出现的次数。同时我们还需要从头开始扫描字符串两次。
	第一次扫描字符串时，每扫描到一个字符就在哈希表中的对应项中把次数加1.接下来第二次扫描时，每扫描到一个字符就能从哈希表中得到该字符出现的次数。
	这样第一个只出现一次的字符就是符合要求的输出。
 */

public class firstNotRepeating {
	public Character firstNotRepeat(String str) {
		if (str == null)
			return null;
		char[] strChar = str.toCharArray();
		LinkedHashMap<Character, Integer> hash = new LinkedHashMap<>();
		for (char item : strChar) {
			if (hash.containsKey(item)) {
				hash.put(item, hash.get(item) + 1);
			} else {
				hash.put(item, 1);
			}
		}
		for (char key : hash.keySet()) {
			if (hash.get(key) == 1)
				return key;
		}
		return null;
	}
}

/*
 * 用数组下标代表字符的ASCII码值，数组中的值代表出现的次数，256个字符需要1K额外空间来存储
 * 
public static char FirstNotRepeatingChar(String str)
{
    if(String.IsNullOrEmpty(str))
    {
        return '\0';
    }

    char[] array = str.ToCharArray();
    const int size = 256;
    // 借助数组来模拟哈希表，只用1K的空间消耗
    uint[] hastTable = new uint[size];
    // 初始化数组
    for (int i = 0; i < size; i++)
    {
        hastTable[i] = 0;
    }

    for (int i = 0; i < array.Length; i++)
    {
        hastTable[array[i]]++;   //array[i]所对应的字符的ASCII值为 hastTable数组的下标，
    }

    for (int i = 0; i < array.Length; i++)
    {
        if (hastTable[array[i]] == 1)
        {
            return array[i];
        }
    }

    return '\0';
}
*/
