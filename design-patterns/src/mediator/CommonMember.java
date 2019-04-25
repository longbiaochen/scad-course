package mediator;

public class CommonMember extends Member {
    public CommonMember(String name) {
	super(name);
    }

    public void sendText(String to, String message) {
	System.out.println("[普通会员] " + name + " 发送信息给 " + to + "：\t" + message);
	chatroom.sendText(name, to, message);
    }

    public void receiveText(String from, String message) {
	System.out.println("[普通会员] " + this.name + " 已接收信息：\t\t" + message);
    }
}