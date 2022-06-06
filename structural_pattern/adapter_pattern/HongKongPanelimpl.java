package adapter_pattern;


/**
 * 目标角色 Target 某个具体的港版插座面板 实现类
 * 香港地区使用的插座面板,提供输出电流的功能
 */
public class HongKongPanelimpl implements HongKongPanel {

    @Override
    public void offerHongKongElectricity() {
        System.out.println("港版面板 提供电流");
    }

}
