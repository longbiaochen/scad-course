package abstract_factory;

public class TCLTelevision implements Television {
    @Override
    public void play() {
	System.out.println("TCL电视机播放中......");
    }
}