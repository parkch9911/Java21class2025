package polymorphism;

public class Tiger extends Animal{
	
	@Override //오버라이딩(재정의)이 되면 가상 메소드에 저장됨.
	public void move() {
		System.out.println("호랑이가 네 발로 뛰어요");
	}
}
