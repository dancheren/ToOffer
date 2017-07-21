package Offer_58;

public class Solution {
	public static TreeLinkNode GetNext(TreeLinkNode pNode) {
		if (pNode == null)
			return null;
		TreeLinkNode curNode = null;
		if (pNode.right != null) {
			curNode = pNode.right;
			while (curNode.left != null) {
				curNode = curNode.left;
			}
			return curNode;
		} else {
			while (pNode.next != null) {
				if (pNode.next.left == pNode) {
					return pNode.next;
				} else {
					pNode = pNode.next;
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		TreeLinkNode node1 = new TreeLinkNode(1);
		TreeLinkNode node2 = new TreeLinkNode(2);
		TreeLinkNode node3 = new TreeLinkNode(3);
		TreeLinkNode node4 = new TreeLinkNode(4);
		TreeLinkNode node5 = new TreeLinkNode(5);
		TreeLinkNode node6 = new TreeLinkNode(6);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node2.next = node1;
		node3.next = node1;
		node4.next = node2;
		node5.next = node2;
        node6.next = node3;
        System.out.println(GetNext(node1)==null?null:GetNext(node1).val);
	}
}
