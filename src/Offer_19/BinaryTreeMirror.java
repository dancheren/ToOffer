package Offer_19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 二叉树的镜像
 *   思路：
 *      先前序遍历这棵树的每个节点，如果遍历到的结点右子结点，就交换他的两个子结点，
 *      当交换完所有的非叶子结点的左右子结点之后，就得到了树的镜像。
 */
public class BinaryTreeMirror {
	//递归实现
    public void mirrorRecursively(BinaryTreeNode pNode){
    	if(pNode == null)
    		return;
    	if(pNode.pLeft == null && pNode.pRight == null)
    		return;
		BinaryTreeNode pTemp = pNode.pLeft; // 先交换当前结点的左右子结点
		pNode.pLeft = pNode.pRight;
		pNode.pRight = pTemp;
		if (pNode.pLeft != null){
    		mirrorRecursively(pNode.pLeft);   //递归交换子结点的左右子结点
    	}
    	if(pNode.pRight != null){
    		mirrorRecursively(pNode.pRight);
    	}
    	//print(pNode);                  //不能在此调用print方法，不然打印出来的次序是混乱的
    }
    
    //循环实现(用队列来存储子结点)
    public void mirrorRecursively1(BinaryTreeNode pNode){
    	if(pNode == null || (pNode.pLeft == null && pNode.pRight == null))
    		return ;
    	Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
    	stack.push(pNode);
    	while(!stack.isEmpty()){
    		BinaryTreeNode temp = stack.pop();
    		//System.out.println(temp.value);
    		if(temp.pLeft != null || temp.pRight != null ){
    			BinaryTreeNode temp1 = temp.pLeft;
    			temp.pLeft = temp.pRight;
    			temp.pRight = temp1;
    		}
    		if(temp.pRight != null){
    			stack.push(temp.pRight);
    		}
    		if(temp.pLeft != null){
    			stack.push(temp.pLeft);
    		}
    	}
    	print(pNode);
    }
    
    public void print(BinaryTreeNode node){
    	if(node == null)
    		return;
    	Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
    	queue.offer(node);
    	while(!queue.isEmpty()){
    		BinaryTreeNode node1 = queue.poll();
    		System.out.print(node1.value+" ");
	    	if(node1.pLeft != null)
	    		queue.offer(node1.pLeft);
	    	if(node.pRight != null)
	    		queue.offer(node1.pRight);
    	}
    }
}
