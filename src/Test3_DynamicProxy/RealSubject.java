package Test3_DynamicProxy;

public class RealSubject implements Subject {

	@Override
	public void rent() {
		System.out.println("I want to rent a house!");
	}

	@Override
	public void Hello(String str) {
		System.out.println("Hello " + str);

	}

}
