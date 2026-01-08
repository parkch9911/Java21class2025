package classpart08;

import java.util.Scanner;

public class ClassEx08 {
	String name = "";
	String[] arAcc = {"1111", "2222", "3333", "4444", "5555","","","","",""};
	String[] arPw = {"1234", "2345", "3456", "4567", "5678","","","","",""};
	int[] arMoney = {87000, 34000, 17500, 98000, 12500,0,0,0,0,0};
	int count = 5; //아마 계정 수 인거같음.
	int loginCheck = -1; //비로그인 => -1  / 로그인 - acc[i]
	Scanner scan = new Scanner(System.in);
	
	public ClassEx08() {};
	
	//로그인
	public void login() {
		if(loginCheck == -1) {
		System.out.print("아이디 : ");
		String id = scan.next();
		System.out.print("비밀번호 : ");
		String pw = scan.next();
		for(int i = 0; i<count; i++) {
			if(arAcc[i].equals(id) && arPw[i].equals(pw)) {
				loginCheck = i; 
			}else if(!arAcc[i].equals(id) || !arPw[i].equals(pw)) {
			}
		}
		if(loginCheck != -1) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		}else {
			System.out.println("이미 로그인 상태입니다.");
		}
	}
	
	//기본 정보 출력 메서드
	//count 넣어줘야하나?
	public void print() {
		System.out.println("--------------------------");
		System.out.println("계좌번호    비밀번호    계좌잔액");
		System.out.println("--------------------------");
		for(int i =0; i<count; i++) {
			System.out.println(" "+arAcc[i]+"\t  "+arPw[i]+"\t    "+arMoney[i]);
		}
		System.out.println("--------------------------");
		System.out.println();
		System.out.println("[MEGA BANK]");
		System.out.print("로그인 상태 : ");
		if(loginCheck == -1) {
			System.out.print("로그아웃\n");
		}else {
				System.out.print(arAcc[loginCheck]+"\n");
		}
		System.out.println("[1]회원가입");
		System.out.println("[2]로그인");
		System.out.println("[3]로그아웃");
		System.out.println("[4]입금");
		System.out.println("[5]이체");
		System.out.println("[6]잔액조회");
		System.out.println("[0]종료");
		System.out.print("선택 >> ");
	}
	
	//회원가입 
		public void join() {
			System.out.print("생성할 아이디 : ");
			String newid = scan.next();
			System.out.print("생성할 비밀번호 : ");
			String newpw = scan.next();
			System.out.println("계좌 개설 시 1000원이 추가 지급됩니다.");
			System.out.print("초기 입금액 : ");
			int newmoney = scan.nextInt();
			for(int i =0; i<count; i++) {
				if(arAcc[i].equals(newid)) {
					System.out.println("회원가입 실패");
				}else if(!arAcc[i].equals(newid)) {
					System.out.println("회원가입 성공");
					count++;	//계정 개수 증가
					arAcc[count-1] += newid; // 해당 계정배열에 입력값 넣기
					// 카운트가 5고 인덱스는 0부터니까 -1해주기
					arPw[count-1] += newpw;
					arMoney[count-1] += newmoney+1000;
					break;
				}
			}
		}
	
	
	//로그아웃 
		public void logout() {
			if(loginCheck != -1) {
				loginCheck = -1;
				System.out.println("로그아웃되었습니다.");
			}else {
				System.out.println("현재 로그인 상태가 아닙니다.");
			}
		}
		
	//입금 
		public void deposit() {
			System.out.print("입금액 : ");
			int moveMoney = scan.nextInt();
			arMoney[loginCheck] += moveMoney;
		}
	//이체 
		public void transfer() {
			System.out.print("상대 계좌 : ");
			String whoGet = scan.next();
			System.out.print("이체 금액 : ");
			int moveMoney = scan.nextInt();
			for(int i =0; i<count; i++) {
				if(whoGet.equals(arAcc[i])) {
					arMoney[i] += moveMoney;
					arMoney[loginCheck] -= moveMoney;
				}
			}
		}
	//잔액조회
		public void checkmoney() {
			System.out.print("현재 잔액 : "+arMoney[loginCheck]+"원");
			
		}
	
	//========================================================
	//========================================================
	//========================================================
	// 회원가입함수
		//회원가입하면 1000원지급
		public boolean joinTc(String acc, String pw, int money){
			//아이디 중복 체크 예외처리
			for(int i = 0; i<arAcc.length; i++) {
				if(arAcc[i].equals(acc)) {
					return false; //아이디 중복
				}
			}
			arAcc[count] = acc;
			arPw[count] = pw;
			arMoney[count] = money+1000;
			count++;
			return true;
		}
		
		public boolean loginTc(String acc, String pw) {
			//현재 로그인 상태인지 확인하는 예외처리
			if(loginCheck != -1) return false; //현재 로그인상태
			// id와 pw가 같은지 확인
			for(int i = 0; i<arAcc.length; i++) {
				if(arAcc[i].equals(acc) && arPw[i].equals(pw)) {
					loginCheck = i;
					return true; //아이디 비밀번호 일치 / 로그인 성공
				}
			}
			return false; //아이디 비밀번호 불일치 / 로그인 실패
		}
	
		
		public void logoutTc() {
			loginCheck = -1;
		}
		
		public void depositTc(int money) {
			arMoney[loginCheck] += money;
		}
		
		public boolean transferTc(String acc, int money) {
			int target = -1; // 이체 할 계좌가 있는지 
			for(int i = 0; i<arAcc.length; i++) {
				if(arAcc[i].equals(acc)) {
					target = i;
					break;
				}
			}
			// 상대계좌가 없거나 돈이 부족하면
			if(target == -1 || arMoney[loginCheck] < money) {
				return false;
			}
			arMoney[loginCheck] -= money;
			arMoney[target] += money;
			return true;
		}
		
		public int checkmoneyTc() {
			return arMoney[loginCheck];
		}
		
		public boolean isLoginTc() {
			// 현재 로그인상태
			return loginCheck == -1;
		}
		
		
		
		
		
		
}
