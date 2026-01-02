package example;

import java.util.*;

public class ArrEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = {"홍길동","개나리","진달래","김백합","최동훈"}; 
		int[] score = new int[name.length]; //{0,0,0,0,0} 으로 두기 
		double sum = 0; //평균점수
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"의 점수를 입력하세요 : " );
			score[i] = scan.nextInt(); // 성적 입력해서 배열에 넣기
			sum += score[i]; //합 구하기
		}
		for(int j =0; j<name.length; j++) {
			System.out.println(name[j]+"의 점수 : "+score[j]); //이름 배열, 점수 배열 순서가 같아서 같이 뽑기
		}
		System.out.println("=================");
		System.out.println("평균 : "+ sum/name.length); // 평균 점수 : 점수 합/인원수
	}

}
