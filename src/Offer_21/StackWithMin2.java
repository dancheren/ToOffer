package Offer_21;

import java.util.Stack;

public class StackWithMin2 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    public StackWithMin2(){
    	this.stackData = new Stack<>();
    	this.stackMin = new Stack<>();
    }
    
    public void push(int data){
    	if(this.stackMin.isEmpty()){
    		this.stackMin.push(data);
    	}else if(data <= getMin()){
    		this.stackMin.push(data);
    	}
    	this.stackData.push(data);
    }
    
    public int pop(){
    	if(this.stackData.isEmpty())
    		throw new RuntimeException("error");
    	int value = this.stackData.pop();
    	if(value == this.getMin()){
    		this.stackMin.pop();
    	}
    	return value;
    }

	public  int getMin() {
		if(this.stackMin.isEmpty())
			throw new RuntimeException("stack is empty!");
		return this.stackMin.peek();
	}
}
