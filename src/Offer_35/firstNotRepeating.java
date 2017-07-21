package Offer_35;

import java.util.LinkedHashMap;
/*
 * ��Ŀ�����ַ������ҳ���һ��ֻ����һ�ε��ַ���������"abaccdeff"�������'b'.
	������������Ŀ��������ֱ�۵��뷨���Ǵ�ͷ��ʼɨ������ַ����е��ַ���������ĳ���ַ�ʱ������ַ��ͺ����ÿ���ַ���Ƚϣ�
	����ں���û�з����ظ����ַ�������ַ�����ֻ����һ�ε��ַ�������ַ�����n���ַ���ÿ���ַ�����������O(n)���ַ���Ƚϣ�
	�������˼·��ʱ�临�Ӷ�ΪO(n^2)�����Թٲ�����������˼·��������ʾ���Ǽ���������˼·��
	������Ŀ���ַ����ֵĴ����йأ������ǲ��ǿ���ͳ��ÿ���ַ��ڸ��ַ����г��ֵĴ�����Ҫ�ﵽ���Ŀ�ģ�������Ҫһ���������������ÿ���ַ����ֵĴ�����
	����������п��Ը����ַ������������ֵĴ�����Ҳ����˵������������þ��ǰ�һ���ַ�ӳ���һ�����֡��ڳ��õ����������У���ϣ�����������;��
	Ϊ�˽��������⣬���ǿ��Զ����ϣ��ļ�ֵ��key)���ַ�����ֵ��Value)�Ǹ��ַ����ֵĴ�����ͬʱ���ǻ���Ҫ��ͷ��ʼɨ���ַ������Ρ�
	��һ��ɨ���ַ���ʱ��ÿɨ�赽һ���ַ����ڹ�ϣ���еĶ�Ӧ���аѴ�����1.�������ڶ���ɨ��ʱ��ÿɨ�赽һ���ַ����ܴӹ�ϣ���еõ����ַ����ֵĴ�����
	������һ��ֻ����һ�ε��ַ����Ƿ���Ҫ��������
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
 * �������±�����ַ���ASCII��ֵ�������е�ֵ������ֵĴ�����256���ַ���Ҫ1K����ռ����洢
 * 
public static char FirstNotRepeatingChar(String str)
{
    if(String.IsNullOrEmpty(str))
    {
        return '\0';
    }

    char[] array = str.ToCharArray();
    const int size = 256;
    // ����������ģ���ϣ��ֻ��1K�Ŀռ�����
    uint[] hastTable = new uint[size];
    // ��ʼ������
    for (int i = 0; i < size; i++)
    {
        hastTable[i] = 0;
    }

    for (int i = 0; i < array.Length; i++)
    {
        hastTable[array[i]]++;   //array[i]����Ӧ���ַ���ASCIIֵΪ hastTable������±꣬
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
