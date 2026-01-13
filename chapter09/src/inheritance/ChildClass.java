package inheritance;


//부모클래스인 ParentClass를 자식 클래스 ChildClass에 상속
//상속키워드 :  extends
//사용방법 : 자식클래스명 extends 부모클래스명
public class ChildClass extends ParentClass{

	int a = 5;
	int b = 6;
	
	//default 생성자
	public ChildClass() {
		//super(); // 부모의 default 생성자를 호출 //생략해도 컴파일러가 자동으로 추가한다.
		System.out.println("childClass 생성자");
		super.setA(30);
	}
	
	
	public void childfun() {
		this.a = 12;
		//부모의 멤버변수 a에 접근해서 값을 25로 변경
		//부모를 가리키는 키워드는 super
		
		System.out.println("==child start== 부모의 a를 25로 바꿈");
		System.out.println("자식의 멤버변수 a : "+a+", 부모의 멤버변수 : "+super.a);
	} 
}
