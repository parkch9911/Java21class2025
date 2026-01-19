package capitalGame;

import java.util.*;

public class Game {
	boolean run = true;
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	Scanner scan3 = new Scanner(System.in);
	Random ra = new Random();
	String makeQuiz;
	Map<String, String> quiz = new HashMap<String, String>();
	//이미 있는 문제 만들기=================================================================
	public void menu() {
		String[] con = {"한국","미국","일본","호주","러시아","그리스","네덜란드","독일"};
		String[] cit = {"서울","워싱턴D.C","도쿄","캔버라","모스크바","아테네","암스테르담","베를린"};
		
		for(int i =0; i<con.length; i++) {
			quiz.put(con[i],cit[i]);
		}
	//================================================================================
		
			System.out.println("con[0] 출력 결과 : "+con[0]); 
		while(run) {
			System.out.println("***수도 맞추기 게임을 시작합니다***");
			System.out.print("입력 : 1  퀴즈 : 2  종료 : 3 >>");
			int sel = scan.nextInt();
			if(sel == 1) {			//1번 선택하면
				howManyCon(); //퀴즈 몇개있는지 알려주는 메서드
				System.out.print("나라와 수도 입력"+(quiz.size()+1)+ " ex)한국 서울>> ");
					makeQuiz = scan2.nextLine();
					StringTokenizer token = new StringTokenizer(makeQuiz);
						String makeCon = token.nextToken().trim(); //한국 
						String makeCit = token.nextToken().trim(); //서울 
					
						//이미 저장된 나라와 수도가 존재하면 예외 처리.
						if(quiz.containsKey(makeCon)) { //같은나라 존재시 true
							System.out.println("이미 존재하는 나라입니다.");
						}else {
							quiz.put(makeCon, makeCit);
						}
						
						
			}else if(sel == 2) {
				int ok = 0;
				for (String keys : quiz.keySet()) {
					System.out.print(keys + "의 수도는? >>");
					//quiz.get(keys) 이게 밸류
					String ans = scan3.next();
						if(ans.equals(quiz.get(keys))) {
							System.out.println("정답입니다");
							ok++;
						}else {
							System.out.println("오답입니다");
						}
				}
				System.out.println("퀴즈 종료");
				System.out.println("맞춘 문제 : "+ok+"개");
			}else {//sel == 3일때
				System.out.println("종료");
				run =false;
			}
		}
	}
	
	//현재 나라 얼마나 있는지 알려주는
	public void howManyCon() {
		System.out.println("현재"+quiz.size()+"개 나라의 수도가 입력되어있습니다.");
	}
	
	public void gameStart() {
		while(true) {
			ArrayList<String> randomQuiz = new ArrayList<String>(quiz.keySet());
			System.out.println(quiz.keySet());
			int index = ra.nextInt(quiz.size());
			
			
		}
	}
	
	
	
	
	//이번 문제에서 sel로 메뉴선택을 숫자로 받고
	//입력이나 퀴즈에서 문자로 답을 입력해 scan받는데 nextLine으로 하면 메뉴선택에서 작성한 숫자도 포함되기대문에
	// scan.nextLine(); 으로 이전 입력 버퍼를 정리해 줄 수 있다.
	// 나라 수도 입력해서 퀴즈 추가하는거 그만이라고입력했을때 멈춰야하는데 나는 하나씩해버렸음,,1
	
	
	
}
