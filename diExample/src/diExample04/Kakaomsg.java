package diExample04;

public class Kakaomsg implements MsgInterface{

	@Override
	public void send(String name, String content) {
		System.out.println("["+name+"]에게 ["+content+"]를 카카오톡으로 전송");
		
	}

}
