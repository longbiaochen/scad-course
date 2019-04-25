package chain_of_responsibility;

public class ViceGeneralManager extends Leader {
    public ViceGeneralManager(String name) {
	super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
	if (request.getLeaveDays() < 20) {
	    System.out.println(
		    "副总监 " + name + " 为 " + request.getLeaveName() + " 发型设计，消费 " + request.getLeaveDays() + " 万元。");
	} else {
	    if (this.successor != null) {
		this.successor.handleRequest(request);
	    }
	}
    }
}