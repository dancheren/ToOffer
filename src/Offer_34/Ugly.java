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
			temp[nextIndex] = min(temp[m2] * 2, temp[m3] * 3, temp[m5] * 5);  //ȡ��С�ĳ���
			while (temp[m2] * 2 <= temp[nextIndex])
				++m2;    //��¼���һ������֮ǰ�ĵ�һ����������2�������һ����������
			while (temp[m3] * 3 <= temp[nextIndex])
				++m3;    //��¼���һ������֮ǰ�ĵ�һ����������3�������һ����������
			while (temp[m5] * 5 <= temp[nextIndex])
				++m5;    //��¼���һ������֮ǰ�ĵ�һ����������5�������һ����������
			++nextIndex;
		}
		return temp[nextIndex - 1];    //�˳�ѭ��ʱnextIndex = index,��ʱ�����±�nextIndex-1����
	}

	private int min(int i, int j, int k) {
		int temp = (i < j) ? i : j;
		temp = (temp < k) ? temp : k;
		return temp;

	}
}
