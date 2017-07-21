package Offer_25;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * 二叉树中和为某一值的所有路径
 *    前序遍历二叉树，
 */
public class FindPath {
	 private  ArrayList<ArrayList<Integer>> list = new  ArrayList<ArrayList<Integer>>();
	    public ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target) {
	    	if(root == null)
	            return list;
	        LinkedList<TreeNode> queue = new LinkedList<>();   //用队列来存储路径中的结点
	        findPath(root,target,queue);
//	        for(ArrayList<Integer> l : list){
//	        	for(Integer i : l){
//	        		System.out.print(i+",");
//	        	}
//	        	System.out.println("");
//	        }
	        
	        return list;
	    }
	    
	    public void findPath(TreeNode root,int target,LinkedList<TreeNode> queue){
	        if(root == null)
	            return ;
	        if(root.left == null && root.right == null){    //当前结点是叶子结点
	            if(target == root.val){   //符合所给定的结点和
	                ArrayList<Integer> alist = new ArrayList<>();
	                for(TreeNode node : queue){
	                    alist.add(node.val);   //将该路径中的所有节点全部添加进链表中
	                }
	                alist.add(root.val);
	                for(Integer i : alist){
	                	System.out.print(i+" ");
	                }
	                System.out.println("");
	                list.add(alist);
	            }
	        }else{
	            queue.offer(root);   //将当前结点压进栈
	            if(root.left != null)
	                findPath(root.left,target-root.val,queue);
	            if(root.right != null){
	                findPath(root.right,target-root.val,queue);
				queue.pollLast();   //删除队列末尾结点，返回到其父节点
	            }
	        }
	    }
}
