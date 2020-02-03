package dynamicProxy;

public class HelloServerImpl implements HelloServer {

	@Override
	public int sayHello() {
		// TODO Auto-generated method stub
		System.out.println("helloServerImpl-->sayHello()");
		return 1;
	}
	
	public int sayYes(String a){
		System.out.println("say Yes");
		return sayHello();
	}

}
