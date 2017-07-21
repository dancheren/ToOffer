package Offer_24;
/*
 * �����������ĺ����������
 *    �ں��������ĵ��������У����һ�����������ĸ�����ֵ��������ǰ������ֿ��Է�Ϊ�����֣�
 *    ��һ����������������ֵ�����Ƕ��ȸ�����ֵС���ڶ�����������������ֵ�����Ƕ��ȸ�����ֵ��
 *    ��������ͬ���ķ���ȷ��������ÿһ���ֶ�Ӧ�������Ľṹ������ʵ��һ���ݹ�Ĺ��̡�
 *    
 */
public class VertifySquenceOfBST {
   public boolean vertifySquenceOfBST(int[] arr,int start,int end){
	   if(arr == null || arr.length < 1 || start > end)
		   return false;
	   int root = arr[end];
	   int i = start;
	   for(;i<end;++i){
		   if(arr[i] > root){   //�ҵ��������ĸ���㣬�ɶ���������������֪����������������ֵ��С�ڸ�����ֵ��
			   break;           //�������������ֵ�����ڸ�����ֵ
		   }
	   }
	   int j = i;
	   for(;j<end;++j){    
		   if(arr[j] < root){
			   return false;
		   }
	   }
	   boolean left = true;
		if (i > start)
		   left = vertifySquenceOfBST(arr, start,i-1);
	   boolean right = true;
	   if(i<end)
		   right = vertifySquenceOfBST(arr, i,end-1);
	   return (left && right);
   }
}
