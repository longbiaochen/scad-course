package bridge;

public class Green implements Color {
    private String colorName = "green";

    @Override
    public void bepaint(String penType, String name) {
	System.out.println(penType + " draws " + name + " in " + colorName + ".");
    }
}