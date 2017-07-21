package Offer_64;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(30, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o1-o2;    //����С����˳��ѹ�뵽���ȶ�����
		}
    });
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(30, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2-o1;     //���Ӵ�С˳��ѹ�뵽���ȶ�����
		}
    });
    int count = 0;
    public void Insert(Integer num){
 //����������Ϊż��ʱ���¼����Ԫ�أ�Ӧ������С���ѣ�ע�ⲻ��ֱ�ӽ���С���ѣ�
 //���Ǿ������ɸѡ��ȡ����������Ԫ�ؽ���С���ѣ�
    	if(count % 2 == 0){
    		maxHeap.offer(num);
    		int temp = maxHeap.poll();
    		minHeap.offer(temp);
 //����������Ϊ����ʱ���¼����Ԫ�أ�Ӧ���������ѣ�ע�ⲻ��ֱ�ӽ������ѣ�
 //���Ǿ�С����ɸѡ��ȡС��������СԪ�ؽ������ѣ�
    	}else{
    		minHeap.offer(num);
    		int temp = minHeap.poll();
    		maxHeap.offer(temp);
    	}
    	count ++;
    }
    
    public double GetMedian(){
    	if(count % 2 == 0){
    		return new Double(maxHeap.peek() + minHeap.peek()) / 2;
    	}
    	else{
    		return new Double(minHeap.peek());
    	}
    }
	
    
    public static void main(String[] args) {
    		boolean[] re = new boolean[2];
    		for(boolean r : re){
    			System.out.println(r);
    		}
	}

}
