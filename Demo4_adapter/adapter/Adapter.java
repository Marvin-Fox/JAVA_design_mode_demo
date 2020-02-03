package adapter;

/**适配器角色 Adapter
* 实现目标角色 TargetHongkongPanelInterface
* 组合使用被适配角色 AdapteeChinaMainlandPanelInterface
* 将对目标角色的方法调用转换为被适配角色的方法调用
* @author noteless
*
*/
public class Adapter implements HongKongPanel{
	
	private ChinaMainlandPanel chinaMainlandPanel;
	
	public Adapter(ChinaMainlandPanel chinaMainlandPanel) {
		// TODO Auto-generated constructor stub
		this.chinaMainlandPanel = chinaMainlandPanel;
	}

	@Override
	public void offerHongKongElectricity() {
		// TODO Auto-generated method stub
		chinaMainlandPanel.offerChinaMainlandElectricity();
	}

}
