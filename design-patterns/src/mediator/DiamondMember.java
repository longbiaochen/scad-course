package mediator;

public class DiamondMember extends Member {
    public DiamondMember(String name) {
	super(name);
    }

    @Override
    public void sendText(String to, String message) {
	System.out.println("[钻石会员] " + name + " 发送信息给 " + to + "：\t" + message);
	chatroom.sendText(name, to, message);
    }

    @Override
    public void receiveText(String from, String message) {
	System.out.println("[钻石会员] " + this.name + " 已接收信息：\t\t" + message);
    }
}