package strategy_pattern;

/**
 * 返现促销策略 CashbackStrategy 类
 */
public class CashbackStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现，直接打款到支付宝账号");
    }
}
