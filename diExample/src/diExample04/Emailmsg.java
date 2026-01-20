package diExample04;

public class Emailmsg implements MsgInterface{

	@Override
	public void send(String name, String content) {
		System.out.println("["+name+"]에게 ["+content+"]를 E-mail로 전송");
		
	}

}
