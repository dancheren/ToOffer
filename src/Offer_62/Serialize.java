package Offer_62;

import java.util.LinkedList;
import java.util.Queue;

public class Serialize {
	static class TreeNode{
		int val ;
	    TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.val = val;
		}
	}

	public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.right = node5;
        String str = serialize(node1);
        System.out.println(str);
        TreeNode node = deserialize(str);
        print(node);
	}
	
	public static void print(TreeNode node){   //打印二叉树
		if(node == null){
			return;
		}
		System.out.print(node.val+" ");
		print(node.left);
		print(node.right);
	}
	
	public static String serialize(TreeNode root){
		if(root == null){
			return "#!";
		}
		String res = root.val+"!";
		res += serialize(root.left);
		res += serialize(root.right);
		return res;
	}
	public static TreeNode deserialize(String values){
		String[] value = values.split("!");
		LinkedList<String> queue = new LinkedList<>();
		for(int i=0;i<value.length;i++){
			queue.offer(value[i]);
		}
		return deserialize(queue);
	}
	
	public static TreeNode deserialize(LinkedList<String> queue){
		String value = queue.poll();
		if(value.equals("#"))
			return null;
		TreeNode node = new TreeNode(Integer.valueOf(value));
		node.left = deserialize(queue);
		node.right = deserialize(queue);
		return node;
	}
	
	
	//按层遍历二叉树，用队列来保存结点
	String serialize1(TreeNode root) {
        if(root == null)
            return "#!";
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        String res = root.val+"!";
        while(!queue.isEmpty()){
            TreeNode tem = queue.poll();
            if(tem.left != null){
                queue.offer(tem.left);
                res += tem.left.val+"!";
            }else{
                res += "#!";
            }
            if(tem.right != null){
                queue.offer(tem.right);
                res += tem.right.val+"!";
            }else{
                res += "#!";
            }
            
        }
        return res;
  }
    TreeNode deserialize1(String str) {
        String[] values = str.split("!");
        int index = 0;
        TreeNode head = generateTreeNodeByString(values[index++]);
        Queue<TreeNode> queue = new LinkedList<>();
        if(head != null){
            queue.offer(head);
        }
        TreeNode node = null;
        while(!queue.isEmpty()){
            node = queue.poll();
            node.left = generateTreeNodeByString(values[index++]);
            node.right = generateTreeNodeByString(values[index++]);
            if(node.left != null)
                queue.offer(node.left);
            if(node.right != null)
                queue.offer(node.right);
        }
        return head;
  }
    TreeNode generateTreeNodeByString(String value){
        if(value.equals("#"))
            return null;
        return new TreeNode(Integer.valueOf(value));
    }

}
