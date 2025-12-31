package whileExample;

import java.util.Scanner;

public class LoofEx05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count1 = 0; //불고기카운트
		int count2 = 0; //새우카운트
		int count3 = 0; //콜라카운트
		int seCnt = 1; //고른횟수
		int totalprice = 0; //총액
		int money = 0; //얼마잇어요
		System.out.println("=== 롯데리아 ===\n1. 불고기버거 : 8700원\n2. 새우버거 : 6200원\n3. 콜라 : 1500원");
		while(seCnt <= 5) {
			System.out.print("메뉴 선택 : ");
			int select = scan.nextInt();
			if(select == 1) {
				totalprice += 8700;
				count1 += 1;
			}else if(select == 2) {
				totalprice += 6200;
				count2 += 1;
			}else if(select == 3) {
				totalprice += 1500;
				count3 += 1;
			}
			seCnt++;
		}System.out.println("총금액 : "+totalprice+"원");
		System.out.print("현금입력 : ");
		money = scan.nextInt();
		if(totalprice > money) {
			System.out.println("결제실패");
		}else {
			System.out.println("===롯데리아 영수증===");
			System.out.printf("1. 불고기버거 : %d개%n2. 새우버거 : %d개%n3. 콜라 : %d개%n4. 총금액 : %d원%n5. 잔돈 : %d원",
					count1,count2,count3,totalprice,(money-totalprice));

		}


		scan.close();
	}

}
