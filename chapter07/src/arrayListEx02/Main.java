package arrayListEx02;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		int run = 1;
		
		while(run<=3) {
			Student sName = new Student();
			System.out.print("학생 이름을 입력하세요 : ");
			//student 클래스의 name 멤버변수에 접근할 이름을 입력함
			sName.name = scan.next();
			//과목2개입력
			for(int i = 0; i<2; i++) {
				//subject를 객체화해야함
				Subject subject = new Subject();
				System.out.print("과목명을 입력하세요 : ");
				subject.sub = scan.next();
				System.out.println("점수를 입력해주세요 : ");
				subject.score = scan.nextInt();
				
				//Student클래스 안에 과목, 점수 추가해야한다.
				sName.sublist.add(subject); 
			}
			//list에 학생이 추가되어야함
			list.add(sName);
			run++;
		}
		
			System.out.println("학생 성적을 출력하시겠습니까? \"확인\"");
			String sel = scan.next();
			if(sel.equals("확인")) {
				run = 4;
				// 여기에 학생 성적 출력
				for(int i = 0; i<list.size(); i++) {
					Student s = list.get(i);
					System.out.println("학생이름 : "+s.name);
					for(int j = 0; j<s.sublist.size(); j++) {
						Subject sub = s.sublist.get(j);
						System.out.println("과목명 : "+sub.sub+"  점수 : "+sub.score);
					}
				}
				
				
			}else {
				System.out.println("정확하게 입력해주세요");
				
			}


	}

}
