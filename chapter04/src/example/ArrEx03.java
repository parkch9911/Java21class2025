package example;

import java.util.*;

public class ArrEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {87, 11, 45, 98, 23};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("인덱스 입력 : ");
		int index = scan.nextInt();
		System.out.println("점수 : "+ arr[index]);
		
		System.out.print("성적을 입력 : ");
		int score = scan.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == score) {
				System.out.println("성적 인덱스 : "+ i);
			}else {
				System.out.println("존재하지않는 성적입니다.");
			}
		}
		
	}

}
