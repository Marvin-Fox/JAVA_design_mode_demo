package adapter;

public class Demo {

	/*
	* 测试主程序,港版插头 插入到适配器上
	* 适配器插入到大陆面板上
	*/
	public static void main(String[] args) {

		//港版插头
		ClientHongKongSocket socket = new ClientHongKongSocket();
		
		//大陆面板
		ChinaMainlandPanel chinaMainlandPanel = new ChinaMainlandPanelimpl();
		
		//适配器
		Adapter adapter = new Adapter(chinaMainlandPanel);
		
		//港版插头 插到 适配器上
		socket.plugIn(adapter);
	}

}
