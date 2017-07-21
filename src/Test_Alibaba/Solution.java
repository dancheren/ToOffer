package Test_Alibaba;

import java.util.Arrays;

public class Solution {

	static boolean resolve2(int[] A) {
		int[] re = findValLocate(A);
		System.out.println("寻找完毕，开始检查: " + Arrays.toString(re));
		re[2] = checkingFind(A, re[0], re[1] + 1, re[3] - 1); // 减1是由于有4部分，最后一部分至少占用1个位置。
		System.out.println("检查: " + Arrays.toString(re));
		int v3 = checkingFind(A, re[0], re[2] + 1, re[3]);// 检查第四部分，的分割点是否为re[3]
		if (v3 == re[3]) {
			return true;
		}
		return false;
	}

	static int checkingFind(int[] A, int val, int begin, int end) {
		int s = 0;
		for (int i = begin; i < end; ++i) {
			s = s + A[i];
			if (s == val) {
				// 返回要去除那个点。
				return i + 1;
			}
		}
		return -1;
	}

	/* 返回均分值，与要去除的第一个和第三个位置 */
	static int[] findValLocate(int[] A) {
		int v1 = 0, v4 = 0;
		for (int i = 0, j = A.length - 1; i < j;) {

			if (v1 < v4) {
				v1 = v1 + A[i];
				++i;
			} else if (v1 > v4) {
				v4 = v4 + A[j];
				--j;
			} else {
				/* 验证：2<=N-3-n<=2v */
				int m = A.length - 3 - (i + 1 + A.length - j);
				if (m >= 2 && m <= 2 * v1) {
					/*
					 * 这里返回的是去除点的位置，i,j没有加减， 是因为以前的操作都让它向后移了一位了， 现在指的就是要去除的点
					 */
					int re[] = { v1, i, 0, j };
					return re;
				} else {
					v1 = v1 + A[i];
					++i;
				}

			}
		}
		return null;
	}

	public static void main(String[] args) {
		/*
		 * ArrayList<Integer> inputs = new ArrayList<Integer>(); 
		 * Scanner in =
		 * new Scanner(System.in); 
		 * String line = in.nextLine(); 
		 * while(line !=null && !line.isEmpty()) {
		 *  int value = Integer.parseInt(line.trim());
		 * if(value == 0) break; inputs.add(value); line = in.nextLine(); }
		 * int[] A = new int[inputs.size()]; for(int i=0; i<inputs.size(); i++)
		 * { A[i] = inputs.get(i).intValue(); }
		 */
		// int[] A={1,1,1,1,7,1,3,4,1,2,1,5,2,2};
		int[] A = { 1, 1, 1, 1, 10, 1, 3, 1, 1, 2, 1, 5, 2, 2 };
		Boolean res = resolve2(A);

		System.out.println(String.valueOf(res));
	}
}
