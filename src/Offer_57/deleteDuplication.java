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
	 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣
	 *  ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
	 *  ˼·���������������һ ɾ���ظ��Ľ���а����׽ڵ㣻�� ɾ�����ظ�����в������׽ڵ�
	 *      ��������ָ��preNode��curNode��preNodeָ��ָ���һ�����ظ��Ľ���ϣ�
	 *      curNodeָ��ǰ��㣬curNode����ƶ�����curNode��curNode.next���ʱ����preNode
	 *      ָ����curNode����ȵĽ�㣻ֱ��curNodeָ�������β������pHead��㣻
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
				if(preNode == null){   //ͷ��㱻ɾ����
					pHead = curNode.next;   //pHeadָ���һ�����ظ��Ľ�㴦
				}else{
					preNode.next = curNode.next;//ͷ���û��ɾ����preNodeָ����һ�����ظ��Ľ��
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
