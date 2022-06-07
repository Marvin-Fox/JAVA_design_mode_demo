package adapter_pattern;

/**
 * 适配器模式
 * 核心思想【对象功能的兼容】
 * 将一个类的接口转换成客户希望的另一个接口。adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 */
public class Demo {

    /**
     * 测试主程序,港版插头 插入到适配器上
     * 适配器插入到大陆面板上
     */
    public static void main(String[] args) {

        //港版插头
        ClientHongKongSocket socket = new ClientHongKongSocket();

        System.out.println("\n======================【非适配器模式】港版插头 只能插入 港版面板======================");
        //港版面板
        HongKongPanel hongKongPanel = new HongKongPanelimpl();
        //港版插头 原先只能插到 港版面板
        socket.plugIn(hongKongPanel);

        System.out.println("\n======================【适配器模式】港版插头 可以插入 国际面板======================");
        //大陆面板
        ChinaMainlandPanel chinaMainlandPanel = new ChinaMainlandPanelimpl();
        //适配器（内部做了转换）
        Adapter adapter = new Adapter(chinaMainlandPanel);
        //港版插头 插到 适配器上
        socket.plugIn(adapter);
    }
}
