package Offer_34;

public class ugly1 {
	public int ugly(int index) {
		if (index <= 0)
			return 0;
		int[] temp = new int[index];
		temp[0] = 1;
		int nextIndex = 1;
		int m2 = 0, m3 = 0, m5 = 0;
		while (nextIndex < index) {
			int min = getMin(temp[m2] * 2, temp[m3] * 3, temp[m5] * 5);
			temp[nextIndex] = min;
			while (temp[m2] * 2 <= temp[nextIndex]) {
				m2++;
			}
			while (temp[m3] * 3 <= temp[nextIndex]) {
				m3++;
			}
			while (temp[m5] * 5 <= temp[nextIndex]) {
				m5++;
			}
			nextIndex++;
		}
		return temp[nextIndex - 1];
	}

	private int getMin(int i, int j, int k) {
		int min = i < j ? i : j;
		min = min < k ? min : k;
		return min;
	}
}
