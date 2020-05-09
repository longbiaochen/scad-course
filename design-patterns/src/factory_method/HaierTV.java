package factory_method;

public class HaierTV implements TV {
    @Override
    public void play() {
	System.out.println("Playing Haier TV...");
    }
}