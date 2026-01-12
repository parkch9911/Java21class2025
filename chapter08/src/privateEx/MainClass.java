package privateEx;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateTest pt = new PrivateTest();
		pt.setMonth(2);
		pt.setDay(30);
		pt.setYear(2005);
		// PrivateTest에 각 변수의 초기값이 담겨있다면 set없이 get으로만 출력 가능.
		
		System.out.println("일 : "+pt.getDay());
		System.out.println("월 : "+pt.getMonth());
		System.out.println("년 : "+pt.getYear());
	}

}
