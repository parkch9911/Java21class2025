package diExample04;

public class MainMSG {

	public static void main(String[] args) {
		SendMsg sm = new SendMsg();
		sm.sendfor("홍길동", "안녕하세요", new SMSmsg());
		sm.sendfor("개나리", "반갑습니다", new Kakaomsg());
		sm.sendfor("진달래", "식사는 하셨나요?", new Emailmsg());
	}

}
