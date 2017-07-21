package Offer_63;

import java.util.LinkedList;

public class KthNode {
	
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.val = val;
		}
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		TreeNode node7 = new TreeNode(8);
         node4.left = node2;
         node4.right = node6;
         node2.left = node1;
         node2.right = node3;
         node6.left = node5;
         node6.right = node7;
         System.out.println(kthNode(node4,3).val);
	}
	public static TreeNode kthNode(TreeNode pRoot, int k)
    {
		if(pRoot == null || k<=0)
            return null;
        TreeNode current = pRoot;
        TreeNode knode = null;
        LinkedList<TreeNode> stack = new LinkedList<>();
        int count = 0;
        while(!stack.isEmpty() || current != null){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            if(!stack.isEmpty()){
                current = stack.pop();//每出栈一个节点让count++;对比count和K的值，第k个节点时跳出循环返回节点
                count ++;
                if(count == k){
                    knode = current;
                    break;
                }
                current = current.right;
            }
        }
        return knode;
    }

}
