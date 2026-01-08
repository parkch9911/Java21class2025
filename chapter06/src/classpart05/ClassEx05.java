package classpart05;

import java.util.Random;

public class ClassEx05 {
	
	int[] answer = {1,3,4,2,5};
	int score = 0;
	int[] hdg = new int[5];
	public ClassEx05() {};
	int count = 0;
	
	
	//정답 출력 함수
	public void print() {
			System.out.print("answer = ");
		for(int n : answer)
			System.out.print(n+" ");
			System.out.println();
	}
	
	//랜덤 출력 함수
	Random ra = new Random();
//	int[] hdg = ra.ints();
	public void random() {
		System.out.print("hdg = ");
		for(int i= 0; i<answer.length; i++) {
			hdg[i] = ra.nextInt(5)+1;
			System.out.print(hdg[i]+" ");
		}
	}
	
	//정오표 출력 함수
	public int check() {
		count = 0;
		System.out.print("\n정오표 = ");
		for(int i= 0; i<answer.length; i++) {
			if(answer[i] == hdg[i]) {
				System.out.print("O ");
				count++;
			}else {
				System.out.print("X ");
			}
		}
		return count;
	}
	
	// 점수 계산 함수
	public void score() {
		System.out.print("\n점수 = ");
		System.out.println(count*20+"점");
	}
	
	
	
}
