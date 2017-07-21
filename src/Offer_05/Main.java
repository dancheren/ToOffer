package Offer_05;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintListReversingly p = new PrintListReversingly();
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
        p.printListReversingly(node1);
	}

}
