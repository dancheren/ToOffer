package Offer_24;
/*
 * 二叉搜索树的后序遍历序列
 *    在后续遍历的到的序列中，最后一个数字是树的根结点的值。数组中前面的数字可以分为两部分，
 *    第一部分是左子树结点的值，它们逗比根结点的值小，第二部分是右子树结点的值，它们逗比根结点的值大。
 *    接下来用同样的方法确定与数组每一部分对应的子树的结构，这其实是一个递归的过程。
 *    
 */
public class VertifySquenceOfBST {
   public boolean vertifySquenceOfBST(int[] arr,int start,int end){
	   if(arr == null || arr.length < 1 || start > end)
		   return false;
	   int root = arr[end];
	   int i = start;
	   for(;i<end;++i){
		   if(arr[i] > root){   //找到右子树的根结点，由二叉搜索树的特性知道根结点的左子树的值均小于根结点的值，
			   break;           //根结点右子树的值均大于根结点的值
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
