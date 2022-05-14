package singleton_pattern;

/**
 * 单例：懒汉模式【延迟加载】
 */
public class Singleton2 {
	private static Singleton2 s2= null;
	private Singleton2(){}
	
	public static Singleton2 get(){
		synchronized (s2) {
			if(null == s2){
				s2 = new Singleton2();
			}
			return s2;
		}
	}

}
