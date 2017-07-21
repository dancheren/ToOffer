package Offer_24_RelatedQuestion;
/*
 * 二叉搜索树的前序遍历序列
 *    前序遍历数组中第一个数字即为根结点的值，后面跟后序遍历的思想一样，注意边界条件的判定
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
    	if(i > start && i <= end)    //注意边界条件，如果不设定 i <= end ，start会超过end，造成越界
    		left = vertifySquenceOfFST(arr, start+1, i-1);
    	boolean right = true;
    	if(i <= end)
    		right = vertifySquenceOfFST(arr, i, end);
    	return (left && right);
    }
}
