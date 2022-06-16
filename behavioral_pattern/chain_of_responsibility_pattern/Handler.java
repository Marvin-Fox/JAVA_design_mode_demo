package chain_of_responsibility_pattern;

/**
 * 抽象处理者角色
 */
public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 处理请求的方法
     *
     * @param times
     */
    public abstract void handleRequest(Integer times);

}
