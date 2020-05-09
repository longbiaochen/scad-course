package factory_method;

public class Client {
    public static void main(String args[]) {
	try {
	    TVFactory factory;
	    TV tv;

	    factory = (TVFactory) XMLUtil.getBean();
//	    factory = new HaierTVFactory();
	    tv = factory.produceTV();
	    tv.play();
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
    }
}
