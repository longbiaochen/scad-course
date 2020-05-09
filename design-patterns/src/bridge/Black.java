package bridge;

public class Black implements Color {
    String colorName = "black";

    @Override
    public void bepaint(String penType, String name) {
	System.out.println(penType + " draws " + name + " in " + colorName + ".");
    }
}