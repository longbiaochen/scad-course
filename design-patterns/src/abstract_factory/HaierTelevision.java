package abstract_factory;

public class HaierTelevision implements Television {
    @Override
    public void play() {
	System.out.println("Playing Haier TV...");
    }
}