package mediator;

public class Client {
    public static void main(String args[]) {
	AbstractChatroom titanicChatRoom = new ChatRoom();
	Member member1, member2, member3, member4, member5;
	member1 = new DiamondMember("杰克");
	member2 = new DiamondMember("萝丝");
	member3 = new CommonMember("卡尔");
	member4 = new CommonMember("爱德华船长");
	member5 = new CommonMember("班杰明爵士");

	titanicChatRoom.register(member1);
	titanicChatRoom.register(member2);
	titanicChatRoom.register(member3);
	titanicChatRoom.register(member4);
	titanicChatRoom.register(member5);

	member1.sendText("萝丝", "萝丝，你好！");
	member2.sendText("杰克", "杰克，你好！");
	member1.sendText("萝丝", "如果我们不能在一起，生活还有什么意义？跟我私奔吧～");
	member2.sendText("杰克", "我的船舱号码是707号，请过来给我画画。。");
	member3.sendText("萝丝", "别生气了，这是我给你买的海洋之心，你戴着非常漂亮。");
	member4.sendText("班杰明爵士", "如果遇到灾难，我会跟著船一起沉没！");
	member5.sendText("爱德华船长", "我已经准备好了，就算沉没也要像个绅士那样！");
    }
}