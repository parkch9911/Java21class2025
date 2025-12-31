package ifexample;

import java.util.Scanner;

public class IfEx14 {

	public static void main(String[] args) {
		int num = 0; //정거장 수
		int pay = 0; //요금
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("이용할 정거장 수를 입력하세요 : ");
		num = scan.nextInt();
		if(num <= 5) {
		  pay = 500;			//5정거장까지 500원
		}else if(num <= 10) {
			pay = 600;			//10정거장까지 600원
		}else{
			pay = 600+50*((num-9)/2);
		}
		System.out.printf("요금: %d원",pay);
		
		
		
		scan.close();
	}

}
