package factory_method;

public class HisenseTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
	System.out.println("电视机工厂正在生产海信电视机！");
	return new HisenseTV();
    }
}