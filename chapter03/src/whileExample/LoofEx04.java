package whileExample;

import java.util.Scanner;

public class LoofEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		// while (조건) => true는 무한루프 돈다는 의미
		while(run==true) {
			System.out.print("수를 입력 exit : -100");
			int num = scan.nextInt();
			if(num == -100) {
				System.out.println("종료");
				run =false;
			}
		}
	}

}
