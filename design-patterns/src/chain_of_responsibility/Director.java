package chain_of_responsibility;

public class Director extends Leader {
    public Director(String name) {
	super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
	if (request.getLeaveDays() < 3) {
	    System.out.println("造型师 " + name + " 审批员工 " + request.getLeaveName() + " 的请假条，请假天数为 "
		    + request.getLeaveDays() + " 天。");
	} else {
	    if (this.successor != null) {
		this.successor.handleRequest(request);
	    }
	}
    }
}