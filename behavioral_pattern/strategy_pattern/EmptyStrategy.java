package strategy_pattern;

/**
 * 无优惠策略 EmptyStrategy 类
 */
public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
