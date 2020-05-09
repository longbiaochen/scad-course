package abstract_factory;

public class HaierFactory implements EFactory {
    @Override
    public Television produceTelevision() {
	System.out.println("电视机工厂正在生产海尔电视机！");
	return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
	System.out.println("空调工厂正在生产海尔空调！");
	return new HairAirConditioner();
    }
}