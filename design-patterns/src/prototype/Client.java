package prototype;

public class Client {
    public static void main(String a[]) {
	Email email, copyEmail;

	email = new Email("Across the Great Wall, we can reach every corner in the world.");

	copyEmail = (Email) email.clone();

	System.out.println("email==copyEmail?");
	System.out.println(email == copyEmail);

	System.out.println("email.getTitle()==copyEmail.getTitle()?");
	System.out.println(email.getTitle() == copyEmail.getTitle());

	email.display();
	copyEmail.display();
    }
}