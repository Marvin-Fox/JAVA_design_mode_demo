package proxy_pattern.static_proxy;

public class HelloServerImpl implements HelloServer {

	@Override
	public void say(String value) {
		// TODO Auto-generated method stub
		System.out.println("HelloServerImpl : "+value);
	}

}