package abstract_factory_pattern;

public class CarEntity {
    private IBrake brake;

    private IEngine engine;

    private ITire tire;

    public IBrake getBrake() {
        return brake;
    }

    public void setBrake(IBrake brake) {
        this.brake = brake;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public ITire getTire() {
        return tire;
    }

    public void setTire(ITire tire) {
        this.tire = tire;
    }


}
