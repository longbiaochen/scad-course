package chain_of_responsibility;

public class GeneralManager extends Leader {
    public GeneralManager(String name) {
	super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
	if (request.getLeaveDays() < 30) {
	    System.out.println(
		    "首席 " + name + " 为 " + request.getLeaveName() + " 做头部护理，消费 " + request.getLeaveDays() + " 万元。");
	} else {
	    System.out.println("莫非" + request.getLeaveName() + "想辞职，居然请假" + request.getLeaveDays() + "天。");
	}
    }
}