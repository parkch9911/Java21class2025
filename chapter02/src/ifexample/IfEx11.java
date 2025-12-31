package ifexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx11 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int randomNum = ran.nextInt(100)+1;
		int answer = 0;
		System.out.printf("문제 [%d]%n1.짝수%n2.홀수%n",randomNum);
		System.out.print("번호를 선택하세요 >>");
		answer = scan.nextInt(); // 답 입력하기
		if(answer == 1) {
			answer = 0;
		}else {answer = 1;}
		int x = randomNum % 2; //나머지값 구해서 짝홀수 구분 
		if(x == answer) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
			}
		
		//x의 값과 answer의 값이 같다면 정답 else 오답으로 처리하는게 더 깔끔했을거같음.
		//대신 1을 고르면 0으로 , 2를 고르면 1로 되어야함.
		// 아니면 (&&)||(&&)
		scan.close();
	}

}
