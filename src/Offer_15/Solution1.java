package Offer_15;

public class Solution1 {
	static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
	public static ListNode middleNode(ListNode head){
		if(head == null)
			return null;
		ListNode node1 = head;
		ListNode node2 = head;
		while(node2 != null){
			node2 = node2.next.next;
			if(node2 == null)
				break;
			node1 = node1.next;
			
		}
		return node1;
	}
	public static void main(String[] args) {
       ListNode node1 = new ListNode(1);
       ListNode node2 = new ListNode(2);
       ListNode node3 = new ListNode(3);
      // ListNode node4 = new ListNode(4);
       node1.next = node2;
       node2.next = node3;
       //node3.next = node4;
       ListNode result = middleNode(node1);
       System.out.println(result.val);
	}

}
