package example;

import java.util.Scanner;

public class ArrEx04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		
		System.out.print("학번 입력 : ");
		int x = scan.nextInt();
		for(int i = 0; i < hakbuns.length;i++) {
			if(x == hakbuns[i]) {
				System.out.print("성적 : "+ scores[i]);
			}
		}
	}

}
