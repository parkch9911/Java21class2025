package scheduler;

import java.util.Scanner;

public class ScheduleTest {

	public static void main(String[] args) {
		// Scanner 입력 L,P,R
		// 각 클래스명의 첫자에 해당하는 출력문구가 나와야함
		Scanner scan = new Scanner(System.in);
		System.out.print("전화 상담 배분 방식을 선택하세요 : R , L , P >> ");
		// 대소문자 상관없이 입력받아도 출력되게
		String ch = scan.next();
		Scheduler sch = null;  //업캐스팅
		if("R".equals(ch) || "r".equals(ch)) {
			//인스턴스화
			sch = new RoundRobin();
		}else if("P".equals(ch) || "p".equals(ch)) {
			//인스턴스화
			sch = new PriorityAllLocation();
		}else if("L".equals(ch) || "l".equals(ch)) {
			//인스턴스화
			sch = new LeastJop();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		//메소드 출력
		sch.getNextCall();
		sch.sendCallAgent();
		sch.getLunch();

	}

}
