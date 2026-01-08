package classpart11;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ClassEx11 e11 = new ClassEx11();
		boolean run = true;
		e11.name = "=== 메가 IT 고등학교 ===";
		while(run) {
			System.out.println(e11.name);
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.학번으로 성적확인");
			System.out.println("5.종료하기");
			System.out.print("메뉴 선택 >> ");
			int sel = scan.nextInt();
			if(sel == 1) {
				for(int i = 0; i<e11.arHakbun.length; i++) {
					System.out.println(i+1+"."+e11.arHakbun[i]+"학번("+e11.arScore[i]+"점)");
				}
			}else if(sel == 2) {
				System.out.println(e11.arHakbun[e11.choice2()]);
				System.out.println(e11.arScore[e11.choice2()]);
				
			}else if(sel == 3) {
				System.out.println(e11.arHakbun[e11.choice3()]);
				System.out.println(e11.arScore[e11.choice3()]);
				
			}else if(sel == 4) {
				System.out.print("학번 입력 >> ");
				int hak = scan.nextInt();
				if(e11.choice4(hak) == 0) {
					System.out.println("존재하지않는 학번입니다.");
				}else {
					System.out.println(e11.choice4(hak)+"점");
				}
			}else if(sel == 5) {
				System.out.println("시스템 종료");
				run = false;
			}
		}
	}

}
