package prototype;

public class Client
{
	public static void main(String a[])
	{
		Email email,copyEmail;
		
		email=new Email("来自QQ邮箱的节日问候！");
		
		copyEmail=(Email)email.clone();
		
		System.out.println("email==copyEmail?");
		System.out.println(email==copyEmail);
		
		System.out.println("email.getTitle()==copyEmail.getTitle()?"); 
		System.out.println(email.getTitle()==copyEmail.getTitle());
	}
}