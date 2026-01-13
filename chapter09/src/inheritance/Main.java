package inheritance;

public class Main {

	public static void main(String[] args) {
		// 부모와 자식 클래스 모두 객체화
		ParentClass parent = new ParentClass();
		ChildClass child = new ChildClass();
		// 부모클래스의 기본 생성자는 자식클래스보다 선행된다.
		// 없으면 자동으로 생성해준다.
		// 단, 부모의 default 생성자가 존재하지않는 경우 자동생성 하지 않는다.
		
		child.childfun();
		//child.parentfun에 접근할 수 있는 이유는
		// ChildClass가 ParentClass를 상송 받았기 때문이다.
		child.parentfun();
		
		//객체화가 따로 되어있기때문에 부모의 a값을 변경하는 메서드가 childClass에 없어 독립적인 객체로 존재한다.
		// main()메소드에서 자식의 객체를 통해서 변경된 a값을 출력할 수 있고,
		// 부모 객체를 새로 생성해서는 그 변경된 값을 볼 수 없다.
		// 부모 객체를 따로 생성하였기때문에 a=10이된다. //1대 식당메뉴 : 김밥  // 2대식당메뉴: 참치김밥 인데 1대에서 참치를 찾는 꼴
		parent.parentfun();
	}

}
