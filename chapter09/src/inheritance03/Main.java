package inheritance03;

public class Main {

	public static void main(String[] args) {
		// Customer 메인
		Customer c = new Customer("1234","이성계");
		VIPcustomer v = new VIPcustomer("5678","김길동");
		// 상속을 받은 클래스는 상위 클래스를 데이터 타입으로 인스턴화 할 수 있다.
		//예) Customer v = new VIPcustomer("5678","김길동");
		c.printP();
		v.printP();

	}
	
}
