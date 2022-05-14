package proxy_pattern.static_proxy;

public class HelloServerProxy implements HelloServer {
	
	private HelloServer helloServer;
	
	public HelloServerProxy(HelloServer helloServer) {
		// TODO Auto-generated constructor stub
		this.helloServer=helloServer;
	}

	@Override
	public void say(String value) {
		// TODO Auto-generated method stub
		System.out.println("Proxy : befor");
		helloServer.say(value);
		System.out.println("Proxy : after");
			
	}

}
