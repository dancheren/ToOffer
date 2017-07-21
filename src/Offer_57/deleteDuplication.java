package Offer_57;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class deleteDuplication {
	static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	/*
	 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
	 *  例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
	 *  思路：考虑两种情况：一 删除重复的结点中包括首节点；二 删除的重复结点中不包括首节点
	 *      增加两个指针preNode和curNode，preNode指针指向第一个不重复的结点上，
	 *      curNode指向当前结点，curNode向后移动，若curNode与curNode.next相等时，让preNode
	 *      指向与curNode不相等的结点；直到curNode指向链表结尾；返回pHead结点；
	 *  
	 */
	public static ListNode deleteDuplications(ListNode pHead){
		if(pHead == null || pHead.next == null)
			return pHead;
		ListNode preNode = null;
		ListNode curNode = pHead;
		while(curNode != null){
			if(curNode.next != null && curNode.val == curNode.next.val){
				int val = curNode.val;
				while(curNode.next != null && curNode.next.val == val){
					curNode = curNode.next;
				}
				if(preNode == null){   //头结点被删除了
					pHead = curNode.next;   //pHead指向第一个不重复的结点处
				}else{
					preNode.next = curNode.next;//头结点没被删除，preNode指向下一个不重复的结点
				}
			}else{
				preNode = curNode;
			}
			curNode = curNode.next;
		}
		return pHead;
	}
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(4);
		ListNode node6 = new ListNode(4);
		ListNode node7 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
        ListNode list = deleteDuplications(node1);
        StringBuilder str = new StringBuilder();
        String s1 = "swe found se";
        String s3 = s1.replaceFirst("s\\w+", "you");
        String s2 = s1.replaceAll("s\\w+", "you");
        System.out.println(s1+ " " + s2 +" "+s3);
        List<ListNode> l = new LinkedList<ListNode>();
        while(list != null){
        	l.add(list);
        	list = list.next;
        }
        Iterator<ListNode> i = l.iterator();
        while(i.hasNext()){
        	System.out.println(i.next().val);
        }
        list = deleteDuplications(node1);
        while(list != null){
        	str.append(list.val+" ");
        	list = list.next;
        }
        System.out.println(str.toString());
        
        
	}
}
