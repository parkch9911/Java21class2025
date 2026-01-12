package BookMax;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		PrivateBook book = new PrivateBook();
		book.addBook(new BookInfo("자바의 정석","남궁성",30000));
		book.addBook(new BookInfo("이펙티브 자바","조슈아 블로크",36000));
		book.addBook(new BookInfo("클린 코드","로버트 마틴",29000));
		System.out.println("=== 전체 책 목록 ===");
		book.bookInfo();
		
		System.out.println("=== 가장 비싼 책 ===");
		book.maxprint();
		
	}


}
