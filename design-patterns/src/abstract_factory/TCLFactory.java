package abstract_factory;

public class TCLFactory implements EFactory {
    @Override
    public Television produceTelevision() {
	System.out.println("电视机工厂正在生产TCL电视机！");
	return new TCLTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
	System.out.println("空调工厂正在生产TCL空调！");
	return new TCLAirConditioner();
    }
}