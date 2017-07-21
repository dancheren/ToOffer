package Offer_64;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(30, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o1-o2;    //按从小到大顺序压入到优先队列中
		}
    });
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(30, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2-o1;     //按从大到小顺序压入到优先队列中
		}
    });
    int count = 0;
    public void Insert(Integer num){
 //当数据总数为偶数时，新加入的元素，应当进入小根堆（注意不是直接进入小根堆，
 //而是经大根堆筛选后取大根堆中最大元素进入小根堆）
    	if(count % 2 == 0){
    		maxHeap.offer(num);
    		int temp = maxHeap.poll();
    		minHeap.offer(temp);
 //当数据总数为奇数时，新加入的元素，应当进入大根堆（注意不是直接进入大根堆，
 //而是经小根堆筛选后取小根堆中最小元素进入大根堆）
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
