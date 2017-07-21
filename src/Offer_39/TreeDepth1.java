package Offer_39;

import java.util.LinkedList;

/*
 * 求二叉树的深度
 *   思路：从根结点到叶子结点（包含根结点和叶子结点）形成的一条路径，最长路径的长度为书的深度，
 *       判断从一个根结点开始的深度等于其左右子树中的最大路径加1，用递归来解决。
 */
public class TreeDepth1 {

	public static void main(String[] args) {
		BinaryTreeNode node1 = new BinaryTreeNode(1);
		BinaryTreeNode node2 = new BinaryTreeNode(2);
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		BinaryTreeNode node7 = new BinaryTreeNode(7);
		BinaryTreeNode node8 = new BinaryTreeNode(8);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.right = node6;
		node5.left = node7;
		node7.left = node8;
		int depth = treeDepth_(node1);
		System.out.println("The binaryTree's depth is: " + depth);
	}

	//递归思路
	public static int treeDepth(BinaryTreeNode head) {
		if (head == null)
			return 0;
		int left = treeDepth(head.left);
		int right = treeDepth(head.right);
		return (left > right) ? left + 1 : right + 1;
	}
	
	//非递归思路
	public static int treeDepth_(BinaryTreeNode head){
		if(head == null)
			return 0;
		BinaryTreeNode temp = null;
		int level = 0;    //记录二叉树的层数，作为最后返回值
		LinkedList<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(head);
		while(!queue.isEmpty()){
			int cur = 0;   //保存当前遍历过的结点数
			int last = queue.size();   //每一层的节点数总和
			while(cur<last){
				temp = queue.poll();
				cur++;
				if(temp.left != null){
					queue.offer(temp.left);
				}
				if(temp.right != null){
					queue.offer(temp.right);
				}
			}
			level++;    //当某一层的结点都遍历完了，层数加1
		}
		return level;
	}
}

class BinaryTreeNode {
	int value;
	BinaryTreeNode left;
	BinaryTreeNode right;

	public BinaryTreeNode(int value) {
		this.value = value;
	}
}
