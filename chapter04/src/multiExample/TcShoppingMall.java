package multiExample;

import java.util.*;

public class TcShoppingMall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111", "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		//회원별 상품별 개수를 담는 변수
		int[][] cartCount = new int[ids.length][items.length];
		
		boolean run = true;
		int log = -1; // 로그인 여부
		int sel = -1; // 유저 메뉴선택
		int count = 0;
		
		
		while(run) {
			System.out.println("-----------");
			if(log == -1) {
				System.out.println("상태 : 로그아웃");
			}else {
				System.out.println("상태 : "+ids[log]);
			}
			System.out.println("-----------");
			System.out.println("[GREEN MART]");
			System.out.print("[1]로그인\n[2]로그아웃\n[3]쇼핑\n[4]장바구니\n[0]종료\n메뉴 선택 >> ");
			sel = scan.nextInt();
			if(sel == 1) {					// 로그인 선택 시
				System.out.print("ID입력");
				String myId = scan.next();
				System.out.print("PW입력");
				String myPw = scan.next();
				
				//로그인 성공 boolean
				boolean loginSuccess = false;
				for(int i = 0 ; i<ids.length; i++) {
					if(ids[i].equals(myId) && pws[i].equals(myPw)) {
						log = i;
						loginSuccess = true;
						System.out.println("로그인 되었습니다.");
						break;
					}
				}
				if(loginSuccess) {
					System.out.println(ids[log]+"님 환영합니다.");
				}else {
					System.out.println("아이디와 비밀번호를 확인해주세요.");
				}
				
			}else if(sel == 2) { 	//로그아웃 선택 시
				log = -1;
				System.out.println("로그아웃 되었습니다.");
				
			}else if(sel == 3) {	//쇼핑 선택 시
				//쇼핑 출력 => 반드시 로그인 상태여야함
				if(log == -1) {
					System.out.println("로그인 후 이용 가능");
					continue;
				}
				// 쇼핑몰 반복
				// [1]사과 [2]바나나 [3]딸기 [4]뒤로가기
				// while문 필요
				while(run) {
					System.out.println("[상품목록]");
					// 상품 목록 출력 코드
					for(int i =0; i<items.length; i++) {
						System.out.printf("[%d]%s%n",(i+1),items[i]);
					}
					System.out.println("[4]뒤로가기");
					System.out.print("상품 번호를 선택하세요.");
					int itemNum = scan.nextInt();
					if(itemNum == 4) {
						//뒤로가기
						break;
					}
					
					// max_size 100이 넘어가면 예외처리
					if(count == MAX_SIZE) {
						System.out.println("장바구니가 가득 찼습니다.");
						break;
					}
					
					// ids별 쇼핑한 items별 들의 개수를 cartCount에 담는다.
					// 장바구니 0번째 열에 log인 한 index번호를 담는다.
					jang[count][0] = log;
					// 장바구니 1번째 열에 내가 산 item index번호를 담는다.
					jang[count][1] = itemNum-1;
					// id별 쇼핑한 item들의 개수를 cartCount에 item별로 담는다.
					// cartCount[log][itemNum-1] = cartCount[log][itemNum-1]+1
					// log = 0, 회원 qwer , itemNum-1 => 0 , 상품 사과
					// int 배열 초기값이 0 이니까 위에서 오는 log나 itemNum의 좌표값은 0임. 근데 이제 ++로 개수를 증가시켜준다.
					cartCount[log][itemNum-1]++;
					count++;
					
				}
				
			}else if(sel == 4) {	//장바구니 선택 시
				//내 장바구니는 로그인 상태에서만 출력 가능
				if(log == -1) {
					System.out.println("로그인 후 이용 가능");
				}else {
					System.out.println("==="+ids[log]+"님의 장바구니===");
					for(int i = 0; i<items.length; i++) {
						System.out.println(items[i]+": "+cartCount[log][i]+"개");
					}
				}
				
			}else if(sel == 0) {	//프로그램 종료
				System.out.println("시스템이 종료되었습니다.");
				run = false;
			}
		}
		
		scan.close();
		
	}

}
