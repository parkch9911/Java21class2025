package diExample04;

public class SendMsg {
	public void sendfor(String name, String content, MsgInterface mif) {
		mif.send(name, content);
	}
}
