package Offer_18;

/*
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Solution {
	static class BinaryTree {
		int val;

		BinaryTree(int val) {
			this.val = val;
		}

		BinaryTree left;
		BinaryTree right;
	}

	public static boolean HasSubtree(BinaryTree root1,BinaryTree root2) {
        boolean result = false;
        if(root1 != null && root2 != null){
           if(root1.val == root2.val){
               result = DoesTree1HaveTree2(root1,root2);
           }
           if(!result){
               result = HasSubtree(root1.left,root2);  //根结点不相等，从根结点的左子节点判断
           } 
           if(!result){
               result = HasSubtree(root1.right,root2);   //根结点的左子节点与root2不相等，从root1的右子结点判断
           }
        }
        return result;
    }
    public static boolean DoesTree1HaveTree2(BinaryTree root1,BinaryTree root2){   //判断以root1，root2为根节点的两棵树是否存在子树关系
        if(root2 == null)   //root2到了叶子结点，说明对应结点都相等
            return true;   
        if(root1 == null)     //root1到了叶子结点，而root2还没到叶子结点，此时root2不是root1 的子树
            return false;
        if(root1.val != root2.val)    //对应结点的值不相等，不是子树关系
            return false;
        //结点值相等，继续判断root1的左子节点与root2的左子节点是否相等，判断root1的右子节点与root2的右子节点是否相等
        return DoesTree1HaveTree2(root1.left,root2.left) && DoesTree1HaveTree2(root1.right,root2.right);
    }

	public static void main(String[] args) {
       BinaryTree n1 = new BinaryTree(1);
       BinaryTree n2 = new BinaryTree(2);
       BinaryTree n3 = new BinaryTree(3);
       BinaryTree n4 = new BinaryTree(4);
       BinaryTree n5 = new BinaryTree(5);
       BinaryTree n6 = new BinaryTree(6);
       BinaryTree n7 = new BinaryTree(7);
       BinaryTree n8 = new BinaryTree(2);
       BinaryTree n9 = new BinaryTree(4);
       BinaryTree n10 = new BinaryTree(5);
       n1.left = n2;
       n1.right = n3;
       n2.left = n4;
       n2.right = n5;
       n3.left = n6;
       n3.right = n7;
       n8.left = n9;
       n8.right = n10;
       System.out.println(HasSubtree(n1, n8));
	}

}
