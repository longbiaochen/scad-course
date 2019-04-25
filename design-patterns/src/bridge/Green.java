package bridge;

public class Green implements Color {
    @Override
    public void bepaint(String penType, String name) {
	System.out.println(penType + "бли╚╣д" + name + ".");
    }
}