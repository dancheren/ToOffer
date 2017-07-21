package Test_BubberSort;

public class test_BuuberSort {

	public static void bubbleSort(int[] a, int n) {
		int i = n;
		int j;
		int temp;
		while (i > 0) {
			for (j = 0; j < n - 1; ++j) {
				if (a[j] > a[j + 1]) { // 前一个数比后一个数大，则交换两个数的位子
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
			i--;
		}
	}
   
	/*
	 * 优化
	 * 设立标志位flag表示后面的序列已经有序，不用进行比较，较少比较的次数
	 * 同时保存最后一次交换的下标，
	 */
	public static void BubbleSort3(int arr[], int len) {
		int i = 0;
		int j = 0;
		int k = len - 1;// 控制内部比较循环
		int n = 0;

		for (i = 0; i < len - 1; i++) {
			int flag = 1;
			n = 0;
			// 假定每次进入都是有序的 flag为1；
			for (j = 0; j < k; j++) {   //内部排序的时候只需比较至第k个位置，第k位置后的都有序无须比较
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					flag = 0;// 如果发生交换，则flag 置为0；
					n = j;// 保存最后一次交换的下标；
				}
			}

			if (flag == 1)// 如果这趟走完，没有发生交换，则原数组有序；
				break;
			k = n;// 最后一次交换的位置给k，减少比较的次数；
		}
	}// 最终优化

	
	
	/*
	 * 冒泡排序的应用
	 *   把一个字符串的大写字母放到字符串的后面，各个字符的相对位置不变，不能申请额外的空间。
	 */
	 //下面解法存在问题
	  public static int isUpperAlpha(char c){
		  if(c>='A' && c<='Z'){
			  return 1;
		  }else{
			  return 0;
		  }
	  }
	  
	  public static void swap(char a,char b){
		  char temp = a;
		  a = b;
		  b = temp;
	  }
	  
	  public static String Sort(String str,int len){
		  if(str == null || len < 1){
			  return null;
		  }
		  int i;
		  int j = 0;
		  int k = 0;
		  for(i = 0;i<len;i++){
			  for(j=len-i-1;j>=0;j--){
				  if(isUpperAlpha(str.charAt(j)) == 1){   //如果是大写字母，将该字母移动到数组末尾
					  for(k = j;k<len-i-1;k++){
						  swap(str.charAt(k),str.charAt(k+1));
						  
					  }
					  break;
				  }
				  if(j==0 && isUpperAlpha(str.charAt(j))==0){
					  return str;
				  }
			  }
		  }
		  return str;
	  }
	  
	  //另外一种解法
	  
	  /*
	  import java.util.*;
	  public class Main{
	      public static void main(String[] args){
	          Scanner scan = new Scanner(System.in);
	          while(scan.hasNext()){
	              String str = scan.nextLine();
	              System.out.println(getResult(str));
	          }
	      }
	      public static String getResult(String str){
	          char[] c = str.toCharArray();
	          int k=0;
	          for(int i=0;i<c.length;i++){
	              if(String.valueOf(c[i]).matches("[a-z]")){
	                  char temp = c[i];
	                  for(int j=i;j>k;j--){
	                      c[j] = c[j-1];   
	                  }
	                  c[k] = temp;
	                  k++;
	              }
	          }
	          String str2 = String.valueOf(c);
	          return str2;
	      }
	       
	  }
	  */
	public static void main(String[] args) {
		int[] a = { 5, 8, 3, 1, 9, 7, 6 };
		BubbleSort3(a, 7);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		String str = "aBcDeEfFg";
		System.out.println(Sort(str, 9));
	}

}

