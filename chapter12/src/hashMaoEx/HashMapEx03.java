package hashMaoEx;

import java.util.*;

public class HashMapEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Map의 데이터 타입은 클래스 또는 래퍼클래스 이어야한다.
		Map<String,Double> stud = new HashMap<String,Double>();
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("미래 장학금 관리 시스템 입니다.");
		
		for(int i = 0; i<5; i++) {
			System.out.print((i+1)+"번쨰 학생 이름과 학점 ex)홍길동 3.5 >>");
			String input = scan.nextLine();
			StringTokenizer token = new StringTokenizer(input);
			String name = token.nextToken().trim();
			Double score = Double.parseDouble(token.nextToken().trim());
			if(score >= 0.0 && score <= 4.5) {
				stud.put(name, score);
			}else {
				System.out.println("성적이 잘못입력되었습니다.");
				i -= 1; //잘못입력되면 현재 루프값 -1
			}
			
		}
		System.out.print("장학생선발학생기준입력 >>");
		double scholar = scan.nextDouble();
		for (String inputs : stud.keySet()) {
			if(stud.get(inputs) > scholar) {
				arr.add(inputs);
			}
		}
		System.out.println("장학생 명단 : "+arr);
	}
}
