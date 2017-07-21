package Test3_DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
	private Object subject;

	public DynamicProxy(Object subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before rent a house");
		System.out.println("you know the proxy name is: " + method.getName());
		System.out.println("------------------------------------");
		method.invoke(subject, args);
		System.out.println("------------------------------------");

		System.out.println("now you can live in the new house!");
		System.out.println();

		return null;
	}

}
