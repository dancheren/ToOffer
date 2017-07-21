package Test_BubberSort;

public class test_BuuberSort {

	public static void bubbleSort(int[] a, int n) {
		int i = n;
		int j;
		int temp;
		while (i > 0) {
			for (j = 0; j < n - 1; ++j) {
				if (a[j] > a[j + 1]) { // ǰһ�����Ⱥ�һ�������򽻻���������λ��
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
			i--;
		}
	}
   
	/*
	 * �Ż�
	 * ������־λflag��ʾ����������Ѿ����򣬲��ý��бȽϣ����ٱȽϵĴ���
	 * ͬʱ�������һ�ν������±꣬
	 */
	public static void BubbleSort3(int arr[], int len) {
		int i = 0;
		int j = 0;
		int k = len - 1;// �����ڲ��Ƚ�ѭ��
		int n = 0;

		for (i = 0; i < len - 1; i++) {
			int flag = 1;
			n = 0;
			// �ٶ�ÿ�ν��붼������� flagΪ1��
			for (j = 0; j < k; j++) {   //�ڲ������ʱ��ֻ��Ƚ�����k��λ�ã���kλ�ú�Ķ���������Ƚ�
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					flag = 0;// ���������������flag ��Ϊ0��
					n = j;// �������һ�ν������±ꣻ
				}
			}

			if (flag == 1)// ����������꣬û�з�����������ԭ��������
				break;
			k = n;// ���һ�ν�����λ�ø�k�����ٱȽϵĴ�����
		}
	}// �����Ż�

	
	
	/*
	 * ð�������Ӧ��
	 *   ��һ���ַ����Ĵ�д��ĸ�ŵ��ַ����ĺ��棬�����ַ������λ�ò��䣬�����������Ŀռ䡣
	 */
	 //����ⷨ��������
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
				  if(isUpperAlpha(str.charAt(j)) == 1){   //����Ǵ�д��ĸ��������ĸ�ƶ�������ĩβ
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
	  
	  //����һ�ֽⷨ
	  
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

