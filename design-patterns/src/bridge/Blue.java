package bridge;

public class Blue implements Color {
    String colorName = "blue";

    @Override
    public void bepaint(String penType, String name) {

	System.out.println(penType + " draws " + name + " in " + colorName + ".");
    }
}