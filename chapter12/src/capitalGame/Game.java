package capitalGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

import hashMaoEx.Location;

public class Game {
	boolean run = true;
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	Scanner scan3 = new Scanner(System.in);
	String makeQuiz;
	Map<String, String> quiz = new HashMap<String, String>();
	public void menu() {
		String[] con = {"한국","미국","일본","호주","러시아","그리스","네덜란드","독일"};
		String[] cit = {"서울","워싱턴D.C","도쿄","캔버라","모스크바","아테네","암스테르담","베를린"};
		//이미 있는 문제 만들기
		for(int i =0; i<con.length; i++) {
			quiz.put(con[i],cit[i]);
		}
		//==============
		
			System.out.println("con[0] 출력 결과 : "+con[0]); 
		while(run) {
			System.out.println("***수도 맞추기 게임을 시작합니다***");
			System.out.print("입력 : 1  퀴즈 : 2  종료 : 3 >>");
			int sel = scan.nextInt();
			if(sel == 1) {			//1번 선택하면
				
				System.out.println("현재"+quiz.size()+"개 나라의 수도가 입력되어있습니다.");
				 
				System.out.print("나라와 수도 입력"+(quiz.size()+1)+ " ex)한국 서울>> ");
					makeQuiz = scan2.nextLine();
					StringTokenizer token = new StringTokenizer(makeQuiz);
						String makeCon = token.nextToken().trim(); //한국 
						String makeCit = token.nextToken().trim(); //서울 
						quiz.put(makeCon, makeCit);
						
			}else if(sel == 2) {
				for (String keys : quiz.keySet()) {
					System.out.print(keys + "의 수도는? >>");
					//quiz.get(keys) 이게 밸류
					String ans = scan3.next();
						if(ans.equals(quiz.get(keys))) {
							System.out.println("정답입니다");
						}else {
							System.out.println("오답입니다");
						}
				}
			}else {//sel == 3일때
				System.out.println("종료");
				run =false;
			}
		}
	}
	
	//현재 나라 얼마나 있는지 알려주는 메서드
	
	
}
