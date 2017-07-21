package Offer_30;

public class test {
	/*
	 * ��������С��ǰk����
	 * arr Ϊ�����ҵ�����
	 * low Ϊ�������߽�
	 * high Ϊ������ұ߽�
	 * ���������˼�룬��������ƽ��Ч��O(N)
                                 ���ѡһ��Ԫ�أ�������С�ڵ������Ԫ�ص����Ƶ���ߣ����д������Ԫ�ص����ƶ����ұߡ�������Ԫ�س��˵�K������ֱ�ӷ����������
                                 �����ߵĸ�������K�������ұߵ����ˣ�������ظ�����Ĺ��̡�
                                 �����ߵĸ�������T<K��������ߵ����ˣ��ظ�����Ĺ��̣�ֻ��K=K-T-1��
                                 ƽ������£���һ�λ��ֵ�ʱ�临�Ӷ���O(N)���ڶ�����O(N/2)���ܹ���O(N+N/2+N/4+...)=O(N)
	 */
	 public int partition(int[] arr,int low,int high ){
		  int i = low;
		  int j = high;
		  int temp = arr[i];   //��һ������Ϊ����    �˴���Ҫ���һ���������洢����ֵ
		  do{
			  while(arr[j] > temp && i <j){
			       j--;
			  }
			  if(i < j){
				  arr[i] = arr[j];
				  i ++;
			  }
			  while(arr[i] < temp && i <j ){
				  i++;
			  }
			  if(i<j){
				  arr[j] = arr[i];
				  j--;
			  }
		  }while(i != j);    //��i = j ʱ��iλ��Ϊ����Ĳ���λ��
		  arr[i] = temp;
		  return i;     //��������λ��
	 }
	 
	 public void Sort(int[] arr,int n,int k){
		 if(arr == null || n ==0 || k> n){
			 return;
		 }
		 int start = 0;
		 int end = n-1;
		 int indx = partition(arr,start,end);    //��һ�λ��ֵ�ʱ�临�Ӷ���O(n)
		 while(indx != k-1){
			 if(indx < k-1){
				 start = indx + 1;
				 indx = partition(arr,start,end);   //�������λ��С�� k-1 ���������������ҷ�   ʱ�临�Ӷ�ΪO(n-index +1)
			 }else if(indx > k-1){
				 end = indx - 1;
				 indx = partition(arr,start,end);   //�������λ�ô��� k-1 ����������������   ʱ�临�Ӷ�ΪO(n-index +1)
			 }
		 }       // ����λ�þ��ǵ�kС������λ��
		 for(int r = 0;r <k;r++){
			 System.out.print(arr[r]+",");    //��ӡǰ k С����
		 }
	 }


	public static void main(String[] args) {
		test test1 = new test();
		int arr[] = {4,3,8,1,5,9,1,6,2,7,9,3,0,5,6,7,8,12,56,43,21,4,5,6,3,4,65,67,778,6,32,45,43,11,111,23,43,67,90};
		test1.Sort(arr,9,5);      //��ʱ��kС������ǰ�治һ�������������
		System.out.println("");
		
		//����partition1��
		//Partition1 p1 = new Partition1();
		int len = arr.length;
		Partition1.sort(arr, len, 5);
		System.out.println("");
		System.out.println("---------�����ǲ���TopK���------------");
		//����TopK
		TopK topK = new TopK();
		topK.getLeastIndex(arr, 8);
	}

}
