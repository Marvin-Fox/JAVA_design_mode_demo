package abstract_factory_pattern;

public class SeniorTire implements ITire {

    @Override
    public void tire() {
        System.out.println("高级轮胎");
    }

}
