package Quick_Sort3;


/*
 * ��һ���ɴ�Сд��ɵ��ַ�����������Ҫ���������޸ģ������е�����Сд��ĸ���ڴ�д��ĸ��ǰ��(��Ҫ�󱣳�ԭ˳��)
 * �ַ����ڵ����Ĺ����п��Էֳ��������֣����źõ�Сд��ĸ���֡���������ʣ�ಿ�֡�������ָ��i��j������iָ���������ʣ�ಿ�ֵĵ�һ��Ԫ�أ�
 * ��jָ������������Ĳ��֡���jָ��һ��Сд��ĸʱ������i��j��ָ��Ԫ�ء���ǰ�ƶ�i��j��ֱ���ַ���ĩβ��
 */
public class Alpha_Sort {
     public static void proc(char[] arr){
    	 if(arr == null)
    		 return;
    	 int i=0;
    	 int j=0;
    	 //���ֵĵ�һ����д��ĸ
    	 while( arr[i] >= 'a' && arr[i] <= 'z'){
    		 i++;
    	 }
    	 if(arr[i] != '\0'){
    		 //���ֵĵ�һ��Сд��ĸ
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
    	 for(;i<n;i++){    //�ҵ���һ����д��ĸ��֮ǰȫΪСд��ĸ
    		 if(ch[i] >= 'a' && ch[i] <= 'z')
    			 continue;
    		 else{
    			 break;
    		 }
    	 }
    	 int j = i + 1;
    	 for(;j<n;j++){ 
    		 if(ch[j] >= 'a' && ch[j] <= 'z'){  //����Сд��ĸ���������ĵ�һ����ĸ����
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
