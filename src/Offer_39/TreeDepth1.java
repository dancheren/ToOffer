package Offer_39;

import java.util.LinkedList;

/*
 * ������������
 *   ˼·���Ӹ���㵽Ҷ�ӽ�㣨����������Ҷ�ӽ�㣩�γɵ�һ��·�����·���ĳ���Ϊ�����ȣ�
 *       �жϴ�һ������㿪ʼ����ȵ��������������е����·����1���õݹ��������
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

	//�ݹ�˼·
	public static int treeDepth(BinaryTreeNode head) {
		if (head == null)
			return 0;
		int left = treeDepth(head.left);
		int right = treeDepth(head.right);
		return (left > right) ? left + 1 : right + 1;
	}
	
	//�ǵݹ�˼·
	public static int treeDepth_(BinaryTreeNode head){
		if(head == null)
			return 0;
		BinaryTreeNode temp = null;
		int level = 0;    //��¼�������Ĳ�������Ϊ��󷵻�ֵ
		LinkedList<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(head);
		while(!queue.isEmpty()){
			int cur = 0;   //���浱ǰ�������Ľ����
			int last = queue.size();   //ÿһ��Ľڵ����ܺ�
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
			level++;    //��ĳһ��Ľ�㶼�������ˣ�������1
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
