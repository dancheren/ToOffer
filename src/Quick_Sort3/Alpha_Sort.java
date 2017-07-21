package Quick_Sort3;


/*
 * 有一个由大小写组成的字符串，现在需要对他进行修改，将其中的所有小写字母排在大写字母的前面(不要求保持原顺序)
 * 字符串在调整的过程中可以分成两个部分：已排好的小写字母部分、待调整的剩余部分。用两个指针i和j，其中i指向待调整的剩余部分的第一个元素，
 * 用j指针遍历待调整的部分。当j指向一个小写字母时，交换i和j所指的元素。向前移动i、j，直到字符串末尾。
 */
public class Alpha_Sort {
     public static void proc(char[] arr){
    	 if(arr == null)
    		 return;
    	 int i=0;
    	 int j=0;
    	 //出现的第一个大写字母
    	 while( arr[i] >= 'a' && arr[i] <= 'z'){
    		 i++;
    	 }
    	 if(arr[i] != '\0'){
    		 //出现的第一个小写字母
    		 for(j=i;j<arr.length;j++){
    			 if(arr[j] >='a' && arr[j] <= 'z'){
    			 char temp = arr[i];
    			 arr[i] = arr[j];
    			 arr[j] = temp;
    			 i++;
    			 }
    		 }
    	 }
     }
     
     public static void sort(char[] ch){
    	 if(ch == null)
    		 return;
    	 int n = ch.length;
    	 int i=0;
    	 for(;i<n;i++){    //找到第一个大写字母，之前全为小写字母
    		 if(ch[i] >= 'a' && ch[i] <= 'z')
    			 continue;
    		 else{
    			 break;
    		 }
    	 }
    	 int j = i + 1;
    	 for(;j<n;j++){ 
    		 if(ch[j] >= 'a' && ch[j] <= 'z'){  //遇到小写字母就与待排序的第一个字母交换
    			 char temp = ch[j];
    			 ch[j] = ch[i];
    			 ch[i] = temp;
    			 i ++;
    		 }
    		 
    	 }
    	 
     }
     
     public static void main(String[] args) {
		  char[] arr = {'a','B','v','A','n','h','t','R'};
		  sort(arr);
		  for(char a : arr){
			  System.out.print(a+" ");
		  }
	}
}
