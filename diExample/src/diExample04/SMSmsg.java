package diExample04;

public class SMSmsg implements MsgInterface {

	@Override
	public void send(String name, String content) {
		System.out.println("["+name+"]에게 ["+content+"]를 SMS로 전송");
		
	}

}
