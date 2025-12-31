package ifexample;

import java.util.Random;
import java.util.Scanner;

public class IfEx13 {

	public static void main(String[] args) {
		Random ran = new Random();
		int rn = ran.nextInt(50)+1;
		int count = 0; //개수 누적
		System.out.println("문제 : "+rn);
		int ten = rn/10; //십의자리
		int one = rn%10; //일의자리
		if(ten ==3 || ten==6 || ten==9) {
			count++;
		}
		if(one ==3 || one==6 || one==9) {
			count++;
		}
		if(count==1) {
			System.out.println("짝");
		}else if(count==2) {
			System.out.println("짝짝");
		}else{System.out.println(rn);
		}
		
	}

}
