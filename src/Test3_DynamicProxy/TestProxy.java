package Test3_DynamicProxy;

import java.lang.reflect.*;

public class TestProxy {

	public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new DynamicProxy(subject);
        Subject subj = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        subj.rent();
        subj.Hello("Tom");
        		
	}

}
