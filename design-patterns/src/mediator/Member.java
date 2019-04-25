package mediator;

public abstract class Member {
    protected AbstractChatroom chatroom;
    protected String name;

    public Member(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public AbstractChatroom getChatroom() {
	return chatroom;
    }

    public void setChatroom(AbstractChatroom chatroom) {
	this.chatroom = chatroom;
    }

    public abstract void sendText(String to, String message);

    public abstract void receiveText(String from, String message);

}