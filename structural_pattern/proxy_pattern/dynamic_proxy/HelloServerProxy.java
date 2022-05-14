package proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class HelloServerProxy implements InvocationHandler {
	private Object HelloServer=new HelloServerImpl();
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("befor-->helloServerProxy-->invoke()");
		
		Object obj=method.invoke(HelloServer, args);
		
		System.out.println("after-->helloServerProxy-->invoke()");
		
		return obj;
	}

}
