package abstract_factory_pattern;


public class Q3Factory extends CarFactory {

    public Q3Factory() {
        System.out.println("生产Q3汽车");
    }


    @Override
    public ITire createTire() {
        NormalTire normalTire = new NormalTire();
        normalTire.tire();
        return normalTire;
    }

    @Override
    public IEngine createEngine() {
        SeniorEngine seniorEngine = new SeniorEngine();
        seniorEngine.engine();
        return seniorEngine;
    }

    @Override
    public IBrake createBrake() {
        NormalBrake normalBrake = new NormalBrake();
        normalBrake.brake();
        return normalBrake;
    }

    @Override
    public CarEntity getCar() {
        CarEntity carEntity = new CarEntity();
        carEntity.setBrake(this.createBrake());
        carEntity.setEngine(this.createEngine());
        carEntity.setTire(this.createTire());
        return carEntity;
    }

}
