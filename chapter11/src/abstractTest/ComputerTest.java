package abstractTest;

public class ComputerTest {

	public static void main(String[] args) {
		
		//단, Computer 추상 클래스를 상속 받고있는 하위 클래스의 
		//데이터타입으로 업캐스팅 할 수 있다.
		// -> 다형성이 성립된다.
		// 다형성이 성립요건 => 1.상속  2.오버라이딩  3.업캐스팅
		
		//추상 클래스는 인스턴스화(=객체화) 할 수 없다.
		// Computer com = new Computer();
		Computer com1 = new Desktop();
		// Computer com2 = new Notebook(); 이것도 추상 클래스임
		Computer com3 = new Mynotebook();
		com1.display();
		com1.typing();
		com3.display();
		com3.typing();
	}

}
