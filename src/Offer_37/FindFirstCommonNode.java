package Offer_37;
/*
 * 两个链表的第一个公共结点
 *   如果两个单向链表有公共的结点，那么这两个链表从某一结点开始，它们的m_pNext都指向同一个结点，
 *   但由于是单向链表的结点，之后他们所有结点都是重合的，不可能再出现分叉。所以两个有公共结点而部分重合的链表，
 *   拓扑形状开起来像一个Y，而不可能项X。
 *     如果两个链表有公共结点，那么公共结点出现在两个链表的尾部。如果我们从两个链表的尾部开始往前比较，
 *     最后一个相同的结点就是我们要找的结点。可问题是在单向链表中，我们只能从头结点开始按顺序遍历，
 *     最后才能到达尾节点。最后到达的尾节点却要最先被比较，这听起来是不是像后进先出，
 *     也是我们就能想到用栈的特点来解决这个问题：分别把两个链表的结点放入两个栈里，这样两个链表的尾节点就位于两个栈的栈顶，
 *     接下来比较两个栈顶的结点是否相同。如果相同，则把栈顶弹出接着比较下一个栈顶，直到找到最后一个相同的结点。
在上述思路中，我们需要用两个辅助栈。如果链表的长度分别为m和n，那么空间复杂度是O(m+n)。
这种思路的时间复杂度也是O(m+n）.和最开始的蛮力法相比，时间效率得到了提高，相当于是用空间消耗换取了时间效率。
之所以需要用到栈，是因为我们想同时遍历到达两个栈的尾节点。当两个链表的长度不相同时，如果我们从头开始遍历到达两个栈的尾节点的时间就不一致。
其实解决这个问题还有一个更简单的办法：首先遍历两个链表得到他们的长度，就能知道哪个链表比较长，以及长的链表比短的链表多几个结点。
在第二次遍历的时候，在较长的链表上先走若干步，接着再同时在两个链表上遍历，找到第一个相同的结点就是他们的第一个公共结点。
第三种思路比第二种思路相比，时间复杂度为O(m+n)，但我们不在需要辅助栈，因此提高了空间效率。当面试官肯定了我们的最后一个思路的时候，可以动手写代码了。
 */
public class FindFirstCommonNode {
    
    	 public Node findFirstCommonNode(Node head1,Node head2){
    		 int len1 = getListLength(head1);
    		 int len2 = getListLength(head2);
    		 Node headLong = head1;
    		 Node headShort = head2;
    		 int lengthDif = 0;
    		 if(len1 < len2){
    			 headLong = head2;
    			 headShort = head1;
    			 lengthDif = len2 - len1; 
    		 }else{
//    			 headLong = head1;
//    			 headShort = head2;
    			 lengthDif = len1 - len2; 
    		 }
    		 for(int i = 0;i<lengthDif;i++){
    			 headLong = headLong.next;
    		 }
    		 while(headShort != null &&      //时间复杂度为O（m+n）
    				 headLong != null && 
    				 headShort.value != headLong.value){
    			 
    			 headShort = headShort.next;
    			 headLong = headLong.next;
    		 }
    		 Node ans = headLong;
    		 return ans;
    		 
    	 }
    	 
         public int getListLength(Node head){
        	 int len = 0;
        	 if(head == null)
        		 return len;
        	 Node pNode = head;
        	 while(pNode != null){
        		 ++ len;
        		 pNode = pNode.next;
        	 }
        	 return len;
         }
}
