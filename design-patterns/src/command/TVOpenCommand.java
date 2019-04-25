package command;

public class TVOpenCommand implements AbstractCommand {
    private Television tv;

    public TVOpenCommand() {
	tv = new Television();
    }

    @Override
    public void execute() {
	tv.open();
    }
}