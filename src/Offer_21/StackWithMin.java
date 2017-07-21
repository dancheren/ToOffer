package Offer_21;

import java.util.Stack;

public class StackWithMin {
   private Stack<Integer> stackData;
   private Stack<Integer> stackMin;
   public StackWithMin(){
	   this.stackData = new Stack<>();
	   this.stackMin = new Stack<>();
   }
   
   public void push(int newNum){
	   if(this.stackMin.isEmpty()){
		   this.stackMin.push(newNum);
	   }else if(newNum < this.getMin()){
		   this.stackMin.push(newNum);
	   }else{
		   int temp = this.stackMin.peek();
		   this.stackMin.push(temp);
	   }
	   this.stackData.push(newNum);
   }
   
   public int pop(){
	   if(this.stackMin.isEmpty()){
		   throw new RuntimeException("stack is empty!");
	   }
	   this.stackMin.pop();
	   return this.stackData.pop();
   }

public  int getMin() {
	if(this.stackMin.isEmpty()){
		throw new RuntimeException("error");
	}
	return this.stackMin.peek();
}
}
