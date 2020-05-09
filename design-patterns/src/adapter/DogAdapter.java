package adapter;

public class DogAdapter extends Dog implements Robot {
    @Override
    public void beep() {
	System.out.print("Robot beeping: ");
	super.wang();
    }

    @Override
    public void move() {
	System.out.print("Robot moving: ");
	super.run();
    }
}