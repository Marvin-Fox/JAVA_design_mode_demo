package abstract_factory_pattern;

/**
 * 抽象工厂模式
 */
public class Demo {

    public static void main(String[] args) {
        CarFactory carFactory = new Q3Factory();

        CarEntity carEntity = carFactory.getCar();

    }

}
