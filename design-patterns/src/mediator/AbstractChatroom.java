package mediator;

public abstract class AbstractChatroom {
    public abstract void register(Member member);

    public abstract void sendText(String from, String to, String message);

}