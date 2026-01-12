package formatExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleEx {

	public static void main(String[] args) throws ParseException {
		// SimpleDateFormat 클래스는 날짜를 특정 형식의 문자열로
		// 출력하거나 문자열로 변환할 때 사용한다.
		// 출력할 때 : SimpleDateFormat.format()
		// 변경할 때 : SimpleDateFormat.parse()
		// SimpleDateFormat 클래스도 new 예약어로 객체 생성해 사용
		// SimpleDateFormat.format("yyyy-mm-dd")
		//								↘ 따옴표 안에 변경할 날짜 형식 입력
		
		
		Scanner scan = new Scanner(System.in);
		
		// 현재 날짜 / 시간 객체
		// 타입이 Date인 new 객체를 
		Date now = new Date();
		// 날짜 포멧
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년-MM월-dd일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년-MM월-dd일 (E)");
		SimpleDateFormat sdf5 = new SimpleDateFormat("HH:mm:ss a");
		
		System.out.println(now); //Mon Jan 12 10:45:21 KST 2026
		System.out.println(sdf1.format(now));
		System.out.println(sdf3.format(now));
		System.out.println(sdf4.format(now));
		System.out.println(sdf5.format(now));
		System.out.println(sdf1.parse("2026-02-03"));
		System.out.println(sdf4.format(sdf1.parse("2026-02-03")));
		
		
	}

}
