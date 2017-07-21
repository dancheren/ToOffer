package Offer_05;

import java.util.Stack;

public class PrintListReversingly {
	public void printListReversingly(ListNode head) {
		if (head == null)
			return;
		Stack<ListNode> stack = new Stack<ListNode>();
		while (head != null) {
			stack.push(head);
			head = head.next;
		}
		while (!stack.isEmpty()) {
			ListNode temp = stack.peek();
			int value = temp.value;
			System.out.print(value+" ");
			stack.pop();
		}
	}
}
