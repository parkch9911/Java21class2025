package abstractTest;

class define{
	public static final int MIN = 1;
	public static final int MAX = 9999;
	public static final int ENG = 1001;
	public static final int MATH = 2001;
	public static final double PI = 3.14;
	public static final String GOOD_MORNING = "good morning";
}


public class FinalTest {

	public static void main(String[] args) {
		// Final 예약어 
		// final 변수는 값이 변경될 수 없는 상수이다.
		// 예) public static final double pi = 3.14; // final은 javaScript의 const와 비슷함.
		// 재할당 할 수 없다. pi = 3.0(x)
		// final a = 20;
		// final 메소드는 하위 클래스에 재정의 할 수 없다.
		// final 클래스는 상속되지 않는다. 
		// final 은 선언과 동시에 할당되고, 또는 생성자에서 한번만 할당 가능하다.
		
		//static 으로 작성된 변수는 인스턴스화를 거치지 않고 접근이 가능하다.
		System.out.println(define.GOOD_MORNING);
		System.out.println("영어과목 코드는 "+define.ENG+"입니다.");
		System.out.println("수학과목 코드는 "+define.MATH+"입니다.");
		
		// define.PI = 3.1; //final 로 작성된 변수는 재할당이 불가능하다.
		double num = define.PI * 1000;
		System.out.println(num);
	}

}
