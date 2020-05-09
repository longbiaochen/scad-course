package singleton;

public class IdentityCardNo {
    private static IdentityCardNo instance = null;
    private String no;

    private IdentityCardNo() {
    }

    public static IdentityCardNo getInstance() {
	if (instance == null) {
	    System.out.println("Creating IdentityCardNo...");
	    instance = new IdentityCardNo();
	    instance.setIdentityCardNo("No400011112222");
	} else {
	    System.out.println("IdentityCardNo has been created.");
	}
	return instance;
    }

    private void setIdentityCardNo(String no) {
	this.no = no;
    }

    public String getIdentityCardNo() {
	return this.no;
    }

}