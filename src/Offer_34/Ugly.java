package Offer_34;

public class Ugly {

	public int ugly(int index) {
		if (index <= 0)
			return 0;
		int[] temp = new int[index];
		temp[0] = 1;
		int m2 = 0;
		int m3 = 0;
		int m5 = 0;
		int nextIndex = 1;
		while (nextIndex < index) {
			temp[nextIndex] = min(temp[m2] * 2, temp[m3] * 3, temp[m5] * 5);  //取最小的丑数
			while (temp[m2] * 2 <= temp[nextIndex])
				++m2;    //记录最后一个丑数之前的第一个丑数乘以2大于最后一个丑数的数
			while (temp[m3] * 3 <= temp[nextIndex])
				++m3;    //记录最后一个丑数之前的第一个丑数乘以3大于最后一个丑数的数
			while (temp[m5] * 5 <= temp[nextIndex])
				++m5;    //记录最后一个丑数之前的第一个丑数乘以5大于最后一个丑数的数
			++nextIndex;
		}
		return temp[nextIndex - 1];    //退出循环时nextIndex = index,此时返回下标nextIndex-1的数
	}

	private int min(int i, int j, int k) {
		int temp = (i < j) ? i : j;
		temp = (temp < k) ? temp : k;
		return temp;

	}
}
