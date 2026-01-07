package multiExample;

import java.util.*;

public class ShoppingMall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111", "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		boolean run = true;	//프로그램 실행여부
		boolean isLog = false; // 로그인 여부
		int sel = -1; // 유저 메뉴선택
		int whoLog = -1; //누가 로그인했는지
		int[][] cart = new int[ids.length][items.length];
		
		boolean shop = false;
		int item1 = 0; //사과
		int item2 = 0; //바나나
		int item3 = 0; //딸
		int idxCnt = 0;
		
		while(run) {
			System.out.println("-----------");
			if(isLog != true) {
				System.out.println("상태 : 로그아웃");
			}else {
				System.out.println("상태 : "+ids[whoLog]);
			}
			System.out.println("-----------");
			System.out.println("[GREEN MART]");
			System.out.print("[1]로그인\n[2]로그아웃\n[3]쇼핑\n[4]장바구니\n[0]종료\n메뉴 선택 >> ");
			sel = scan.nextInt();
			if(sel == 1) {					// 로그인 선택 시
				if(isLog == false) {
					System.out.print("ID 입력 >> ");
					String inpID = scan.next();
					System.out.print("PW 입력 >> ");
					String inpPW = scan.next();
					for(int i = 0; i<ids.length; i++) { 
						// 내가 입력한 아이디가 ids에 있다. && 내가 입력한 비밀번호가 pws에 있다. && ids와 pws의 인덱스 번호가 같다.
						if(inpID.equals(ids[i]) && inpPW.equals(pws[i])) {
							System.out.println("로그인 되었습니다.");
							whoLog = i;		// 해당 유저 로그인
							isLog = true; 	// 로그인 상태 
						}
					}
				}else {
					System.out.println("이미 로그인 상태입니다.");
				}
			}else if(sel == 2) {		// 로그아웃 선택 시
				if(isLog == true) {		// 로그인 안했을때
					System.out.println("로그아웃 되었습니다.");
					isLog = false;
					whoLog = -1;
				}else if(isLog != true){
					System.out.println("로그인 상태가 아닙니다.");
				}
			}else if(sel == 3) {		// 쇼핑 선택 시
				if(isLog) {
					shop = true;
					while(shop) {
						System.out.println("[상품목록]\n[1]사과\n[2]바나나\n[3]딸기\n[4]뒤로가기");
						System.out.print("상품 번호 선택 >> ");
						sel = scan.nextInt();
						for(int i = 0; i<items.length; i++) {
							
						}
						
					}
				}else {
					System.out.println("로그인 후 이용 가능합니다.");
				}
					
			}else if(sel == 4) {			// 장바구니 선택 시
				if(isLog) {
					System.out.println("---"+ids[whoLog]+"님의 장바구니---");
					for(int i = 0; i<jang.length; i++) {
						System.out.printf("%s : %s%n",jang[i][0],jang[i][1]);
					}
					
					
					
					
					
					
				}else {
					System.out.println("로그인 후 이용 가능합니다.");
				}
			}else if(sel == 0 ) {
				System.out.println("시스템이 종료되었습니다.");
				run = false;
			}
		}
	
	scan.close();	
		
	}

}
