package Offer_30;

public class Partition1 {
     public static int partition1(int[] arr,int start,int end){
    	 int i = start;
    	 int j = end - 1;
    	 int temp = arr[i];
    	 while(i != j){
    		 while(arr[j] > temp && i < j){
    			 j--;
    		 }
    		 if(i < j){
    			 arr[i] = arr[j];
    			 i ++;
    		 }
    		 while(arr[i] < temp && i < j){
    			 i ++;
    		 }
    		 if(i < j){
    			 arr[j] = arr[i];
    			 j -- ;
    		 }
    	 }
    	 arr[i] = temp;
    	 return i;
     }
     
     public static void sort(int[] arr,int len,int k){
    	 if(arr == null || len < 1 || k > len)
    		 return;
    	 int start = 0;
    	 int end = len;
    	 int index = partition1(arr,start,end);
    	 while(index != k-1){
    		 if(index > k-1){
    			 end = index - 1;
    			 index = partition1(arr,start,end);
    		 }else{
    			 start = index + 1;
    			 index = partition1(arr,start,end);
    		 }
    	 }
    	 for(int i = 0;i< k;i++){
    		 System.out.print(arr[i] + " ");
    	 }
     }
}
