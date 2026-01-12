package bookshop;

import java.util.ArrayList;

public class TcBookList {
	// BookDTO 를 ArrayList<> 에 넣어야 하는 이유 => 가변길이 이기때문에
	// => BookDTO[] book = new  BookDTO[100];
	// ArrayList<BookDTO> booklist = new ArrayList<>();
	// => booklist[0] = {Booktitle: ~ , Author: ~ , Publisher: ~ , Date: ~ , Price: ~ }
	
	//멤버변수
	ArrayList<TcBookDTO> booklist;
	
	//디폴트 생성자
	public TcBookList() {
		booklist = new ArrayList<TcBookDTO>();
	}
	
	//책 추가 메서드
	public void addBook(TcBookDTO bdto) {
		//내가 bdto.Booktitle 접근할 수 있는 상태가 됨.
		booklist.add(bdto);
	}
	
	//총계 구하는 메서드
	public int getTotal() {
		int total = 0;
		for(TcBookDTO b : booklist ) {
			total += b.Price;
		}
		return total;	
	}
	
	//출력 메서드 => main 에 빼도 무방함
	public void bookInfo() {
		System.out.println("===============================================================");
		System.out.println("도서명\t저자\t\t출판사\t\t출판일\t\t가격");
		System.out.println("===============================================================");
		for(TcBookDTO b : booklist) {
			b.showBook();
		}
		System.out.println("===============================================================");
	}
	
}
