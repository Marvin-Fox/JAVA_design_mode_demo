package adapter_pattern;

/**
 * 被适配角色 Adaptee 某种具体类型的插座面板 实现类
 * 大陆地区使用的插座面板,提供输出电流的功能
 */

public class ChinaMainlandPanelimpl implements ChinaMainlandPanel {

    @Override
    public void offerChinaMainlandElectricity() {
        System.out.println("国标面板 提供电流");
    }

}
