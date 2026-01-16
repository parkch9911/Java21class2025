package abstractTest;

//추상 클래스 extends 로 상속 받는다.
public class Desktop extends Computer{

	@Override // 부모 메소드를 상속받아 재정의한다. 라는 의미
	public void display() {
		System.out.println("Desktop display()---");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing()---");
	}
	
}
