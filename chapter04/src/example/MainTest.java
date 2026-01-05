package example;

public class MainTest {
	public static void main(String[] args) {
		
		//아래 예외처리를 하지 않을 경우
		// IndexOutOfBoundException (존재하지않는 index를 사용했다) 에러 출력됨
		if(args.length != 2) {
			System.out.println("값의 개수가 부족합니다.");
			System.exit(0);
			
		}
		String strNum1 = args[0]; // 10 => "10"
		String strNum2 = args[1]; // 20 => "20"
		
		// 입력 받은 args값을 숫자로 변환해야 사칙연산이 가능하다.
		// Java에서 값을 원하는 데이터 형식으로 변환하는 작업을 parsing이라고한다.
		// 단, 파싱은 반드시 객체데이터 타입이어야함을 주의하자
		// 객체 데이터 타입은 반드시 앞 글자가 대문자이어야 한다.
		
		// 정수의 기본 타입은 int이지만, 객체타입은 Integer 이다.
		// 다른말로 래퍼 클래스 라고  부른다.
		// Integer.parseInt() => 문자 데이터를 정수형으로 변환
		// "10" => 10 정수형 10으로 변환
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.printf("%d + %d = %d",num1,num2,result);
		
		
		
		
	}
}
