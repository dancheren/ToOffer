package Offer_23;

import java.util.LinkedList;
import java.util.Queue;
/*
 * ������ȱ���������
 *    �ö������洢�������Ľ�㣬û������һ����㣬���ý����뵽�����У�����ý��������������ڣ�
 *    ��������������ŵ������У�ֱ�����еĽڵ㶼�����ꡣ
 *    �����ǿ�����ȱ���һ������ͼ����һ����������Ҫ�õ����У���һ�����ǰ���ʼ��㣨��һ���������Ǹ���㣩���뵽������
 *    ������ÿһ�δӶ�����ȡһ����㣬����������֮������ܹ�����Ľ�㣨�����������ӽ�㣩��һ�η��뵽�����У�
 *    �ظ�����������̣�ֱ�������еĽ��ȫ��������Ϊֹ��
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
