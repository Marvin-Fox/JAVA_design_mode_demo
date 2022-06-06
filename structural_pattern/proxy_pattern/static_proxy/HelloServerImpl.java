package proxy_pattern.static_proxy;

public class HelloServerImpl implements HelloServer {

    @Override
    public void say(String value) {
        System.out.println("HelloServerImpl : " + value);
    }

}
