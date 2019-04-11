package abstract_factory;

public class HaierFactory implements EFactory
{
	public Television produceTelevision()
	{
		System.out.println("正在生产海尔电视...");
		return new HaierTelevision();
	}
	
	public AirConditioner produceAirConditioner()
	{
		System.out.println("正在生产海尔空调...");
		return new HairAirConditioner();
	}
}