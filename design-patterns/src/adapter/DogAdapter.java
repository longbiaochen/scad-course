package adapter;

public class DogAdapter extends Dog implements Robot {
    @Override
    public void cry() {
	System.out.print("机器人模仿：");
	super.wang();
    }

    @Override
    public void move() {
	System.out.print("机器人模仿：");
	super.run();
    }
}