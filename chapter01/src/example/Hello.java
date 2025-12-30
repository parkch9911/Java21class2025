package example;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object 는 객체 데이터 타입으로 Java의 최상의 데이터타입이다.
		Object obj = new Object();
		System.out.println("Hello Java World!!");
//	 	Java 주석 단축키 :  Ctrl + /
		int i; //변수 지정
		i = 10; //초기값 지정
		int j = 20;
		System.out.println("i의 번지 : "+obj.hashCode());
		// 한 줄 복사 Ctrl + Alt + ↓
		System.out.println("j의 번지 : "+obj.hashCode());
		System.out.println(j+obj.hashCode());
		System.out.println("j의 번지 : "+j+obj.hashCode());
		//Java 연산자 종류
		// 더하기 + , 빼기 =, 곱하기 *, 나누기 / ,
	}
}
