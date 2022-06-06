package adapter_pattern;

/**
 * 适配器角色 Adapter
 * 实现目标角色 TargetHongkongPanelInterface
 * 组合使用被适配角色 AdapteeChinaMainlandPanelInterface
 * 将对目标角色的方法调用转换为被适配角色的方法调用
 */
public class Adapter implements HongKongPanel {

    private ChinaMainlandPanel chinaMainlandPanel;

    public Adapter(ChinaMainlandPanel chinaMainlandPanel) {
        this.chinaMainlandPanel = chinaMainlandPanel;
    }

    @Override
    public void offerHongKongElectricity() {
        chinaMainlandPanel.offerChinaMainlandElectricity();
    }

}
