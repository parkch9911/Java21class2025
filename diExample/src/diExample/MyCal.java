package diExample;

public class MyCal {
	
	//메서드 하나로 +-*/ 모두 실행되어야한다.
	public void cal(int x, int y, Ical ical) {
		int result = ical.doOper(x, y);
		System.out.println("result : "+result);
	}
	
	// 1단계 : 계산기 클래스 생성
	// 2단계 : MyCal 클래스의 메소드들을 모듈화(=부품)
	// 3단계 : 공통 인터페이스를 도입
	// 4단계 : DI(의존성 객체 주입) 
	//		  └> 외부로부터 객체 주입 
	
	//더하기, 빼기, 곱하기, 나누기 메소드
	// add   sub  mul    div
	//인터페이스는 객체화는 할 수 없지만, 데이터타입으로는 사용할 수 있다.
	
//	
//	public void add(int x, int y,Ical ical) {
//		//매개변수 자리의 Ical ical 
//		// 				   └> Ical이라는 타입으로 구현된
//		//					  어떤 객체든 이 자리에 들어올 수 있다.
//		int result = ical.doOper(x, y);
//		System.out.println("더한 값 : "+result);
//	}
//	
//	public void sub(int x, int y,Ical ical) {
//		int result = ical.doOper(x, y);
//		System.out.println("뺀 값 : "+result);
//	}
//	
//	public void mul(int x, int y,Ical ical) {
//		int result = ical.doOper(x, y);
//		System.out.println("곱한 값 : "+result);
//	}
//	
//	public void div(int x, int y,Ical ical) {
//		int result = ical.doOper(x, y);
//		System.out.println("나눈 값 : "+result);
//	}
	
}
