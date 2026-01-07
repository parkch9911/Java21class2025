package classpart;

public class Student {
	
	int studentId;
	String studentName;
	String address;
	int grade;
	
	//메소드 또는 함수 생성
	//접근 제어자 반환의 유무(void,데이터타입) 함수이름(){}
	//단, 반환할 값이 필요한 경우 반드시 return 값이 필요하다.
	
	public void showStudentInfo() {
		System.out.printf("%s 학생의 주소는 %s이다.",studentName,address);
		System.out.println();
	}
	
	//main()메소드를 생성한다.
	public static void main(String[] args) {
		// 홍길동 개나리 진달래 학생의 정보를 출력
		// 반드시 먼저 진행해야 하는 작업
		// 인스턴스화(객체화)를 진행한다.
		
		//st01, st02는 객체이다. 
		Student st01 = new Student();  //이게 인스턴스화  마치 scanner 처럼
		st01.studentName = "홍길동";
		st01.address = "서울";
		st01.showStudentInfo();
		
		Student st02 = new Student(); 
		st02.studentName = "개나리";
		st02.address = "수원";
		st02.showStudentInfo();
		
		System.out.println(st01);
		System.out.println(st02);
		
	}
	
}
