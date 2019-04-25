package mediator;

import java.util.Hashtable;

public class ChatRoom extends AbstractChatroom {
    private Hashtable<String, Member> members = new Hashtable<String, Member>();

    @Override
    public void register(Member member) {
	if (!members.contains(member)) {
	    members.put(member.getName(), member);
	    member.setChatroom(this);
	}
    }

    @Override
    public void sendText(String from, String to, String message) {
	Member member = members.get(to);
	if (canSend(from, to)) {
	    String newMessage = message;
	    newMessage = message.replaceAll("707", "***");
	    member.receiveText(from, newMessage);
	} else {
	    System.out.println("发送失败：您是[普通会员]，无法给[钻石会员] " + to + " 发送信息！请充值为钻石会员！");
	}
	System.out.println("-------------------------------------------");

    }

    public boolean canSend(String from, String to) {
	Member fromMember = members.get(from);
	Member toMember = members.get(to);

	return !((fromMember instanceof CommonMember) && (toMember instanceof DiamondMember));

    }
}