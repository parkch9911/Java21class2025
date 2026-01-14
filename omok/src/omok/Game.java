package omok;

import java.util.Scanner;

public class Game {
	GameElements GE = new GameElements();
	Scanner scan = new Scanner(System.in);
	String[][] put = new String[13][13];
	boolean run = true;
	boolean game = true;
	int turn = 0;
	int isWin = 0;
	public Game() {};
	
	public void menu() {
		while(run) {
			System.out.println("[오목]");
			System.out.println("[1]게임 시작");
			System.out.println("[2]전적 확인");
			System.out.println("[0]종료");
			System.out.print("메뉴선택 >> ");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("오목 게임 시작 (플레이어1 : 흑돌, 플레이어2 : 백돌)");
				while(game) {
					System.out.println("플레이어"+ (turn+1) +" 차례 - 놓을 위치 선택");
					System.out.print("세로 1~13 : ");
					int putY = scan.nextInt();
					System.out.print("가로 1~13 : ");
					int putX = scan.nextInt();
					for(int i = 0; i<13; i++) {
						for(int j = 0; j<13;j++) {
							if(turn == 0 ) {// 1의 차례이면서 빈자리라면
								put[putY-1][putX-1] = " ○ ";
							}else if(turn == 1 ) { // 2의 차례이면서 빈자리라면
								put[putY-1][putX-1] = " ● ";
							}
							//나머지도 출력
							if(put[i][j] == null) {
								put[i][j] = "─┼─";
							}
								System.out.print(put[i][j]);
								if(turn == 0) { //플레이어1
									// ↘ 대각선
									if(putY >= 6 && putY <= 8 && putX >= 6 && putX <=8) {
										if(" ○ ".equals(put[i][j]) && " ○ ".equals(put[i+1][j+1])
												&& " ○ ".equals(put[i+2][j+2]) && " ○ ".equals(put[i+3][j+3])
												&& " ○ ".equals(put[i+4][j+4])){
											isWin = 1;
									}};
									// ↗ 대각선
									if(putY >= 6 && putY <= 8 && putX >= 6 && putX <=8) {
										if(" ○ ".equals(put[i][j]) && " ○ ".equals(put[i-1][j+1])
												&& " ○ ".equals(put[i-2][j+2]) && " ○ ".equals(put[i-3][j+3])
												&& " ○ ".equals(put[i-4][j+4])){
										isWin = 1;
									}};
									// 좌우 직선
									if(putX <= 9) {
										if(" ○ ".equals(put[i][j]) && " ○ ".equals(put[i][j+1]) 
												&& " ○ ".equals(put[i][j+2]) && " ○ ".equals(put[i][j+3])
												&& " ○ ".equals(put[i][j+4])) {
											isWin = 1;	
									}};
									// 상하 직선
									if(putY <= 9) {
										if(" ○ ".equals(put[i][j]) && " ○ ".equals(put[i+1][j]) 
												&& " ○ ".equals(put[i+2][j]) && " ○ ".equals(put[i+3][j])
												&& " ○ ".equals(put[i+4][j])) {
											isWin = 1;
									}};
								}else if(turn ==1) {//플레이어2
									// ↘ 대각선
										if(putY >= 6 && putY <= 8 && putX >= 6 && putX <=8) {
											if(" ● ".equals(put[i][j]) && " ● ".equals(put[i+1][j+1]) //좌상우하 오류
													&& " ● ".equals(put[i+2][j+2]) && " ● ".equals(put[i+3][j+3])
													&& " ● ".equals(put[i+4][j+4])) {
											isWin = 2;
									// ↗ 대각선
										if(putY >= 6 && putY <= 8 && putX >= 6 && putX <=8) {
											if(" ● ".equals(put[i][j]) && " ● ".equals(put[i-1][j+1])
													&& " ● ".equals(put[i-2][j+2]) && " ● ".equals(put[i-3][j+3])
													&& " ● ".equals(put[i-4][j+4])){
											isWin = 2;
										}};
									// 좌우 직선
										if(putX <= 9) {
											if(" ● ".equals(put[i][j]) && " ● ".equals(put[i][j+1]) 
													&& " ● ".equals(put[i][j+2]) && " ● ".equals(put[i][j+3])
													&& " ● ".equals(put[i][j+4])) {
												isWin = 2;	
										}};
									// 상하 직선
										if(putY <= 9) {
											if(" ● ".equals(put[i][j]) && " ● ".equals(put[i+1][j]) 
													&& " ● ".equals(put[i+2][j]) && " ● ".equals(put[i+3][j])
													&& " ● ".equals(put[i+4][j])) {
												isWin = 2;
										}};
									}
								}
							} //플레이어2 승리조건 종료
						}//위에 내부포문 종료
						System.out.println("");
						}//위에 외부포문 종료
					
					if(isWin != 0) {
						System.out.println("플레이어"+(turn+1)+"승리");
						for(int i = 0; i<13; i++) {
							for(int j = 0; j<13;j++) {
								put[i][j] = null;
									}
								}
						break;
							}
						
					if(turn == 0 ) {  // 턴 바꾸기
						turn =1;
					}else {
						turn = 0;
					}};
			}else if(sel==2) {
				
			}else if(sel ==0) {
				System.out.println("시스템 종료");
				run = false;
			}}
		};
	};
