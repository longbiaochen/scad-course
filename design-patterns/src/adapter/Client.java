package adapter;

public class Client {
    public static void main(String args[]) {
//	Robot robot = (Robot) XMLUtil.getBean();
	Robot robot = new DogAdapter();
	robot.beep();
	robot.move();
    }
}