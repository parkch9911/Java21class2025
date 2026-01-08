package classpart07;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {	
		// 여기서 while 돌리기 main에서
		// main()에서는 계산 로직(X), 저장 로직(X), 처리 로직(X),
		// main()은 객체화(인스턴스화), method 호출, 제어흐름(실행순서)
		Scanner scan = new Scanner(System.in);
		//우리가 만든 클래스 인스턴스화 하기
		ClassEx07 e7 = new ClassEx07();
		//ClassEx07 클래스에 접근하는 방법
		//참조변수.멤버변수 , 참조변수.method 
		e7.name ="맥도날드";
		
		//순서 정하기
		boolean run = true;
		while(run) {
			e7.printMenu();
			System.out.println("메뉴선택 >> ");
			int sel = scan.nextInt();
			
			//메뉴선택
			if(sel >= 1 && sel <= 4) {
				e7.order(sel-1); //인덱스는 0부터 시작하기때문에
			}else if(sel == 5) {
				// 주문이 완료되었을떄
				if(!e7.hasOrder()) { //false 는 주문이 안된상태
					System.out.println("주문 내역이 없습니다.");
					continue;
				}
				// 총금액 함수 호출한다.
				e7.calcTotal();
				System.out.println("총 금액 : "+e7.total+"원");
				System.out.print("지불 금액 : ");
				int money = scan.nextInt();
				if(money < e7.total) {
					System.out.println("지불 금액이 부족합니다.");
					continue;
				}
				
				//영수증 출력 함수 호출
				e7.printReceipt(money);
				run = false;
			}
			
		}

	}

}
