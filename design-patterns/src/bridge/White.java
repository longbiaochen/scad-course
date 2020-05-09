package bridge;

public class White implements Color {
    private String colorName = "white";

    @Override
    public void bepaint(String penType, String name) {
	System.out.println(penType + " draws " + name + " in " + colorName + ".");
    }
}