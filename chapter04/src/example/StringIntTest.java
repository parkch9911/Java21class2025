package example;

import java.util.Arrays;
import java.util.Scanner;

public class StringIntTest {

	public static void main(String[] args) {
		int[] seat = new int[7];//좌석
		Scanner scan = new Scanner(System.in);
		int select = 0;//선택
		int people = 0;//머릿수
		int seatNum = 0; //좌석 번호 
		int count = 0;
		
		boolean run = true;//프로그램 종료여부
		
		while(run == true) {
			System.out.println("==그린 영화관==");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			System.out.print("입력 >>");	
			select = scan.nextInt();
			if(select == 2) { //프로그램 종료 메뉴 선택 시
				System.out.println("프로그램이 종료됩니다.");
				System.out.println("총 매출 : "+count*12000+"원");
				run = false; // while 문 종료
				
			}else if(select == 1) {//좌석 예매 선택 시
				
			}
		}
		
	}

}
