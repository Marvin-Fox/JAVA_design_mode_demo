package strategy_pattern;

/**
 * 促销活动方案 PromotionActivity 类
 */
public class PromotionActivity {
    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    //执行
    public void execute(){
        strategy.doPromotion();
    }

}
