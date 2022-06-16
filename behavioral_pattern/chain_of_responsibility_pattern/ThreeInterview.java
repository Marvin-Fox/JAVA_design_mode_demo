package chain_of_responsibility_pattern;

/**
 * 具体处理者角色3:第三次面试
 */
public class ThreeInterview extends Handler {
    @Override
    public void handleRequest(Integer times) {
        if (times == 3 ) {
            System.out.println("第三次面试" + times + "，恭喜面试通过，HR会跟你联系！！！");
        } else {
            System.out.println("没有人处理该请求！");
        }
    }
}
