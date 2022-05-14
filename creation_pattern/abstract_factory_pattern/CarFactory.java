package abstract_factory_pattern;

public abstract class CarFactory {


	/**
     * 生产轮胎
     * 
     * @return 轮胎
     * */
    public abstract ITire createTire();

    /**
     * 生产发动机
     * 
     * @return 发动机
     * */
    public abstract IEngine createEngine();

    /**
     * 生产制动系统
     * 
     * @return 制动系统
     * */
    public abstract IBrake createBrake();
    
    /**
     * 组装汽车
     * 
     * @return 获得汽车实体
     */
    public abstract CarEntity getCar();

}
