package factory_method;

public class FakeTV implements TV
{
	public void play()
	{
		System.out.println("海尔电视机播放中......");
	}
}