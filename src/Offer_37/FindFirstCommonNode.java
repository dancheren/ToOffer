package Offer_37;
/*
 * ��������ĵ�һ���������
 *   ����������������й����Ľ�㣬��ô�����������ĳһ��㿪ʼ�����ǵ�m_pNext��ָ��ͬһ����㣬
 *   �������ǵ�������Ľ�㣬֮���������н�㶼���غϵģ��������ٳ��ֲַ档���������й������������غϵ�����
 *   ������״��������һ��Y������������X��
 *     ������������й�����㣬��ô���������������������β����������Ǵ����������β����ʼ��ǰ�Ƚϣ�
 *     ���һ����ͬ�Ľ���������Ҫ�ҵĽ�㡣���������ڵ��������У�����ֻ�ܴ�ͷ��㿪ʼ��˳�������
 *     �����ܵ���β�ڵ㡣��󵽴��β�ڵ�ȴҪ���ȱ��Ƚϣ����������ǲ��������ȳ���
 *     Ҳ�����Ǿ����뵽��ջ���ص������������⣺�ֱ����������Ľ���������ջ��������������β�ڵ��λ������ջ��ջ����
 *     �������Ƚ�����ջ���Ľ���Ƿ���ͬ�������ͬ�����ջ���������űȽ���һ��ջ����ֱ���ҵ����һ����ͬ�Ľ�㡣
������˼·�У�������Ҫ����������ջ���������ĳ��ȷֱ�Ϊm��n����ô�ռ临�Ӷ���O(m+n)��
����˼·��ʱ�临�Ӷ�Ҳ��O(m+n��.���ʼ����������ȣ�ʱ��Ч�ʵõ�����ߣ��൱�����ÿռ����Ļ�ȡ��ʱ��Ч�ʡ�
֮������Ҫ�õ�ջ������Ϊ������ͬʱ������������ջ��β�ڵ㡣����������ĳ��Ȳ���ͬʱ��������Ǵ�ͷ��ʼ������������ջ��β�ڵ��ʱ��Ͳ�һ�¡�
��ʵ���������⻹��һ�����򵥵İ취�����ȱ�����������õ����ǵĳ��ȣ�����֪���ĸ�����Ƚϳ����Լ���������ȶ̵�����༸����㡣
�ڵڶ��α�����ʱ���ڽϳ����������������ɲ���������ͬʱ�����������ϱ������ҵ���һ����ͬ�Ľ��������ǵĵ�һ��������㡣
������˼·�ȵڶ���˼·��ȣ�ʱ�临�Ӷ�ΪO(m+n)�������ǲ�����Ҫ����ջ���������˿ռ�Ч�ʡ������Թٿ϶������ǵ����һ��˼·��ʱ�򣬿��Զ���д�����ˡ�
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
    		 while(headShort != null &&      //ʱ�临�Ӷ�ΪO��m+n��
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
