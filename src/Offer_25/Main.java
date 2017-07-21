package Offer_25;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(10);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(12);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(7);
		node1.left = node2;
		node1.right = node3;
		node2.left =node4;
		node2.right = node5;
		FindPath findPath = new FindPath();
		findPath.findPath(node1, 22);
				

	}

}
