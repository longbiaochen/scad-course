package factory_method;

public class FakeTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
	System.out.println("电视机工厂正在生产假电视机！");
	return new FakeTV();
    }
}