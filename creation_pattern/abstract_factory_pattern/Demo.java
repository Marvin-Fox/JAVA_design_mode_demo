package abstract_factory_pattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory carFactory=new Q3Factory();

		CarEntity carEntity=carFactory.getCar();

	}

}
