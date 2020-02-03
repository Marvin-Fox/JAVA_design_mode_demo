package abstract_factory;


public class Q3Factory extends CarFactory {
	
	public Q3Factory() {
		// TODO Auto-generated constructor stub
		System.out.println("生产Q3汽车");
	}
	

	@Override
	public ITire createTire() {
		// TODO Auto-generated method stub
		NormalTire normalTire = new NormalTire();
		normalTire.tire();
		return normalTire;
	}

	@Override
	public IEngine createEngine() {
		// TODO Auto-generated method stub
		SeniorEngine seniorEngine = new SeniorEngine();
		seniorEngine.engine();
		return seniorEngine;
	}

	@Override
	public IBrake createBrake() {
		// TODO Auto-generated method stub
		NormalBrake normalBrake = new NormalBrake();
		normalBrake.brake();
		return normalBrake;
	}

	@Override
	public CarEntity getCar() {
		// TODO Auto-generated method stub
		CarEntity carEntity = new CarEntity();
		carEntity.setBrake(this.createBrake());
		carEntity.setEngine(this.createEngine());
		carEntity.setTire(this.createTire());
		return carEntity;
	}

}
