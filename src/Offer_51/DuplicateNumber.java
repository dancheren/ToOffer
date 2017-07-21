package Offer_51;

public class DuplicateNumber {
    public static int duplicateNumber(int[] arr,int length,int[] duplication){
    	int result = 0;
    	if(arr == null || length < 1)
    		return result;
    	int len = arr.length;
    	int[] temp = new int[len];   //������ϣ�������������ֳ��ֵĴ���
    	for(int i=0;i<len;++i){
    		temp[arr[i]] ++;
    		if(temp[arr[i]] >1){   //ʱ�临�Ӷ�ΪO��n��,�ռ临�Ӷ�ΪO��n��
    			result = arr[i];   //�ҵ����ִ�������һ�εĻ��˳�ѭ�������ظ�����
    			duplication[0] = arr[i];
    			break;
    		}
    	}
    	return result;
    }
    
    //������  ���û���ظ����ֵ����֣������������е�λ�ã��±꣩���ڸ����ֱ������±�Ϊ i ������ m ������ i��
    //���ڱȽ� m �� �±�Ϊ m �������Ƿ���ȣ������ȣ�������ظ����֣��������ȣ����±�Ϊ i ������ m ���±�
    //Ϊ m �����ֽ���������������бȽϡ�������ֱ�������ظ�������Ϊֹ��
    
    public static int duplicateNumber1(int[] arr,int length,int[] duplication){
    	int result = -1;
    	if(arr == null || length < 1)
    		return result;
    	for(int i=0;i<arr.length;i++){
    		while(arr[i] != i){    //ʱ�临�Ӷ�Ϊ(n),�ռ临�Ӷ�ΪO(1),�������ķ����ռ临�Ӷȼ�С��
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
