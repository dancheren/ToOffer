package Offer_37;

public class Main {

	public static void main(String[] args) {
		//Node head1 = new Node(0);
		//Node head2 = new Node(0);
       Node node1= new Node(2);
       Node second1 = new Node(3);
       Node thrid1 = new Node(4);
       //head1.next = node1;
       node1.next = second1;
       second1.next = thrid1;
       
       Node node2= new Node(5);
       Node second2 = new Node(3);
       Node thrid2 = new Node(4);
       //head2.next = node2;
       node2.next = second2;
       second2.next = thrid2;
       FindFirstCommonNode f = new FindFirstCommonNode();
       int ans = f.findFirstCommonNode(node1, node2).value;
       System.out.println(ans);
	}

}
