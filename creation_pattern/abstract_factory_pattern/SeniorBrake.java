package abstract_factory_pattern;

public class SeniorBrake implements IBrake {

    @Override
    public void brake() {
        System.out.println("高级制动");
    }

}
