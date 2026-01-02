package example;

import java.util.Scanner;

public class ArrEx05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		int check = 0;
		System.out.print("학번 입력 : ");
		int x = scan.nextInt();
		for(int i = 0; i < hakbuns.length;i++) {
			if(check == 0) {
				if(x == hakbuns[i]) {
					check++;
					System.out.println(scores[i]);
					}
				}
			}
			if(check == 0 ) {
				System.out.println("학번이 없음.");
		}
			
			//for문안에
			// if(hakbuns[i] == x){
			// check = i;
			// 를 넣어서 포문 밖에서 if(check != -1) hakbuns[check] 주거나 else 없습니다.   
	}

}
