package abstract_factory;

public class HairAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
	System.out.println("Change temperature of Haier Air Conditioner...");
    }
}