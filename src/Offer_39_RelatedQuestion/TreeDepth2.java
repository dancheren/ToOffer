package Offer_39_RelatedQuestion;


public class TreeDepth2 {
	
	//最佳解法，用后序遍历
	private static boolean isBalance = true;   //用来判定二叉树是否为平衡的标志
    public static boolean IsBalanced_Solution(BinaryTreeNode root) {
    	if(root == null)
            return true;
        int result = getDepth(root);
        return isBalance == true ? true: false;
    }
    
    public static int getDepth(BinaryTreeNode root){  //后序遍历二叉树，判定每个节点是否为平衡结点，这样避免从上往下重复遍历二叉树的结点
        if(root == null)
            return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if(Math.abs(left-right) >1)
            isBalance = false;
        return left > right ? left +1 : right +1;
    }
    
	public static final int UNB = -99;   //��һ���������ж�����ֵ
	public static void main(String[] args) {
		BinaryTreeNode node1 = new BinaryTreeNode(1);
		BinaryTreeNode node2 = new BinaryTreeNode(2);
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		BinaryTreeNode node7 = new BinaryTreeNode(7);
		BinaryTreeNode node8 = new BinaryTreeNode(8);
		BinaryTreeNode node9 = new BinaryTreeNode(9);
		BinaryTreeNode node0 = null;
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.right = node6;
		node5.left = node7;
		node7.left = node8;
		node8.left = node9;
		
		System.out.println(IsBalanced_Solution(node1));
		int result = balanceJudge(node1);
		if(result == 0)
			System.out.println("Unbalanced");
		else if(result != UNB)
		System.out.println("Balanced");
		else{
			System.out.println("Unbalanced");
		}
			
	}
/*
	public static boolean isBalanced(BinaryTreeNode head, int depth) {
		if (head == null) {
			depth = 0;
			return true;
		}
		int left = 0; 
		int right = 0;
		if (isBalanced(head.left, left) && isBalanced(head.right, right)) {
			int diff = left - right;
			if (Math.abs(diff) < 1) {
				depth = 1 + (left > right ? left : right);
				return true;
			}
		}
		return false;
	}
	
	public static boolean IsBalance(BinaryTreeNode head){
		if(head == null){
			return false;
		}
		int depth = 0;
		return isBalanced(head, depth);
	}
	*/
	
	public static int balanceJudge(BinaryTreeNode root){
		if(root == null)
			return 0;
		int l = balanceJudge(root.left);
		int r = balanceJudge(root.right);
		if(l == UNB || r == UNB || Math.abs(l-r) > 1)
			return UNB;
		return 1+(l>r?l:r);
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
