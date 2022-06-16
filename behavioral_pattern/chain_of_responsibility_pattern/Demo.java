package chain_of_responsibility_pattern;

/**
 * 责任链模式 (Chain of Responsibility Pattern)
 * 核心思想【是将链中每一个节点看作是一个对象，每个节点处理的请求均不同，且内部自动维护—个下—节点对象】
 *
 * 当—个清求从链式的首端发出时，会沿看链的路径依次传递给每—个节点对象，直至有对象处理这个清求为止。属于行为型模式。
 */
public class Demo {

    public static void main(String[] args) {
        //组装责任链
        Handler first = new FirstInterview();
        Handler second = new SecondInterview();
        Handler three = new ThreeInterview();
        first.setNextHandler(second);
        second.setNextHandler(three);

        //提交请求
        // 第一次面试
        first.handleRequest(1);
        System.out.println();
        // 第二次面试
        first.handleRequest(2);
        System.out.println();
        // 第三次面试
        first.handleRequest(3);
        System.out.println();
    }
}
