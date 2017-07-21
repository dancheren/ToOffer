package Offer_19;

public class Main {

	public static void main(String[] args) {
		BinaryTreeNode node1 = new BinaryTreeNode(8);
		BinaryTreeNode node2 = new BinaryTreeNode(6);
		BinaryTreeNode node3 = new BinaryTreeNode(10);
		BinaryTreeNode node4 = new BinaryTreeNode(5);
		BinaryTreeNode node5 = new BinaryTreeNode(7);
		BinaryTreeNode node6 = new BinaryTreeNode(9);
		BinaryTreeNode node7 = new BinaryTreeNode(11);

		node1.pLeft = node2;
		node1.pRight = node3;
		node2.pLeft = node4;
		node2.pRight = node5;
		node3.pLeft = node6;
		node3.pRight = node7;
		BinaryTreeMirror tree = new BinaryTreeMirror();
		// tree.mirrorRecursively(node1);
		System.out.println("-------------------");
		tree.mirrorRecursively1(node1);
		//tree.print(node1);

	}

}
