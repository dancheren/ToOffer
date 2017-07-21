package Offer_52;
/*题目： 
给定一个数组 A[0,1,...,n-1 ]，请构建一个数组 B[0,1,...,n-1]
其中 B 中的元素 B[i]=A[0]∗ A[1] ∗...∗ A[i−1]∗A[i+1] ∗ ... ∗A[n−1]不能使用除法。
 * 
 * 思路：
 *令C[i]=A[0]∗ A[1] ∗...∗ A[i−1],  D[i]=A[i+1] ∗ ... ∗A[n−1]
 *而且C[i]=C[i-1]*A[i-1],D[i]=D[i+1]*A[i+1]
 *因此 B[i]=C[i]*D[i],
 *用两个数组分别为C[],D[],C从前往后计算下一个值，D从后往前计算前一个值，最后返回数组B[].
 */
public class multiply {

	public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       multiplys(arr);
	}
	
	public static void multiplys(int[] arr){
		if(arr == null || arr.length < 1){
			return ;
		}
		int n = arr.length;
		int[] B = new int[n];
		int[] C = new int[n];
		B[0] = 1;
		C[n-1] = 1;
		for(int i=1;i<n;i++){
			B[i] = B[i-1] * arr[i-1];    //B[i]=B[i-1]*arr[i-1],从前往后计算下一个值
			C[n-1-i] = C[n-i] * arr[n-i];//C[i]=C[i+1]*arr[i+1],从后往前计算前一个值
		}
		for(int i=0;i<n;i++){
			B[i] = B[i]*C[i];
			System.out.print(B[i]+" ");
		}
		
	}

}
