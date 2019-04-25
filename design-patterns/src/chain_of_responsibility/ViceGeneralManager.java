package chain_of_responsibility;

public class ViceGeneralManager extends Leader {
    public ViceGeneralManager(String name) {
	super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
	if (request.getLeaveDays() < 20) {
	    System.out.println("副总监 " + name + " 审批员工 " + request.getLeaveName() + " 的请假条，请假天数为 "
		    + request.getLeaveDays() + " 天。");
	} else {
	    if (this.successor != null) {
		this.successor.handleRequest(request);
	    }
	}
    }
}