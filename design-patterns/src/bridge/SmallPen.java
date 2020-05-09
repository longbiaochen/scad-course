package bridge;

public class SmallPen extends Pen {
    @Override
    public void draw(String name) {
	String penType = "SmallPen";
	this.color.bepaint(penType, name);
    }
}