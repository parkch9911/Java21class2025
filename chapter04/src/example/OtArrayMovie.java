package example;

import java.util.*;

public class OtArrayMovie {

	public static void main(String[] args) {
		// 영화 예매 프로그램 규칙 정리
		// 좌석 상태 값 정의
		// 0 : 비어있는 좌석 [ ]
		// 1. 현재 선택 중인 좌석 [o]
		// 2. 예매 완료된 좌석 [x]
		// 3. 예매 불가 좌석 [!]
		Scanner scan = new Scanner(System.in);
		
		// 좌석 10개로 배열 지정
		// int 배열의 깁손값은 0 -> 처음엔 모두 비어있음
		int[] seat = new int[10];
		// 전체 예매 인원 수(총 매출 계산용)
		int cnt = 0;
		// 프로그램 실행 여부를 제어하는 변수
		boolean run = true;
		// 메인 메뉴 선택
		while(run) {
			System.out.println();
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			System.out.println("3.취소");
			System.out.print("메뉴 선택 >>");
			int sel = scan.nextInt();
			
			//=================1. 좌석 예매 ============
			if(sel ==1) { // 좌석 예매 선택 시
				System.out.print("예매 인원을 입력하세요(1~8) : ");
				int inwon = scan.nextInt(); // 내가 입력한 인원 수
				if(inwon >= 1 && inwon <= 8) { // 예매 인원 유효성 검사
					if(inwon == 1) { //=========== 1명 예매일 경우===========
						// 1명 예매 규칙
						// - 짝수 좌석은 선택 불가 [!] => 3
						// - 홀수 좌석만 선택 가능
						for(int i =0; i<seat.length; i++) {
							// 2, 4, 6, 8, 10 => 배열은 index가 0부터 시작하므로
							// 사실 짝수 좌석을 막으려면 홀수인덱스를 선택 불가해야한다.
							if(i%2 != 0) {
								seat[i] = 3;
							}
						}
						// 현재 좌석 상태 for 출력
						for(int i =0; i<seat.length; i++) {
							if(seat[i] == 0) {
								System.out.print("[ ]");
							}else if(seat[i] == 2) {
								System.out.print("[X]");
							}else if(seat[i] == 3) {
								System.out.print("[!]");
							}else {
								System.out.print("[O]");
							}
						} // 현재 좌석 상태 for 출력 끝
						System.out.println("");
						
						
						// 좌석 선택 
						System.out.print("좌석 번호 선택 [1~10]");
						int idx = scan.nextInt()-1; 
						
						// 이미 선택 좌석 예외처리
						if(seat[idx] == 2) {
							System.out.println("이미 예매된 좌석 입니다.");
							
						}
						// 짝수 좌석 선택 시
						else if(idx % 2 != 0) {
							System.out.println("예매 불가능. 혼자 관람하실 경우 홀수 좌석을 선택해주세요.");
						}
						// 정상 예매
						else {
							seat[idx] =1; // 선택 상태 [o]
							System.out.println("예매 완료");
							
							// 예매 완료 되면 총매출액 계산을 위해서
							cnt++;
						}
				
				}
					//선택 후 좌석 출력
					for(int i =0; i<seat.length; i++) {
						if(seat[i] == 0) {
							System.out.print("[ ]");
						}else if(seat[i] == 2) {
							System.out.print("[X]");
						}else if(seat[i] == 3) {
							System.out.print("[!]");
						}else {
							System.out.print("[O]");
						}
					}
					System.out.println("");
					// ===== [2명 이상 예매 ]=============
					if(inwon >= 2 && inwon <=8 ) {
						
						int selectCnt = 0; //현재 선택한 인원 수를 담는 변수
						
						//인원 수 만큼 좌석 선택 반복
						// inwon =4, 현재 선택인원인 selectCnt = 2
						// selectCnt가 최초 선택 inwon보다 작으면
						// 아직 좌석 선택이 다 끝나지 않았음을 조건으로 표시함.
						while(selectCnt < inwon) {
							System.out.println("좌석번호 선택 (1~10)");
							int idx1 = scan.nextInt()-1;
							// 좌석 번호 범위체크 예외처리
							if(idx1 < 0 || idx1 >= 10) {
								System.out.println("좌석번호 오류");
								continue;
							}
							// selectCnt의 인원 중 마지막 1명이 남았을 경우
							// 전체 예매 인원 중 아직 선택하지 않은 사람이 1명 일 떄 실행하는 코드
							if(inwon - selectCnt == 1) {
								// 이미 선택되었거나, 예매 완료 된 좌석이면 선택불가 예외처리
								if(seat[idx1] == 1 || seat[idx1] == 2) {
									System.out.println("이미 선택되었거나 예매된 좌석입니다.");
									continue;
								}
								//셋팅 부분
								// 해당 좌석을 '선택 중[o]' 상태로 변경
								seat[idx1] =1;
								// 전체 예매 인원수를 누적 상태로 변경
								cnt++;
								// 현재 선택 완료 된 인원수 1명 증가
								selectCnt++;
							}else {
								// ===== 2명이상 남았을 경우=====
								// 연속해서 두 좌석 함께 선택되어야함
								
								// 배열 범위를 벗어나거나
								// 이미 선택되었거나, 예매가 완료된 좌석이 포함되어 있으면 
								// 선택 불가 예외처리 함
								if(idx1 >= 9 || seat[idx1] == 1 || seat[idx1+1] == 1 || seat[idx1] == 2 || seat[idx1+1] == 2) {
									System.out.println("이미 선택되었거나, 예매가 완료된 좌석입니다.");
									continue;
								}
								
								// 셋팅 부분
								// 현재 선택한 좌석과 바로 옆 좌석을 선택중[O]으로 상태 변경
								seat[idx1] = 1; 
								seat[idx1+1] = 1;
								
								// 전체 예매 인원수를 누적 상태로 변경
								cnt+=2;
								// 현재 선택 완료 된 인원수 증가
								selectCnt+=2;
								
								
							}
							
							//좌석 출력
							for(int i =0; i<seat.length; i++) {
								if(seat[i] == 0) {
									System.out.print("[ ]");
								}else if(seat[i] == 2) {
									System.out.print("[X]");
								}else if(seat[i] == 3) {
									System.out.print("[!]");
								}else {
									System.out.print("[O]");
								}
							}
							System.out.println("");
						}
						//예매 확정 처리======================
						//예매 확정 처리 [X]로 변경
						//예매 불가 [!]  => 다시 [ ]
						for(int i = 0; i<seat.length; i++) {
							if(seat[i]==3) {
								seat[i] = 0;
							}else if(seat[i] == 1) {
								seat[i] = 2;
							}
						}
						
						
						
					}
					
					
				}else { // 예매 인원이 유효하지 않을 경우
					System.out.println("예매 인원을 확인하세요.");
				}
			
				
				
			}else if(sel==2) {   // 1번 선택 if 종료 // 종료 버튼 선택 시
				//총 매출액 계산 예정
				int total = cnt*12000;
				System.out.printf("매출액 : %d원%n",total);
				System.out.printf("인원수 : %d명%n",cnt);
				//종료
				run = false;
				System.out.println("프로그램 종료");
				
			}else { // 2번 선택 if 종료 // 취소 버튼 개발예정
				
			}
			
			
		} // while끝
		
		
		// =======개발 종료=========
		scan.close();
		
	} // args 종료

} // class종료
