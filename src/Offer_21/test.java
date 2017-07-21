package Offer_21;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackWithMin stack = new StackWithMin();
		StackWithMin2 stack2 = new StackWithMin2();
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.push(5);
		stack2.push(3);
		stack2.push(2);
		stack2.push(1);
		stack2.push(5);
		System.out.print("stack pop number is: "+stack.pop()+" ");
		System.out.print("stack getMin is: "+ stack.getMin());
		System.out.println("");
		System.out.print("stack2 pop number is: "+stack2.pop()+" ");
		System.out.print("stack2 getMin is: "+stack2.getMin());
	}

}
