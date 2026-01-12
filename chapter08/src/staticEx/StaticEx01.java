package staticEx;

public class StaticEx01 {
	// static : 데이터 메모리 영역에서 값 공유
	static int atm = 0;
	String name;
	
	public StaticEx01() {};
	//오버로딩이란 StaticEx01의 기본 생성자를 재 정의하여 사용한다
	//
	public StaticEx01(String name) {
		this.name = name;
	}
	
	//입금 메서드
	public void sMoney(int money) {
		atm += money;
		System.out.println("atm : "+atm);
	}
	
	//출금 메서드
	public void out(int money) {
		atm -= money;
		System.out.println("atm : "+atm);
	}
	
	//출력 메서드
	public void getBankInfo() {
		System.out.println("name : "+this.name);
		System.out.println("atm :"+atm);
	}
}
