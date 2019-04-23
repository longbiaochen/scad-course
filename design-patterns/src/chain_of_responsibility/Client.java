package chain_of_responsibility;

public class Client {
    public static void main(String args[]) {

	Leader objDirector = Leader.connect();

	LeaveRequest lr1 = new LeaveRequest("于小谦", 2);
	objDirector.handleRequest(lr1);

	LeaveRequest lr2 = new LeaveRequest("欧阳青松", 5);
	objDirector.handleRequest(lr2);

	LeaveRequest lr3 = new LeaveRequest("罩百灵", 15);
	objDirector.handleRequest(lr3);

	LeaveRequest lr4 = new LeaveRequest("李秀珍", 25);
	objDirector.handleRequest(lr4);
    }
}