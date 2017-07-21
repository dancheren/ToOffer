package Offer_16;
/*
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class Solution {
	static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode pHead = null;
		ListNode pCur = head;
		ListNode pPre = null;
		ListNode pNext = null;
		while (pCur != null) {
			pNext = pCur.next;
			if (pNext == null) {
				pHead = pCur;
			//break;此处不能退出循环，因为反转时链表处于断裂状态，需要将当前结点与前面结点连接
			}
			//以下操作将当前结点与前面结点连接
			pCur.next = pPre;
			pPre = pCur;
			pCur = pNext;
		}
		return pHead;
	}
	
	 /*
    递归实现链表的反转
    */
     public ListNode ReverseList1(ListNode head) {
     if(head==null||head.next ==null)
            return head;
        ListNode prev = ReverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return prev;
     }

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		ListNode result = reverseList(node1);
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

}
