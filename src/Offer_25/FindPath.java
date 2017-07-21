package Offer_25;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * �������к�Ϊĳһֵ������·��
 *    ǰ�������������
 */
public class FindPath {
	 private  ArrayList<ArrayList<Integer>> list = new  ArrayList<ArrayList<Integer>>();
	    public ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target) {
	    	if(root == null)
	            return list;
	        LinkedList<TreeNode> queue = new LinkedList<>();   //�ö������洢·���еĽ��
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
	        if(root.left == null && root.right == null){    //��ǰ�����Ҷ�ӽ��
	            if(target == root.val){   //�����������Ľ���
	                ArrayList<Integer> alist = new ArrayList<>();
	                for(TreeNode node : queue){
	                    alist.add(node.val);   //����·���е����нڵ�ȫ����ӽ�������
	                }
	                alist.add(root.val);
	                for(Integer i : alist){
	                	System.out.print(i+" ");
	                }
	                System.out.println("");
	                list.add(alist);
	            }
	        }else{
	            queue.offer(root);   //����ǰ���ѹ��ջ
	            if(root.left != null)
	                findPath(root.left,target-root.val,queue);
	            if(root.right != null){
	                findPath(root.right,target-root.val,queue);
				queue.pollLast();   //ɾ������ĩβ��㣬���ص��丸�ڵ�
	            }
	        }
	    }
}
