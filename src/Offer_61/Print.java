package Offer_61;

import java.util.*;

public class Print {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		TreeNode node10 = new TreeNode(10);
		TreeNode node11 = new TreeNode(11);
		TreeNode node12 = new TreeNode(12);
		TreeNode node13 = new TreeNode(13);
		TreeNode node14 = new TreeNode(14);
		TreeNode node15 = new TreeNode(15);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node4.left = node8;
		node4.right = node9;
		node5.left = node10;
		node5.right = node11;
		node6.left = node12;
		node6.right = node13;
		node7.left = node14;
		node7.right = node15;
		ArrayList<ArrayList<Integer>> result = print(node1);
		for (ArrayList<Integer> list : result) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println("");
		}
	}

	public static ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (pRoot == null)
			return result;
		LinkedList<TreeNode> s1 = new LinkedList<>();
		LinkedList<TreeNode> s2 = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(pRoot.val);
		result.add(list);
		s1.push(pRoot);
		while (s1.isEmpty() || s2.isEmpty()) {
			if (s1.isEmpty() && s2.isEmpty()) {
				break;
			}
			ArrayList<Integer> temp = new ArrayList<>();
			
			//s1,s2分别保持先右后左、先左后右的入栈顺序，如站的同时将其添加到链表中
			if (s2.isEmpty()) {
				while (!s1.isEmpty()) {  
					if (s1.peek().right != null) {
						s2.push(s1.peek().right);   //s1中每个元素的右子结点入栈
						temp.add(s1.peek().right.val);
					}
					if (s1.peek().left != null) {
						s2.push(s1.peek().left);   //s1中每个元素的左子结点入栈
						temp.add(s1.peek().left.val);
					}
					s1.pop();
				}
			} else {
				while (!s2.isEmpty()) {
					if (s2.peek().left != null) {
						s1.push(s2.peek().left);   //s2中每个元素的左子结点入栈
						temp.add(s2.peek().left.val);
					}
					if (s2.peek().right != null) {
						s1.push(s2.peek().right);   //s2中每个元素的右子结点入栈
						temp.add(s2.peek().right.val);
					}
					s2.pop();
				}
			}
			if (temp.size() > 0)
				result.add(temp);
		}

		return result;
	}

}
