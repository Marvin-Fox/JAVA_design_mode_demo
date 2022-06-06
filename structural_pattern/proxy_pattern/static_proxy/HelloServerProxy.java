package proxy_pattern.static_proxy;

public class HelloServerProxy implements HelloServer {

    private HelloServer helloServer;

    public HelloServerProxy(HelloServer helloServer) {
        this.helloServer = helloServer;
    }

    @Override
    public void say(String value) {
        System.out.println("Proxy : befor");
        helloServer.say(value);
        System.out.println("Proxy : after");

    }

}
