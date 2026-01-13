package inheritance;

public class ParentClass {
	//부모 클래스
	protected int a = 10;
	protected int b = 20;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	//생성자
	public ParentClass() {
		System.out.println("parentClass 생성자");
		System.out.println("원래 부모의 a 값 : "+a);
	};
	public ParentClass(int a, int b) {
		this.a =a;
		this.b =b;
	}
	
	//method
	public void parentfun() {
		System.out.println("== parentfun ==");
		System.out.println("부모의 a : "+ a +", 부모의 b : "+ b);
	}
	
}
