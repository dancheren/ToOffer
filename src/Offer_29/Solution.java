package Offer_29;

public class Solution {
	public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0)
            return 0;
        int n = array.length;
        int middle = n >> 1;
        int start = 0;
        int end = n-1;
        int index = partition(array,start,end);
        while(index != middle){
            if(index > middle){
                index = partition(array,start,index-1);
            }else{
                index = partition(array,index+1,end);
            }
        }
        int m = array[index];
        int count = 0;
        for(int i=0;i<n;i++){
            if(array[i] == m)
                count ++;
        }
        if(count * 2 > n)
            return m;
        else
            return 0;
    }
    
    public int partition(int[] array,int start,int end){
        int i = start;
        int j = end;
        int temp = array[i];
       
            while(i != j){
                while(array[j] > temp && i< j){
                    j--;
                }
                if(i<j){
                    array[i] = array[j];
                    i++;
                }
                while(array[i]< temp && i<j){
                    i++;
                }
                if(i<j){
                    array[j] =array[i];
                    j--;
                }
           }
            array[i] = temp; 
        return i;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int[] array = {3,3,3,3,2,2,3,3,2};
		int result = s.MoreThanHalfNum_Solution(array);
		System.out.println(result);
	}
}
