package whileExample;

import java.util.Scanner;

public class LoofEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		boolean run = false; //시스템 온오프
		
		int id1 = 1111; //1번유저id
		int pw1 = 1111; //1번유저id
		int money1 = 60000; // 1번 돈
		
		int id2 = 2222; //2번유저id
		int pw2 = 2222; //2번유저id
		int money2 = 70000; // 2번 돈
		
		int select = 0; //메뉴선택
		boolean isOn =false; //로그인상태
		boolean is1 =false; //1번유저 로그인
		boolean is2 =false; //2번유저 로그인
		
		int moveMoney = 0; //이체/출입금액
		
		int accNum = 0; //상대 계좌번호
		
		String isOnKor = ""; //한글로 로그인상태 출력
		String isWho = ""; //누가 로그인했는지 출력
		while(run == false) {
			if(isOn == true) {
				isOnKor = "로그인";
			}else {
				isOnKor = "로그아웃";
			}
			if(is1 == true) {
				isWho = "1111유저";
			}else if(is2 == true) {
				isWho = "2222유저 ";
			}else {
				isWho = "";
			}
			System.out.println("현재 로그인 상태 : " + isWho + isOnKor);
			System.out.printf("%d님 잔액 : %d원%n%d님 잔액 : %d원%n",id1,money1,id2,money2); //================  돈 누적 안되고 초기값으로 돌아감
			System.out.println("1.로그인\n2.로그아웃\n3.입금\n4.출금\n5.이체\n6.조회\n0.종료");
			System.out.print("메뉴 선택 : " );
			select = scan.nextInt();
			if(select == 1 && isOn == false) { // 로그인 ======================================================
				System.out.print("계좌번호: ");
				int inputid = scan.nextInt();
				System.out.print("비밀번호: ");
				int inputpw = scan.nextInt();
				if(inputid == id1 && inputpw == pw1) { //유저1번꺼
					System.out.printf("=========%d님 환영합니다.=========%n",id1);
					isOn =true;
					is1 = true;
				}else if(inputid == id2 && inputpw == pw2){ //유저 2번꺼
					System.out.printf("=========%d님 환영합니다.=========%n",id2);
					isOn =true;
					is2 = true;
				}else {System.out.println("=========아이디와 비밀번호를 확인해주세요=========");}	
			}else if(select == 2) { // 로그아웃 ======================================================
				if(isOn == true) {
					System.out.println("=========로그아웃 되었습니다.=========");
					isOn = false;
					is1 = false;
					is2 = false;
				}else {
					System.out.println("=========로그인 상태가 아닙니다.=========");
				}
			}else if(select == 3) { // 입금 ======================================================
				if(isOn==true && is1==true) {
					System.out.print("입금할 금액을 입력해주세요 >>");
					moveMoney = scan.nextInt();
					money1 += moveMoney;
					System.out.printf("%d원이 입금되었습니다.%n기존 잔액 : %d원%n입금 후 잔액 : %d원%n",moveMoney,money1,(moveMoney+money1));
					
				}else if(isOn==true && is2==true) {
					System.out.print("입금할 금액을 입력해주세요 >>");
					moveMoney = scan.nextInt();
					money2 += moveMoney;
					System.out.printf("%d원이 입금되었습니다.%n기존 잔액 : %d원%n입금 후 잔액 : %d원%n",moveMoney,money2,(moveMoney+money2));
				}
				else{
					System.out.println("=========로그인 후 이용 가능합니다.=========");
				}	 
			}else if(select == 4) { // 출금 ======================================================
				if(isOn==true && is1==true) {
					System.out.print("출금할 금액을 입력해주세요 >>");
					moveMoney = scan.nextInt();
					if(money1 > moveMoney) {
						System.out.printf("%d원이 출금되었습니다.%n기존 잔액 : %d원%n출금 후 잔액 : %d원%n",moveMoney,money1,(money1-moveMoney));
						money1 -= moveMoney;
					}else {
						System.out.println("=========잔액이 부족합니다.=========");
					}
				}else if(isOn==true && is2==true) {
					System.out.print("출금할 금액을 입력해주세요 >>");
					moveMoney = scan.nextInt();
					if(money2 > moveMoney) {
						System.out.printf("%d원이 출금되었습니다.%n기존 잔액 : %d원%n출금 후 잔액 : %d원%n",moveMoney,money2,(money2-moveMoney));
						money2 -= moveMoney;
					}else {
						System.out.println("=========잔액이 부족합니다.=========");
					}
				}else{
					System.out.println("=========로그인 후 이용 가능합니다.=========");
				}
			}else if(select == 5) { // 이체 ======================================================
				if(isOn == true && is1 == true) {
					System.out.print("이체할 계좌번호를 입력해주세요 >>");
					accNum = scan.nextInt();
					if(accNum == id2) {
						System.out.println("이체 할 금액을 입력해주세요 >>");
						moveMoney = scan.nextInt();
						if(money1 > moveMoney) {
							System.out.printf("%d님에게 %d원 이체 완료되었습니다.%n 이체 후 잔액 : %d원%n",id2,moveMoney,(money1-moveMoney));
							money1 -= moveMoney;
							money2 += moveMoney;
						}else {
							System.out.println("=========잔액이 부족합니다.=========");
						}
					}else {
						System.out.println("=========계좌번호를 다시 확인해주세요.=========");
					}
					
				}else if(isOn == true && is2 == true) {
					System.out.print("이체할 계좌번호를 입력해주세요 >>");
					accNum = scan.nextInt();
					if(accNum == id1) {
						System.out.println("이체 할 금액을 입력해주세요 >>");
						moveMoney = scan.nextInt();
						if(money2 > moveMoney) {
							System.out.printf("%d님에게 %d원 이체 완료되었습니다.%n 이체 후 잔액 : %d원%n",id1,moveMoney,(money2-moveMoney));
							money2 -= moveMoney;
							money1 += moveMoney;
						}else {
							System.out.println("=========잔액이 부족합니다.=========");
						}
					}else {
						System.out.println("=========계좌번호를 다시 확인해주세요.=========");
					}
				}else {System.out.println("=========로그인 후 이용 가능합니다.=========");}
				
			}else if(select ==6) { // 조회 ======================================================
				if(isOn == true && is1 == true) {
					System.out.println("고객님의 계좌 잔액은"+money1+"원 입니다.");
				}else if(isOn == true && is2 == true) {
					System.out.println("고객님의 계좌 잔액은"+money2+"원 입니다.");
				}else {
					System.out.println("=========로그인 후 이용 가능합니다.=========");
				}
			}else if(select == 0) { // 종료 ======================================================
				System.out.println("=========시스템이 종료되었습니다.=========");
				run=true;
			}else { // 다른번호 입력 시 ======================================================
				System.out.println("=========0~6 사이의 값을 입력해주세요.=========");
			}

	}
		scan.close();
	}
}
