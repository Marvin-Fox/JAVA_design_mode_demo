package strategy_pattern;

/**
 * 优惠券抵扣策略 CouponStrategy 类
 */
public class CouponStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}
