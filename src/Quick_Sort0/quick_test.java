package Quick_Sort0;

public class quick_test {

	public void partition(int[] arr, int low, int high) {
		int i=0;
		int j=0;
		if (low < high) {
			i = low;
			j = high;
			int temp = arr[i]; // 第一个数作为枢轴 此处需要添加一个变量来存储枢轴值
			do {
				while (arr[j] > temp && i < j) {
					j--;
				}
				if (i < j) {
					arr[i] = arr[j];
					i++;
				}
				while (arr[i] < temp && i < j) {
					i++;
				}
				if (i < j) {
					arr[j] = arr[i];
					j--;
				}
			} while (i != j); // 当i = j 时，i位置为枢轴的插入位置
			arr[i] = temp;
			partition(arr, low, i - 1);
			partition(arr, i + 1, high);
		}
	}

//	public void Sort(int[] arr, int low, int high) {
//		if (arr == null) {
//			return;
//		}
//		int start = low;
//		int end = high ;
//		int indx = partition(arr, start, end);
//		
//
//	}

	public static void main(String[] args) {
		quick_test test1 = new quick_test();
		int[] arr = { 4, 3, 8, 1, 5, 9, 1, 6, 2 };
		test1.partition(arr, 0, 8);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
