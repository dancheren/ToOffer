package Offer_15;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class FindKthToTail {
	/*
	 * 需要遍历两边链表，思路常规，但不一定符合面试官的本意
	 */
	public ListNode FindKthToTail1(ListNode head, int k) {
		if (head == null || k == 0)
			return null;
		ListNode temp = head;
		int sum = 0;
		while (temp != null) {
			sum++;
			temp = temp.next;
		}
		if (sum < k)
			return null;
		temp = head;
		int i = 1;
		while (i != sum - k + 1) {
			temp = temp.next;
			i++;
		}
		return temp;
	}

	/*
	 * 只遍历一遍链表，让两个指针相隔k-1，同时移动两个指针，当前面指针到达最后一个结点时，后一个指向倒数第k个结点
	 */
	public ListNode FindKthToTail2(ListNode head, int k) {
		if (head == null || k == 0)
			return null;
		ListNode node1 = head;
		ListNode node2 = head;
		int i = 1;
		while (i < k) {
			node1 = node1.next;
			if (node1 == null)
				return null;
			i++;
		}
		while (node1 != null) {
			node1 = node1.next;
			if (node1 == null) {
				break;
			}
			node2 = node2.next;
		}
		return node2;
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
		FindKthToTail f = new FindKthToTail();
		ListNode result = f.FindKthToTail2(node1, 7);
		System.out.println(result.val);
	}
}