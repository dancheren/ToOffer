package Offer_17;

/*
 * 题目描述
输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Merge {
	static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode merge(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
		ListNode pMergeHead = null;
		if (list1.val < list2.val) {
			pMergeHead = list1;
			pMergeHead.next = merge(list1.next, list2);
		} else {
			pMergeHead = list2;
			pMergeHead.next = merge(list1, list2.next);
		}
		return pMergeHead;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		node1.next = node3;
		node2.next = node4;
		node3.next = node5;
		node4.next = node6;
		node5.next = node7;
		ListNode result = merge(node1, node2);
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

}
