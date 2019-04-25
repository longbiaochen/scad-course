package chain_of_responsibility;

public class Director extends Leader {
    public Director(String name) {
	super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
	if (request.getLeaveDays() < 3) {
	    System.out.println(
		    "造型师 " + name + " 为 " + request.getLeaveName() + " 做洗剪吹，消费 " + request.getLeaveDays() + " 万元。");
	} else {
	    if (this.successor != null) {
		this.successor.handleRequest(request);
	    }
	}
    }
}