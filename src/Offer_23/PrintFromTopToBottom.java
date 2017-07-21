package Offer_23;

import java.util.LinkedList;
import java.util.Queue;
/*
 * 宽度优先遍历二叉树
 *    用队列来存储二叉树的结点，没遍历到一个结点，将该结点放入到队列中，如果该结点的左右子树存在，
 *    将其左右子树存放到队列中，直到所有的节点都遍历完。
 *    不管是宽度优先遍历一个有向图还是一棵树，都有要用到队列，第一步我们把起始结点（对一棵树而言是根结点）放入到队列中
 *    接下来每一次从队列中取一个结点，遍历这个结点之后把它能够到达的结点（对树而言是子结点）都一次放入到队列中，
 *    重复这个遍历过程，直到队列中的结点全部被遍历为止。
 */
public class PrintFromTopToBottom {
	public void printFromTopToBottom(BinaryTreeNode head) {
		if (head == null) {
			return;
		}
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(head);
		while (!queue.isEmpty()) {
			BinaryTreeNode temp = queue.poll();
			System.out.print(temp.value+" ");
			if (temp.left != null) {
				queue.offer(temp.left);
			}
			if (temp.right != null) {
				queue.offer(temp.right);
			}
		}
	}
}
