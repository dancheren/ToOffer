package Offer_24_RelatedQuestion;
/*
 * ������������ǰ���������
 *    ǰ����������е�һ�����ּ�Ϊ������ֵ����������������˼��һ����ע��߽��������ж�
 */
public class VertifySquenceOfFST {
    public boolean vertifySquenceOfFST(int [] arr,int start,int end){
    	if(arr == null || arr.length == 0 || start > end)
    		return false;
    	if(arr.length == 1){
    		return true;
    	}
    	int root = arr[start];
    	int i = start + 1;
    	for(;i<=end;++i){
    		if(arr[i] > root){
    			 break;
    		}
    	}
    	int j = i;
    	for(;j<=end;++j){
    		if(arr[j] < root){
    			return false;
    		}
    	}
    	boolean left = true;
    	if(i > start && i <= end)    //ע��߽�������������趨 i <= end ��start�ᳬ��end�����Խ��
    		left = vertifySquenceOfFST(arr, start+1, i-1);
    	boolean right = true;
    	if(i <= end)
    		right = vertifySquenceOfFST(arr, i, end);
    	return (left && right);
    }
}
