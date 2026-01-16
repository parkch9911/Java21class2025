package interfaceTest;

//interface 상속 받을 때 쓰는 키워드 implements
public abstract class Calculator implements Calc {

	//implements(시행하다) 는 인터페이스 타입을 상속했다는 의미
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}
	
}
