package factory_method;

public class HaierTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
	System.out.println("电视机工厂正在生产海尔电视机！");
	return new HaierTV();
    }
}