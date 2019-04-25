package chain_of_responsibility;

public class Manager extends Leader {
    public Manager(String name) {
	super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
	if (request.getLeaveDays() < 10) {
	    System.out.println(
		    "总监 " + name + " 为 " + request.getLeaveName() + " 做发型设计，消费 " + request.getLeaveDays() + " 万元。");
	} else {
	    if (this.successor != null) {
		this.successor.handleRequest(request);
	    }
	}
    }
}