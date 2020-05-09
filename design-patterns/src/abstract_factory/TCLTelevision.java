package abstract_factory;

public class TCLTelevision implements Television {
    @Override
    public void play() {
	System.out.println("Playing TCL TV...");
    }
}