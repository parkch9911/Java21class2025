package classpart08;

import java.util.Scanner;

public class MainClass {
	//회원가입 만들기~~~~~~~~~~~~~~~~~~~~~
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		ClassEx08 e8 = new ClassEx08();
//이건 내가 한 방식 / 프린트도 싹다 클래스의 메서드로 넣었음	
//		while(run) {
//			e8.print();
//			int sel = scan.nextInt();
//				if(sel == 1) {
//					e8.join();
//				}else if(sel ==2) {
//					e8.login();
//				}else if(sel ==3) {
//					e8.logout();
//				}else if(sel ==4) {
//					e8.deposit();
//				}else if(sel ==5) {
//					e8.transfer();
//				}else if(sel ==6) {
//					e8.checkmoney();
//				}else if(sel ==0) {
//					System.out.println("종료되었습니다.");
//					run = false;
//				}
//		}
		while(run) {
			System.out.println("------------------------");
			System.out.println("계좌번호\t비밀번호\t계좌잔액");
			System.out.println("------------------------");
			for(int i = 0; i<e8.count; i++) {
				System.out.println(e8.arAcc[i]+"\t"+e8.arPw[i]+"\t"+e8.arMoney[i]);
			}
			System.out.println("------------------------");		
			System.out.println("[MEGA BANK]");
			//상태함수 호출함.
			//선생님 로그아웃상태: 로그인상태를 만드셧는ㄴ데 나는 깜빡하고못적음
			System.out.println("[1]회원가입");
			System.out.println("[2]로그인");
			System.out.println("[3]로그아웃");
			System.out.println("[4]입금");
			System.out.println("[5]이체");
			System.out.println("[6]잔액조회");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("계좌 : ");
				String acc = scan.next();
				System.out.println("비번 : ");
				String pw = scan.next();
				System.out.println("금액 : ");
				int money = scan.nextInt();
				System.out.println(e8.joinTc(acc, pw, money)?"가입 성공":"중복 계좌");
				//이 방법 활용도 높을거같음 로그인상태를 하나의메서드로 담아서 공통관리할수잇을듯
				
			}else if(sel == 2) {
				System.out.println("계좌 : ");
				String acc = scan.next();
				System.out.println("비번 : ");
				String pw = scan.next();
				System.out.println(e8.loginTc(acc, pw)?"로그인 성공":"로그인 실패");
				
			}else if(sel == 3) {
				e8.logoutTc();
				System.out.println("로그아웃 되었습니다.");
			}else if(sel == 4) {
				if(e8.isLoginTc())
				System.out.println("입금액 : ");
				int money = scan.nextInt();
				e8.depositTc(money);
				
			}else if(sel == 5) {
				if(e8.isLoginTc())
				System.out.print("상대 계좌 : ");
				String acc = scan.next();
				System.out.print("이체 금액 : ");
				int money = scan.nextInt();
				System.out.println(e8.transferTc(acc, money)?"이체성공":"이체실패");
				
			}else if(sel == 0) {
				System.out.println("시스템 종료");
				run = false;
			}
		
	}
	}
}
