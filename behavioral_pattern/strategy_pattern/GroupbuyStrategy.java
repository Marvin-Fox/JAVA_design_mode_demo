package strategy_pattern;

/**
 * 拼团优惠策略 GroupbuyStrategy 类
 */
public class GroupbuyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("5人成团，可以优惠");
    }
}
