package proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 方法调用分派的代理调用处理器
 */
public class HelloServerProxy implements InvocationHandler {
    private Object proxied;

    public HelloServerProxy(Object proxied) {
        this.proxied = proxied;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("befor-->helloServerProxy-->invoke()");

        Object obj = method.invoke(proxied, args);

        System.out.println("after-->helloServerProxy-->invoke()");

        return obj;
    }

}
