package Offer_07;

import java.util.Stack;

public class TwoStacksQueue {
	Stack<Integer> stackPush;
	Stack<Integer> stackPop;
	public TwoStacksQueue(){
		stackPush = new Stack<>();
		stackPop = new Stack<>();
	}
	public void add(int addNum){
		stackPush.push(addNum);
	}
	public int poll(){
		if(stackPush.isEmpty() && stackPop.isEmpty()){
			throw new RuntimeException("Queue is empty!");
		}else if(stackPop.isEmpty()){    //如果输出栈为空，先将输入栈中的元素添加进输出栈
			
			while(!stackPush.isEmpty()){
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}
	public int peek(){
		if(stackPush.isEmpty() && stackPop.isEmpty()){
			throw new RuntimeException("Queue is empty!" );
		}else if(stackPop.isEmpty()){
			while(!stackPush.isEmpty()){
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.peek();
		
	}
}
