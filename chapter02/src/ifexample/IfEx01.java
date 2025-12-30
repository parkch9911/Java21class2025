package ifexample;

import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		// dbId= "1234" 값이 저장된 힙메모리의 주소가 dbId에 존재하기 때문에
		// 값을 직접 비교 할 수 없다.
		// 이런 경우, 문자를 비교 할 때는 반드시 equals()메서드를 이용해서 힙메모리의 값을 직접 비교한다.
		// int 기본 데이터 타입은 변수에 값이 저장되어 있으므로 == 만 가지고도 값을 비교 할 수 있다.
		// 기본 데이터 타입에서 equals로 비교 X
		String dbId = "1234";
		String dbPw = "1111"; 
		System.out.print("ID 입력 : ");
		String Id = scan.next();
		System.out.print("PW 입력 : ");
		String Pw = scan.next();
		//equals()가 들어가면 부정을 앞에 붙인다 ex) !dbPw.equals(Pw)
		if((dbId.equals(Id))&&(dbPw.equals(Pw))) {
			System.out.println("로그인성공");
		}else {
			System.out.println("로그인실패");
		}
	}
	
}
