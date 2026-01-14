package inheritance03;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Customer 메인
		ArrayList<Customer> customerlist = new ArrayList<Customer>();
		
		//인스턴스 진행
		Customer c = new Customer("1234","이순신");
		Customer c2 = new Customer("1444","신사임당");
		Customer g = new GOLDcustomer("5674","홍길동");
		Customer g2 = new GOLDcustomer("9999","이율곡");
		Customer v = new VIPcustomer("5678","김길동",1010);
		Customer v2 = new VIPcustomer("0122","개나리",1011);
		// 상속을 받은 클래스는 상위 클래스를 데이터 타입으로 인스턴화 할 수 있다.
		//예) Customer v = new VIPcustomer("5678","김길동");
		
		//업캐스팅
		customerlist.add(c);
		customerlist.add(c2);
		customerlist.add(g);
		customerlist.add(g2);
		customerlist.add(v);
		customerlist.add(v2);
		System.out.println("===========고객정보 출력===========");
		for(int i = 0; i<customerlist.size();i++) {
			customerlist.get(i).printINFO();
		}
		System.out.println("======보너스 포인트와 할인율 결과======");
		for(int i = 0; i<customerlist.size();i++) {
			customerlist.get(i).printP();
		}
		
//		c.printINFO();
//		c2.printINFO();
//		g.printINFO();
//		g2.printINFO();
//		v.printINFO();
//		v2.printINFO();	
//		c.printP();
//		c2.printP();
//		g.printP();
//		g2.printP();
//		v.printP();
//		v2.printP();
	}
	
}
