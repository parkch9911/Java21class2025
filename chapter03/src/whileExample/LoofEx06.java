package whileExample;

import java.util.Scanner;

public class LoofEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean run = false; //시스템 온오프
		int id1 = 1111;
		int pw1 = 1111;
		int id2 = 2222;
		int pw2 = 2222; 
		int select = 0; //메뉴선택
		boolean isOn =false; //로그인상태
		while(run == false) {
			System.out.println("1.로그인\n2.로그아웃\n0.종료");
			System.out.print("메뉴 선택 : " );
			select = scan.nextInt();
			if(select == 1 && isOn == false) { //로그인 안하고 1번 선택 시
				System.out.print("계좌번호: ");
				int inputid = scan.nextInt();
				System.out.print("비밀번호: ");
				int inputpw = scan.nextInt();
				if(inputid == id1 && inputpw == pw1) { //유저1번꺼
					System.out.printf("%d님 환영합니다.%n",id1);
					isOn =true;
				}else if(inputid == id2 && inputpw == pw2){
					System.out.printf("%d님 환영합니다.%n",id2);
					isOn =true;
				}else {System.out.println("아이디와 비밀번호를 확인해주세요");}
			}else if(select == 1 && isOn == true) {
				System.out.println("이미 로그인 상태 입니다.");
			}else if(select == 2 && isOn == false) {
				System.out.println("로그인 상태가 아닙니다.");
			}else if(select ==2 && isOn == true) {
				System.out.println("로그아웃 되었습니다.");
				isOn = false;
			}else if(select == 0){
				System.out.println("시스템이 종료되었습니다.");
				run = true;
			}else {
				System.out.println("올바른 값을 입력해주세요.");
			}
		}
		scan.close(); 
		//광민씨꺼 보니까 조건문을 &&연산자로 묶어서 나열하는거 말고 if를 하위로 한단계 빼서 관리하니까 가독성이 좋아보였음
		//select == 1 까지만 주고 하위로 isOn == false ~
	}

}
