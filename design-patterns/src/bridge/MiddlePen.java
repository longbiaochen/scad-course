package bridge;

public class MiddlePen extends Pen {
    @Override
    public void draw(String name) {
	String penType = "MiddlePen";
	this.color.bepaint(penType, name);
    }
}