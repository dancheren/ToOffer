package Offer_51;

public class DuplicateNumber {
    public static int duplicateNumber(int[] arr,int length,int[] duplication){
    	int result = 0;
    	if(arr == null || length < 1)
    		return result;
    	int len = arr.length;
    	int[] temp = new int[len];   //建立哈希数组来保存数字出现的次数
    	for(int i=0;i<len;++i){
    		temp[arr[i]] ++;
    		if(temp[arr[i]] >1){   //时间复杂度为O（n）,空间复杂度为O（n）
    			result = arr[i];   //找到出现次数大于一次的话退出循环，返回该数字
    			duplication[0] = arr[i];
    			break;
    		}
    	}
    	return result;
    }
    
    //方法二  如果没有重复出现的数字，则他在数组中的位置（下标）等于该数字本身，当下标为 i 的数字 m 不等于 i，
    //则在比较 m 与 下标为 m 的数字是否相等，如果相等，则出现重复数字；如果不相等，将下标为 i 的数字 m 与下标
    //为 m 的数字交换，继续往后进行比较、交换，直到出现重复的数字为止。
    
    public static int duplicateNumber1(int[] arr,int length,int[] duplication){
    	int result = -1;
    	if(arr == null || length < 1)
    		return result;
    	for(int i=0;i<arr.length;i++){
    		while(arr[i] != i){    //时间复杂度为(n),空间复杂度为O(1),相比上面的方法空间复杂度减小了
    			if(arr[i] == arr[arr[i]]){
    				result = arr[i];
    				duplication[0] = arr[i];
    				break;
    			}else{
    				int temp = arr[i];
    				arr[i] = arr[temp] ;   
    				arr[temp] = temp;
    			}
    		}
    	}
    	return result;
    }
    
    
    public static void main(String[] args) {
		int[] arr = {4,1,1,0,2,5,3};
		int[] duplication = new int[7];
		System.out.println(duplicateNumber1(arr,7,duplication));
	}
}
