package otShop;

import java.util.Scanner;

public class Shopping extends UserMenu {
	// 쇼핑 메뉴 메소드
	// 인스턴스화 
	ItemManager it = new ItemManager();
	Scanner scan = new Scanner(System.in);
	String menu = "[1]로그인\n[2]로그아웃\n[3]쇼핑\n[0]종료\n";
	String mageMenu = "[1]로그아웃\n[2]아이템관리\n[3]장바구니리스트\n";
	String itemMenu = "[1]상품추가\n[2]상품삭제\n[3]상품수정\n[0]종료\n";
	
	//menu-------------------------------
	public void menu() {
		while(true) {
			System.out.println();
			System.out.print(menu);
			System.out.print("메뉴 선택 : ");
			int select = scan.nextInt();
			if(select == 1) {
				login();
				if(log == 0) {
					mageMenu();
				}
			}else if(select ==2) {
				logout();
			}else if(select ==3) {
				//쇼핑은 반드시 로그인 상태이어야 함
				if(log < 0){ // log == -1 이면 로그아웃상태
					System.out.println("로그인 후 이용 가능");
				}else {
					//로그인상태 : log>0
					shopMenu();
				}
			}else {
				System.out.println("쇼핑몰 종료");
				break;
			}
		}//while종료
	}//---------------------------menu() 메소드 끝괄호-------------------------
	
	//shopMenu() 메소드
	public void shopMenu() {
		while(true) {
			System.out.println();
			System.out.println("[1]쇼핑목록\n[2]장바구니\n[0]뒤로가기\n");
			int select = scan.nextInt();
			if(select == 0) {
				break;
			}else if(select ==1) {
				it.printCategory();
				System.out.print("쇼핑목록 선택 [뒤로가기 -1] : ");
				int caId = scan.nextInt();
				
				int n = 0;
				for(int i = 0; i<it.itemList.size(); i++) {
					// 카테고리 인덱스에 해당하는 상품들만 출력해야함
					// 카테고리별 아이템 번호가 존재하지 않으면 예외처리
					if(it.category.get(caId).equals(it.itemList.get(i).category)) {
						System.out.println("["+i+"]");
						//it.printItemList();
						it.itemList.get(i).printInfo();
					}else if(caId == -1) {
						break;
					}
				}
				System.out.println("항목을 선택");
				int itemId = scan.nextInt();
				//항목추가 -> 장바구니 카트에 내가 산 항목 추가
				it.addCart(super.id[log], caId, itemId);
				
			}else if(select == 2) {
				System.out.println("=======장바구니=======");
				for(int i = 0; i<it.jangList.size(); i++) {
					// 로그인한 아이디가 장바구니id와 같은지 확인
					// 현재 jangList에 물건을 산 고객의 id별로 담겨있다.
					// [kkk]~~~ ...
					if(it.jangList.get(i).userId.equals(id[log])) {
						it.jangList.get(i).printCart();
					}
				}
				System.out.println("=====================");
			}
		}
	}
	//=================== 관리자 메뉴 =======================
	public void mageMenu() {
		while(true) {
			System.out.println();
			System.out.println(mageMenu); // 맨위에 출력문 담은거임 이건
			System.out.print("메뉴선택 : ");
			int select = scan.nextInt();
			
			if(select == 1) {
				logout();
				break;
			}else if(select == 2) {
				//아이템 관리
				itemmage();
			}else {
				System.out.println("=======장바구니 리스트=======");
				it.printJang();
				System.out.println("==========================");
			}
		}
	}
	//아이템 관리메뉴 =====
	public void itemmage() {
		while(true) {
			System.out.println();
			System.out.print(itemMenu);
			System.out.print("메뉴 선택 : ");
			int select = scan.nextInt();
			
			if(select ==1) {
				System.out.print("추가 할 상품의 이름을 입력하세요 : ");
				String addname = scan.next();
				System.out.print("추가 할 상품의 금액을 입력하세요 : ");
				int addprice = scan.nextInt();
				System.out.println("[0]과자 [1]생선 [2]육류 [3]음료수");
				System.out.println("추가 할 상품의 카테고리 번호를 입력하세요 : ");
				int addcategory = scan.nextInt();
				//상품 추가
				it.addItem02(addname, addprice, addcategory);
				//상품 목록 출력
				it.printItemList();
			}else if(select ==2) {
				System.out.print("삭제 할 상품의 번호을 입력하세요 : ");
				int deleteindex = scan.nextInt();
				it.delItem(deleteindex);
				it.printItemList();
			}else if(select ==3) {
				System.out.print("수정 할 상품의 번호을 입력하세요 : ");
				int indexNum = scan.nextInt();
				System.out.print("수정 할 상품의 이름을 입력하세요 : ");
				String upName = scan.next();
				System.out.print("수정 할 상품의 금액을 입력하세요 : ");
				int upPrice = scan.nextInt();
				it.updateItem(indexNum, upName, upPrice);
				it.printItemList();
			}else {
				System.out.println("아이템 관리 종료");
				break;
			}
		}
	}
	//============로그인 메서드================
	public void login() {
		if(log > -1) {
			System.out.println("이미 로그인 상태 입니다.");
		}else {
			log = super.userLog();
		}
	}
	//로그아웃====
	public void logout() {
		if(log < 0) {
			System.out.println("이미 로그아웃 상태 입니다.");
		}else {
			log = -1;
			System.out.println("안녕히가세요.");
		}
	}
	
}
