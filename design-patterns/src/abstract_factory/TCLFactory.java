package abstract_factory;

public class TCLFactory implements EFactory
{
	public Television produceTelevision()
	{
		return new TCLTelevision();
	}
	
	public AirConditioner produceAirConditioner()
	{
		return new TCLAirConditioner();
	}
}