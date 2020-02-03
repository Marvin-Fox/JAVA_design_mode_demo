package singleton;

/**
 * 单例：饿汉模式【立即加载】
 */
public class Singleton1 {
	private static Singleton1 s1=new Singleton1();
	private Singleton1(){}
	
	public static Singleton1 get(){
		return s1;
	}
}
