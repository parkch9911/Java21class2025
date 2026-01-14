package shopMall;

import java.util.Scanner;


public class Shopping extends UserMenu {
	
	ItemManager itemManager = new ItemManager();
	public Shopping() {};
	boolean run = true;
	boolean shoppingRun = true;
	boolean categoryRun = true;
	Scanner scan = new Scanner(System.in);
	//메뉴
	public void menu() {
		while(run) {
			shoppingRun = true;
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[0]종료");
			System.out.print("메뉴를 선택하세요 >> ");
			int sel = scan.nextInt();
			if(sel == 1) {
				login();		
			}else if(sel ==2) {
				logout();
			}else if(sel ==3) {
				shopMenu();
			}else if(sel ==0) {
				System.out.println("종료되었습니다.");
				run = false;
			}
		}
	};
	//쇼핑메뉴
	public void shopMenu() {
		if(super.log != -1) {
			while(shoppingRun) {
				categoryRun = true;
				System.out.println("===========");
				System.out.println("[1]쇼핑목록");
				System.out.println("[2]장바구니");
				System.out.println("[0]뒤로가기");
				System.out.print("메뉴를 선택하세요 >> ");
				int sel = scan.nextInt();
				if(sel == 1) {
					//
					while(categoryRun) {	
						itemManager.printCategory(); //카테고리 출력
						sel = scan.nextInt(); //카테고리 선택
						itemManager.printItemList(sel); //상품출력 ex)[0][과자][1000][새우깡] ...
						sel = scan.nextInt();
						if(sel == -1) { 
							System.out.println("뒤로가기");
							categoryRun = false;
						}if(sel != -1) {
							//sel값 받아서 일치하는거 장바구니에 추가하기
							categoryRun = false;
						}
					}
				}else if(sel == 2) {
					//여긴 장바구니 목록 출력하는 메서드 불러오기
				}else if(sel == -1) {
					System.out.println("뒤로가기");
					shoppingRun = false;
				}
			}
		}else {
			System.out.println("로그인 후 이용 가능");
		}
	
	};
	//로그인 메서드
	public void login() {
			int testing = -1;
			int who = -1;
			System.out.print("아이디를 입력하세요 >> ");
			String inputid = scan.next();
			System.out.print("비밀번호를 입력하세요 >> ");
			String inputpw = scan.next();
			for(int i = 0; i<super.id.length; i++) {
				if(super.id[i].equals(inputid) && super.pw[i].equals(inputpw)) {
					testing = 1;
					super.log = 1;
					who = i;
				}else if(inputid.equals("mmm") && inputpw.equals("123")) {
					testing = 2;
					super.log = 2;
				}
			}
			if(testing == 1) {
				System.out.println("["+super.id[who]+"]님, 환영합니다.");
				super.userLog(who);
			}else if(testing == 2){
				System.out.println("당신은 관리자입니다.");
			}else {
				System.out.println("아이디와 비밀번호를 다시 확인해주세요.");
			}
		
	};
	//로그아웃 메서드
	public void logout() {
		if(super.log != -1) {
			System.out.println("로그아웃 되었습니다.");
			super.log = -1;
		}else {
			System.out.println("로그인 상태가 아닙니다.");
		}
	};

}
