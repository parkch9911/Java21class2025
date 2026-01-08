package classpart09;

import java.util.Scanner;

public class Mainclass {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassEx09 e9 = new ClassEx09();
		// TODO Auto-generated method stub
		System.out.print("x값 입력 : ");
		int x = scan.nextInt();
		System.out.print("y값 입력 : ");
		int y = scan.nextInt();
		System.out.println("x + y : "+e9.sum(x, y)); //더한값
		System.out.println("x - y : "+e9.minus(x, y)); //뺀값
		System.out.println("x * y : "+e9.mul(x, y)); //곱한값
		System.out.println("x / y : "+e9.dev(x, y)); //나눈값
		System.out.println("x ^ y : "+e9.mmul(x, y));
	}

}
