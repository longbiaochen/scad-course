package bridge;

public class BigPen extends Pen {
    String penType = "BigPen";

    @Override
    public void draw(String name) {
	this.color.bepaint(penType, name);
    }
}