package Offer_60;

import java.util.ArrayList;
import java.util.LinkedList;

public class Print {

	class TreeNode {
		int val;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		if (pRoot == null)
			return list;
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(pRoot);
		int curCount = 1;
		int nextCount = 0;
		while (!queue.isEmpty()) {
			ArrayList<Integer> alist = new ArrayList<>();
			for (int i = 0; i < curCount; i++) {
				TreeNode temp = queue.poll();
				alist.add(temp.val);
				if (temp.left != null) {
					queue.offer(temp.left);
					nextCount++;
				}
				if (temp.right != null) {
					queue.offer(temp.right);
					nextCount++;
				}
			}
			list.add(alist);
			curCount = nextCount;
			nextCount = 0;
		}
		return list;
	}

}
