package Offer_19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * �������ľ���
 *   ˼·��
 *      ��ǰ������������ÿ���ڵ㣬����������Ľ�����ӽ�㣬�ͽ������������ӽ�㣬
 *      �����������еķ�Ҷ�ӽ��������ӽ��֮�󣬾͵õ������ľ���
 */
public class BinaryTreeMirror {
	//�ݹ�ʵ��
    public void mirrorRecursively(BinaryTreeNode pNode){
    	if(pNode == null)
    		return;
    	if(pNode.pLeft == null && pNode.pRight == null)
    		return;
		BinaryTreeNode pTemp = pNode.pLeft; // �Ƚ�����ǰ���������ӽ��
		pNode.pLeft = pNode.pRight;
		pNode.pRight = pTemp;
		if (pNode.pLeft != null){
    		mirrorRecursively(pNode.pLeft);   //�ݹ齻���ӽ��������ӽ��
    	}
    	if(pNode.pRight != null){
    		mirrorRecursively(pNode.pRight);
    	}
    	//print(pNode);                  //�����ڴ˵���print��������Ȼ��ӡ�����Ĵ����ǻ��ҵ�
    }
    
    //ѭ��ʵ��(�ö������洢�ӽ��)
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
