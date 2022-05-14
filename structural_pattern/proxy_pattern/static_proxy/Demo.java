package proxy_pattern.static_proxy;

/**
 * 
 * 静态代理
 *
 */
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**HelloServiceProxy类的源代码是由程序员编写的，在程序运行前，它的.class文件就已经存在了，这种代理类称为静态代理类*/
		HelloServer helloServer=new HelloServerImpl();
		HelloServerProxy proxy=new HelloServerProxy(helloServer);
		proxy.say("say hello !");
		
	}

}
