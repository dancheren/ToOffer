package Offer_59;

public class isSymmetrical {
   static class BinaryTree{
	   int val;
	   BinaryTree left = null;
	   BinaryTree right = null;
	   public BinaryTree(int val){
		   this.val = val;
	   }
   }
   
   public static boolean issymmetrical(BinaryTree root){
	   return issymmetrical(root,root);
   }
   
   public static boolean issymmetrical(BinaryTree root1,BinaryTree root2){
	   if(root1 == null && root2 == null)
		   return true;
	   if(root1 == null || root2 == null)
		   return false;
	   if(root1.val != root2.val)
		   return false;
	   return issymmetrical(root1.left,root2.right) && issymmetrical(root1.right,root2.left);
   }
   
   public static void main(String[] args) {
	   BinaryTree tree1 = new BinaryTree(8);
	   BinaryTree tree2 = new BinaryTree(6);
	   BinaryTree tree3 = new BinaryTree(9);
	   BinaryTree tree4 = new BinaryTree(5);
	   BinaryTree tree5 = new BinaryTree(7);
	   BinaryTree tree6 = new BinaryTree(7);
	   BinaryTree tree7 = new BinaryTree(5);
       tree1.left = tree2;
       tree1.right = tree3;
       tree2.left = tree4;
       tree2.right = tree5;
       tree3.left = tree6;
       tree3.right = tree7;
       System.out.println(issymmetrical(tree1));
       
}
}
