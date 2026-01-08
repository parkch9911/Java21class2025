package classpart07;

public class ClassEx07 {
	// 멤버 변수, 생성자, 기능 메서드 작성

	int[] price = {2500,3000,1500,1000};
	String[] menu = {"치즈버거","불고기버거","감자튀김","콜라"};
	int[] count = new int[4]; //메뉴수량 //따로담아야하나
	int total = 0; //총 가격
	String name; //가게이름을 빼두기 영수증마다 가게 이름이 다를수도있으니까~
	
	
	//객체 생성시 초기화에 필요한 디폴트 생성자
	//생성자 반드시 클래스이름과 동일해야함.
	public ClassEx07() {};

	
	//메뉴 출력 함수=========================================================================
	// void는 반환 할 값이 없는 method 생성할때 사용한다.
	public void printMenu() {
		System.out.println("\n["+name+"]");
		for(int i = 0; i<menu.length; i++) {
			System.out.println((i+1)+":"+menu[i]+"("+price[i]+"원");
		}
		System.out.println("==============");
		System.out.println("5.주문하기");
		System.out.println();
	}
	
	//주문 추가 함수=========================================================================
	public void order(int sel) {
		count[sel]++;
		System.out.println(menu[sel]+"추가됨");
	}
	
	
	//총금액 계산 함수========================================================================
	public void calcTotal() {
		total = 0;
		for(int i = 0; i<menu.length; i++) {
			total += price[i]*count[i];
		}
	}
	
	//주문 여부를 확인하는 함수=================================================================
	//반환할 값이 필요한 경우 반드시 데이터 타입으로 method 를 작성한다.
	public boolean hasOrder() {
		for(int i = 0; i<menu.length; i++) {
			if(count[i] > 0) {
				return true; //주문 됨
			}
		}
		return false; //주문 안됨
	}
	
	
	//영수증을 출력하는 함수===================================================================
	public void printReceipt(int money) {
		System.out.println("====영수증출력====");
		System.out.println("매장명 : "+name);
		System.out.println("----------------");
		System.out.println("메뉴\t수량\t금액");
		
		for(int i = 0; i<menu.length; i++) {
			if(count[i] > 0) {
				System.out.println(menu[i]+"\t"+count[i]+"\t"+price[i]*count[i]);
			}
		}
		System.out.println("-----------------------");
		System.out.println("총 금액 : "+total);
		System.out.println("받은 돈 : "+money);
		System.out.println("잔   돈 : "+(money-total));
		System.out.println("-----------------------");
	}
	
	
	// 
	// 리턴의 기준이 뭐지
	// 주문여부는 왜 리턴일까
	
	
	
	
	// 메뉴 선택하면 돈 계산되는 메서드 
	// 주문하기하면 출력되는 메서드
	// 돈 입력하면 잔돈 나오는 메서드
	
	
	// 메뉴 화면 출력?
	
	
	
	
	
	
	
}
