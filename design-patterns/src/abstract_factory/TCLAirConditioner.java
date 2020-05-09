package abstract_factory;

public class TCLAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
	System.out.println("Change temperature of TCL Air Conditioner...");
    }
}