package adapter;

public class BirdAdapter extends Bird implements Robot {
    @Override
    public void cry() {
	System.out.print("机器人模仿：");
	super.tweedle();
    }

    @Override
    public void move() {
	System.out.print("机器人模仿：");
	super.fly();
    }
}