package dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 
 * 动态代理
 *
 */
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloServer helloServer = (HelloServer) Proxy.newProxyInstance(HelloServer.class.getClassLoader(),
				new Class[] { HelloServer.class }, new HelloServerProxy());
		
		System.out.println(helloServer.sayHello());
		System.out.println(helloServer.sayYes("aa"));

	}

}
