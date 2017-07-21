package Offer_65;

import java.util.*;

import Offer_29.mainTest;

public class maxInWindows {
     public static ArrayList<Integer> max(int[] num,int size){
    	 ArrayList<Integer> list = new ArrayList<>();
    	 if(num == null || size <=0)
    		 return list;
    	 LinkedList<Integer> queue = new LinkedList<>();
    	 for(int i=0;i<num.length;i++){
    		 while(!queue.isEmpty() && num[queue.peekLast()] <= num[i]){
    			 queue.addLast(i);
    		 }
    		 queue.addLast(i);
    		 if(queue.peekFirst() == i-size)
    			 queue.pollFirst();
    		 if(i>=size-1){
    			 list.add(num[queue.peekFirst()]);
    		 }
    	 }
    	 return list;
     }
     
     public static void main(String[] args) {
		int[] a = {2,3,4,2,6,2,5,1};
		ArrayList<Integer> list = max(a,3);
		for(Integer i:list){
			System.out.print(i+" ");
		}
	}
}
