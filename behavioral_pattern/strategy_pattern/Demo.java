package strategy_pattern;

/**
 * 策略模式( Strategy Pattern )
 * 核心思想【策略模式可以解决在有多种算法相似的情况下,使用if…else 或swith…case所带来的复杂性和臃肿性】
 *
 * 它是将定义的算法家族、分别封装起来,让它们之间可以互相替换,从而让算法的变化不会影响到使用算法的用户。属于行为型模式
 */
public class Demo {

    public static void main(String[] args) {
        PromotionActivity promotionActivity = null;
        String promotionKey = "COUPON";
        if ("COUPON".equals(promotionKey)) {
            promotionActivity = new PromotionActivity(new CouponStrategy());
        } else if ("CASHBACK".equals(promotionKey)) {
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        }
        promotionActivity.execute();
    }

}
