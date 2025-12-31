package ifexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx12 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int randomNum = ran.nextInt(100)+150;
		int answer = 0; 							//내 답 적을곳
		int answer2 = 0; 							// 이건 난수에서 100단위 빼야할거
		System.out.printf("문제 = %d%n가운데 숫자를 입력하세요 : ",randomNum);
		answer2 = randomNum%100;					//난수 100단위 없애기
		answer = scan.nextInt();					// 답 적기
		if(answer == answer2/10) {					//10나눠서 판단
			System.out.println("정답");
		}else {System.out.println("오답");
		}
		
		
		scan.close();
	}

}
