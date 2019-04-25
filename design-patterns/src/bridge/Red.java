package bridge;

public class Red implements Color {
    @Override
    public void bepaint(String penType, String name) {
	System.out.println(penType + "ºìÉ«µÄ" + name + ".");
    }
}