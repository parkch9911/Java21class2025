package ifexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rn = new Random();
		
		int num = rn.nextInt(10)+1; //숫자난수
		int num2 = rn.nextInt(10)+1; //숫자난수
		int num3 = rn.nextInt(4)+1; //연산자 난수 인데 이건 연산자 결과를 출력하기위함
		int ans = 0; //답 적는 값
		int x = 0; // 이건 번호랑 일치하는지 확인하는거
		if(num3 == 1) {
			num3 = (num + num2);
			x =1;
		}else if(num3 == 2) {
			num3 = (num - num2);
			x =2;
		}else if(num3 == 3) {
		num3 = (num * num2);
			x =3;
		}else if(num3 == 4) {
		num3 = (num % num2);
			x =4;
	}
		System.out.println(num+"?"+ num2 + "=" + num3 );
		System.out.println("1.+   2.-   3.*   4.%");
		ans = scan.nextInt();
		if(x == ans) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
	
		
		
		
		scan.close();
	}

}
