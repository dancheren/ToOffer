package Offer_30;

public class test {
	/*
	 * 数组中最小的前k个数
	 * arr 为待查找的数组
	 * low 为数组的左边界
	 * high 为数组的右边界
	 * 快速排序的思想，可以做到平均效率O(N)
                                 随机选一个元素，把所有小于等于这个元素的数移到左边，所有大于这个元素的数移动到右边。如果这个元素成了第K个数，直接返回这个数。
                                 如果左边的个数大于K，不管右边的数了，在左边重复上面的过程。
                                 如果左边的个数等于T<K，不管左边的数了，重复上面的过程，只是K=K-T-1。
                                 平均情况下，第一次划分的时间复杂度是O(N)，第二次是O(N/2)，总共是O(N+N/2+N/4+...)=O(N)
	 */
	 public int partition(int[] arr,int low,int high ){
		  int i = low;
		  int j = high;
		  int temp = arr[i];   //第一个数作为枢轴    此处需要添加一个变量来存储枢轴值
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
		  }while(i != j);    //当i = j 时，i位置为枢轴的插入位置
		  arr[i] = temp;
		  return i;     //返回枢轴位置
	 }
	 
	 public void Sort(int[] arr,int n,int k){
		 if(arr == null || n ==0 || k> n){
			 return;
		 }
		 int start = 0;
		 int end = n-1;
		 int indx = partition(arr,start,end);    //第一次划分的时间复杂度是O(n)
		 while(indx != k-1){
			 if(indx < k-1){
				 start = indx + 1;
				 indx = partition(arr,start,end);   //如果枢轴位置小于 k-1 将枢轴置于枢轴右方   时间复杂度为O(n-index +1)
			 }else if(indx > k-1){
				 end = indx - 1;
				 indx = partition(arr,start,end);   //如果枢轴位置大于 k-1 将枢轴置于枢轴左方   时间复杂度为O(n-index +1)
			 }
		 }       // 枢轴位置就是第k小的数的位置
		 for(int r = 0;r <k;r++){
			 System.out.print(arr[r]+",");    //打印前 k 小的数
		 }
	 }


	public static void main(String[] args) {
		test test1 = new test();
		int arr[] = {4,3,8,1,5,9,1,6,2,7,9,3,0,5,6,7,8,12,56,43,21,4,5,6,3,4,65,67,778,6,32,45,43,11,111,23,43,67,90};
		test1.Sort(arr,9,5);      //此时第k小的数的前面不一定是有序的排列
		System.out.println("");
		
		//测试partition1类
		//Partition1 p1 = new Partition1();
		int len = arr.length;
		Partition1.sort(arr, len, 5);
		System.out.println("");
		System.out.println("---------以下是测试TopK结果------------");
		//测试TopK
		TopK topK = new TopK();
		topK.getLeastIndex(arr, 8);
	}

}
