package bookshop;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TcBookMain {
	public static void main(String[] args) throws ParseException {
		// 객체화해야하는 대상 : TcBookList 클래스를 객체화해야한다.
		TcBookList list = new TcBookList();
		// 입력용 날짜형식
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 합계출력용 DecimalFormat 객체 생성한다.
		DecimalFormat de = new DecimalFormat("\u00A4#,##0원");
		// TcBookDTO에 데이터를 객체화하여 삽입한다.
		list.addBook(new TcBookDTO("Java","홍길동","코리아출판사",sdf.parse("2026-01-12"),35000));
		list.addBook(new TcBookDTO("React","김길동","코리아출판사",sdf.parse("2025-02-12"),22000));
		list.addBook(new TcBookDTO("Spring","박길동","코리아출판사",sdf.parse("2020-03-12"),19000));
		list.bookInfo();
		System.out.println("합계 : "+de.format(list.getTotal()));
		
	}
}
