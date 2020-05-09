package simple_factory;

public class TVFactory {
    public static TV produceTV(String brand) throws Exception {
	if (brand.equalsIgnoreCase("Haier")) {
	    System.out.println("电视机工厂正在生产" + brand + "电视机！");
	    return new HaierTV();
	} else if (brand.equalsIgnoreCase("Hisense")) {
	    System.out.println("电视机工厂正在生产" + brand + "电视机！");
	    return new HisenseTV();
	} else {
	    throw new Exception("对不起，暂不能生产该品牌电视机！");
	}
    }
}