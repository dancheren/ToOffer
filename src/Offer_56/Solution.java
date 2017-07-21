package Offer_56;
/*
 * 

第一步，找环中相汇点。分别用p1，p2指向链表头部，p1每次走一步，p2每次走二步，直到p1==p2找到在环中的相汇点。
  
第二步，找环的入口。接上步，当p1==p2时，p2所经过节点数为2x,p1所经过节点数为x,设环中有n个节点,
p2比p1多走一圈有2x=n+x;n=x;可以看出p1实际走了一个环的步数，再让p2指向链表头部，p1位置不变，
p1,p2每次走一步直到p1==p2; 此时p1指向环的入口。
 */

public class Solution {
	static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val){
			this.val = val;
		}
	}
	
    public ListNode EntryNodeOfLoop(ListNode head){
    	if(head == null || head.next == null)
    		return null;
    	ListNode low = head;
    	ListNode fast = head;
    	while(fast != null && fast.next != null){
    		low = low.next;
    		fast = fast.next.next;
    		if(low == fast){
    			fast = head;
    			while(fast != low){
    				low = low.next;
    				fast = fast.next;
    			}
    			return low;
    		}
    	}
    	return null;
    }
    
    public static void main(String[] args) {
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(2);
    	ListNode node3 = new ListNode(3);
    	ListNode node4 = new ListNode(4);
    	ListNode node5 = new ListNode(5);
    	ListNode node6 = new ListNode(6);
    	node1.next = node2;
    	node2.next = node3;
    	node3.next = node4;
    	node4.next = node5;
    	node5.next = node6;
    	node6.next = node4;
    	
		System.out.println(new Solution().EntryNodeOfLoop(node1).val);
	}
}
