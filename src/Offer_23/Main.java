package Offer_23;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintFromTopToBottom printFromTopToBottom = new PrintFromTopToBottom();
		BinaryTreeNode binaryTreeNode1 = new BinaryTreeNode(8); 
		BinaryTreeNode binaryTreeNode2 = new BinaryTreeNode(6); 
		BinaryTreeNode binaryTreeNode3 = new BinaryTreeNode(10); 
		BinaryTreeNode binaryTreeNode4 = new BinaryTreeNode(5); 
		BinaryTreeNode binaryTreeNode5 = new BinaryTreeNode(7); 
		BinaryTreeNode binaryTreeNode6 = new BinaryTreeNode(9); 
		BinaryTreeNode binaryTreeNode7 = new BinaryTreeNode(11); 
		binaryTreeNode1.left = binaryTreeNode2;
		binaryTreeNode1.right = binaryTreeNode3;
		binaryTreeNode2.left = binaryTreeNode4;
		binaryTreeNode2.right = binaryTreeNode5;
		binaryTreeNode3.left = binaryTreeNode6;
		binaryTreeNode3.right = binaryTreeNode7;
		printFromTopToBottom.printFromTopToBottom(binaryTreeNode1);

	}

}
