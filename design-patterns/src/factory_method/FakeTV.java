package factory_method;

public class FakeTV implements TV {
    @Override
    public void play() {
	System.out.println("Playing Fake TV...");
    }
}