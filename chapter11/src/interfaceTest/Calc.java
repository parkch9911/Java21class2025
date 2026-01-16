package interfaceTest;

public interface Calc {
	//Java 7 버전 이전에는 구현코드가 있는 메소드가 존재할 수 없었다.
	//Java 8 버전 이후 부터는 구현코드가 있는 메소드가 존재할 수 있다.
	// 인터페이스에서 멤버변수는 public static final 인 상수로 지정
	
	public static final double PI = 3.14;
	// interface 에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	int ERROR = -999999;
	
	// 인터페이스에서 선언한 메소드는 컴파일 과정에서 추상메소드로 변환됨
	// 인터페이스에서 구현체가 존재하지 않는 메소드는 abstract 키워드로 작성하든, 안하든 무조건 후상 메소드.
	// 추상메소드는 {body} 구현체가 존재하지 않는다.
	// 인터페이스는 인스턴스화 할 수 없다.
	public abstract int add(int num1, int num2);
	int substract(int num1 , int num2);
	int times(int num1 , int num2);
	int divide(int num1 , int num2);

	
	//=================================================================
	//=================Java 8 이후 가능한 기능============================
	//=================================================================
	//디폴트 메서드 : 기본 구현을 가지는 메소드로 구현코드를 재정의 할 수 있다.
		default void description() {
			System.out.println("점수 계산을 구현하시오");
			myMethod();
		}
		
		//정적 메소드 : 인스턴스 생성과 상관없이 인터페이스 타입으로 사용 가능
		static int total(int[] arr) {
			int total=0;
			for(int i =0; i<arr.length; i++) {
				total += arr[i];
			}
			myStaticMethod();
			return total;
		}
		
		// private 메소드 : 인터페이스 내부에서만 사용 가능
		//					구현한 클래스에서 사용하거나 재정의 불가능
		private void myMethod() {
			System.out.println("private 메소드");
		}
		
		//private static 메소드
		private static void myStaticMethod() {
			System.out.println("myStaticMethod");
		}
}
