package Offer_51;

import java.util.Arrays;

public class DuplicateNum {

	public static void main(String[] args) {
		int[] arr = {3,0,2,1,5,3};
       duplicateNum(arr);
	}
	
	public static boolean duplicateNum(int[] arr){
		if(arr == null || arr.length < 1)
			return false;
		boolean found = false;
		for(int i=0;i<arr.length && found == false;i++){
			while(arr[i] != i) {
				if(arr[arr[i]] != arr[i]){
					int temp = arr[i];
					arr[i] = arr[temp];
					arr[temp] = temp;
				}else{
					found = true;
					System.out.println("The duplicate number is: "+arr[i]);
					break;
				}
			}
		}
		return found;
	}

	 public boolean duplicate(int numbers[],int length,int [] duplication) {
	       if(numbers == null || numbers.length < 1)
		           return false;
		       //Arrays.sort(numbers);
	        for(int i = 0;i<length;i++){
	            if(numbers[i] >length - 1 || numbers[i] < 0)
	                return false;
	        }
	        duplication[0] = -1;
	        for(int i=0;i<length;i++){
	            while(numbers[i] != i){    //��Ȼ������ѭ������ÿ�������ֻ��Ҫ���ξ��ܹ�λ���������ʱ�临�Ӷ�ΪO��n��
	                if(numbers[i] == numbers[numbers[i]]){    //���ҿռ临�Ӷ�ΪO��1��
	                    duplication[0] = numbers[i];
	                    return true;
	                }
	                int temp = numbers[i];
	                numbers[i] = numbers[temp];
	                numbers[temp] = temp;
	            }
	        }
		       return false;
	    }
}
