package exceTest;

import java.util.*;


public class ExceptionTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Exception 및 하위 클래스를 이용해서 예외처리를
		// 다양하게 할 수 있다.
		
		int i = 0;
		int j = 0;
		// 자료구조 => 선형자료구조 (자료를 한 줄로 저장...)
		int[] iarr = new int[5];
		// ArrayList<> 는 List<>의 하위 클래스이다.
		// 고로, List<>로 업캐스팅 할 수 있다.
		// 자료구조 마찬가지로 선형자료구조
		List<Integer> list = new ArrayList<Integer>();
		
		//try{}catch(){}catch(){}...finally(){}
		try {
			//실행구문
			System.out.print("input i : ");
			i = scan.nextInt();
			System.out.print("input j : ");
			j = scan.nextInt();
			System.out.println("i/j : "+(i/j));
			
			for(int k =0; k<6; k++) {
				System.out.println("iarr["+k+"]"+iarr[k]);
			}
			System.out.println("List size : "+list.size());
			
		}catch(InputMismatchException e) {
			//실행 구문 오류가 있을때 catch()로 넘겨라
			e.printStackTrace();
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 길이를 확인하세요.");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			//Exception 은 최상위 클래스로 catch() 가 하나일때는 사용가능
			//단, catch()가 여러개일때 Exception 클래스는 맨 앞에 사용할 수 없다.
			System.out.println("숫자를 입력하세요");
		}finally{
			// 오류의 존재 유무와 상관없이 무조건 출력됨
			System.out.println("end");
		}
		scan.close();
		
	}

}
