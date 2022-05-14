package adapter_pattern;


/**目标角色 Target 某个具体的港版插座面板 实现类
* 香港地区使用的插座面板,提供输出电流的功能
* @author noteless
*
*/
public class HongKongPanelimpl implements HongKongPanel {

	@Override
	public void offerHongKongElectricity() {
		// TODO Auto-generated method stub
		System.out.println("港版面板 提供电流");
	}

}
