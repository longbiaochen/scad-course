package factory_method;

public class HisenseTV implements TV {
    @Override
    public void play() {
	System.out.println("海信电视机播放中......");
    }
}