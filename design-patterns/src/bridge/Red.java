package bridge;

public class Red implements Color {
    private String colorName = "red";

    @Override
    public void bepaint(String penType, String name) {
	System.out.println(penType + " draws " + name + " in " + colorName + ".");
    }
}