package proxy_pattern.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class Demo {

    public static void main(String[] args) {

        HelloServerImpl helloServerImpl = new HelloServerImpl();

        /**
         * Proxy.newProxyInstance参数描述
         * @param ClassLoader loader：定义代理类的类装入器
         * @param Class<?>[] interfaces：代理类的接口列表来实现
         * @param InvocationHandler h：将方法调用分派给的调用处理程序
         */
        HelloServer helloServer = (HelloServer) Proxy.newProxyInstance(
                HelloServer.class.getClassLoader(),
                new Class[]{HelloServer.class},
                new HelloServerProxy(helloServerImpl)
        );

        System.out.println(helloServer.sayHello());
        System.out.println(helloServer.sayYes("aa"));

    }

}
