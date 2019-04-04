package simple_factory.tv_factory;

public class Client
{
	public static void main(String args[])
	{
         try
         {
         	TV tv;
         	String brandName = XMLUtilTV.getBrandName(); // TCL
//         	String brandName = "Haier";
         	tv=TVFactory.produceTV(brandName);
         	tv.play();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
