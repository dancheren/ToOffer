package Offer_28;


public class Permutation2 {
	/*
	 * �ַ��������� ��һ���ַ���������ABC�� �����е����У�����ABC, ACB, BAC, BCA, CAB, CBC ���ҳ����� ����˼·��
	 * ����һ��n λ���ַ�������������n-1λ�ַ��������� ���� û���� n -1 λ�ַ����� �Ǹ��ַ� �����С� �е�����⣬������˵����
	 * �����ַ���ABC�����������е����о��� A + BC ������ ���� B + AC �����У��ټ��� C + AB�����С� ��BC�������� B + C
	 * ������ ���� C + B �����С� ���ԣ���һ���ַ��������Ǵ���ȥһ��ֵ��Ȼ����ʣ�ಿ�ֵ����У�Ȼ��������������һ��
	 */
	public void permutation(char[] arr, int start, int end) {
		if (start == end) { // ����ĩβ�����ź�����ַ�����ӡ����
			for (int i = 0; i <= end; i++) {
				System.out.print(arr[i]);
			}
			System.out.println("");
		} else {
			for (int i = start; i <= end; i++) { // �̶���һ���ַ�����
				char temp = arr[start]; // ��һ��start=1,i=1
										// ����ʱ�����Լ����Լ�����λ�ã���i=2ʱ����һ���ַ����ڶ����ַ�����λ��
				arr[start] = arr[i];
				arr[i] = temp;
				permutation(arr, start + 1, end); // �Եڶ����ַ���ʼ���У��ݹ�Ժ�����ַ�����������
				temp = arr[start]; // �����ַ������н�����ָ�Ϊ����֮ǰ��˳��
				arr[start] = arr[i];
				arr[i] = temp;
			}
		}

	}
}
