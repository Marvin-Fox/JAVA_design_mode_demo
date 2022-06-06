package proxy_pattern.dynamic_proxy;

/**
 * 被代理的对象【真正做自己事情的对象】
 */
public class HelloServerImpl implements HelloServer {

    @Override
    public int sayHello() {
        System.out.println("helloServerImpl-->sayHello()");
        return 1;
    }

    @Override
    public int sayYes(String a) {
        System.out.println("say Yes");
        return sayHello();
    }

}
