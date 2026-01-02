package example;

import java.util.*;

public class ArrMovie {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10];//좌석
		
		int select = 0;//선택
		int people = 0;//머릿수
		int seatNum = 0; //좌석 번호 
		int count = 0;
		
		int cut = 0;
		
		boolean run = true;//프로그램 종료여부
		
		while(run == true) {
			
			for(int k =0; k<seat.length; k++) {
				if(seat[k]==0) {
					System.out.print("[ ]");
				}else if(seat[k] ==1) {
					System.out.print("[🚫]");
				}else if(seat[k] ==2) {
					System.out.print("[✔️]");
				}
			}
			System.out.println("\n==그린 영화관==");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			System.out.print("입력 >>");	
			select = scan.nextInt();
			if(select == 2) { //프로그램 종료 메뉴 선택 시
				System.out.println("프로그램이 종료됩니다.");
				System.out.println("총 매출 : "+count*12000+"원");
				run = false; // while 문 종료
				
			}else if(select == 1) {//좌석 예매 선택 시
				
				System.out.print("예매 인원을 입력하세요 (1~10) >> ");
				people = scan.nextInt();
				cut = people;
				for(int i = 0; i<seat.length; i++) { //예약 불가한 자리 없애는 곳 
					if(seat[i]==1) {
						seat[i] = 0;
					}
				}
				System.out.println("머릿수"+cut);
				
				System.out.print("좌석 번호를 입력하세요 (1~10) >> ");
				seatNum = scan.nextInt();
				
				if(people == 1 && seatNum%2==0) { //혼자서 짝수 자리 선택 시
					System.out.println("혼자서는 짝수 자리 예매가 불가능합니다.");
					seat[1] = 1; //  예약 불가 처리 
					for(int o =1; o<=seat.length; o++) {
						if(o%2==0) {
							seat[o-1] = 1;
						}else if(seat[o] == 1) {
								seat[o] = 0;
							}
					}
					
				}else if(people>0 && seatNum>0) {  	// 인원수 지정, 좌석 선택 하면 
												   	//그럼 이미 예매됐다는 예외처리도 이 안에서 해야함
					if(seat[seatNum-1] !=2 ) { //좌석선택이 아직 예매가능한 자리일 경우
						if(cut >= 2) {
							for(int i=0; i<2;i++) { //i = 0부터 해서 자리 수 오른쪽으로 증가해서 앉히게하는데, 
								seat[seatNum-1+i]=2;
						}
							cut -= 2;
							System.out.println("남은 "+ cut + " 좌석을 선택해주세요: ");
						}else if(cut ==1) {
							for(int i=0; i<1;i++) { //i = 0부터 해서 자리 수 오른쪽으로 증가해서 앉히게하는데, 
								seat[seatNum-1+i]=2;
							cut = 0;
							if(cut == 0) {
								System.out.println("좌석 선택이 완료 되었습니다.");
							}else {
								System.out.println("남은 1개 좌석을 선택해주세요.");
							}
							
							}
						}
						
						
					}else {
						System.out.println("예매가 완료된 자리가 있습니다 확인해주세요.");
						}
					
				}else {
				System.out.println("1번과 2번 중 입력해주세요.");
				}	
			
			}
		}
	}
}
