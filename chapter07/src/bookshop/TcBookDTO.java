package bookshop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TcBookDTO {
	// DB의 데이터를 저장하는 공간으로 만들어놓은 클래스
	// 멤버변수 필수
	String Booktitle;
	String Author;
	String Publisher;
	Date Date;
	int Price;
	
	//default 생성자
	public TcBookDTO() {};
	
	//매개변수 생성자
	public TcBookDTO(String Booktitle,String Author,String Publisher, Date Date, int Price) {
		this.Booktitle = Booktitle;
		this.Author = Author;
		this.Publisher = Publisher;
		this.Date = Date;
		this.Price =  Price;
	}
	
	//출력하는 메소드 생성
	public void showBook() {
		//DecimalFormat 을 사용해서 숫자의 형식을 변경하여 출력하면 
		//문자가 됨을 주의하자. //Decimal 말고 NumberInstance로 할수도있다.
		DecimalFormat de = new DecimalFormat("#,##0원");
		//SimpleDateFormat을 사용해서 날짜의 형식을 변경하여 출력
		//SimpleDateFormat으로 이용해 변경한 날짜도 문자이다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");	
		System.out.printf("%s\t%s\t\t%s\t%s\t%s%n", Booktitle,Author,Publisher,sdf.format(Date),de.format(Price));
		
	}
}
