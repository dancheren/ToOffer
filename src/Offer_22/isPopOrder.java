package Offer_22;

import java.util.Stack;

public class isPopOrder {
     public boolean isOrder(int[] arr1,int[]arr2){
    	 boolean IsOrder = false;
    	 if(arr1.length != arr2.length)
    		 return IsOrder;
    	 int j =0;
    	 Stack<Integer> stack = new Stack<>();
    	 for(int i=0;i<arr1.length;i++){
    		 stack.push(arr1[i]);
    		 while(!stack.isEmpty() && stack.peek() == arr2[j] ){
    			 stack.pop();
    			 ++ j;
    		 }
    	 }
    	 if(stack.isEmpty())
    		 IsOrder = true;
    	 return IsOrder;
     }
}
