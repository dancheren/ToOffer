package Offer_56;
/*
 * 

��һ�����һ������㡣�ֱ���p1��p2ָ������ͷ����p1ÿ����һ����p2ÿ���߶�����ֱ��p1==p2�ҵ��ڻ��е����㡣
  
�ڶ������һ�����ڡ����ϲ�����p1==p2ʱ��p2�������ڵ���Ϊ2x,p1�������ڵ���Ϊx,�軷����n���ڵ�,
p2��p1����һȦ��2x=n+x;n=x;���Կ���p1ʵ������һ�����Ĳ���������p2ָ������ͷ����p1λ�ò��䣬
p1,p2ÿ����һ��ֱ��p1==p2; ��ʱp1ָ�򻷵���ڡ�
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
