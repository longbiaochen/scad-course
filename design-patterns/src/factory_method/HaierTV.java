package factory_method;

public class HaierTV implements TV {
    @Override
    public void play() {
	System.out.println("海尔电视机播放中......");
    }
}