package bridge;

public class White implements Color {
    @Override
    public void bepaint(String penType, String name) {
	System.out.println(penType + "°×É«µÄ" + name + ".");
    }
}