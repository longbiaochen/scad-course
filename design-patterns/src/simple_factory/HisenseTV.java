package simple_factory;

public class HisenseTV implements TV {

    @Override
    public void play() {
	System.out.println("Playing Hisense TV...");
    }
}