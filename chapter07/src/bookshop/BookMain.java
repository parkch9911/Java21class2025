package bookshop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.text.NumberFormat;

public class BookMain {

	public static void main(String[] args) throws ParseException {
		
		ArrayList<BookList> list = new ArrayList<BookList>(); 
		list.add(new BookList("Java","홍길동","코리아출판사"));
		list.add(new BookList("React","김길동","코리아출판사"));
		list.add(new BookList("Spring","최길동","코리아출판사"));
		list.add(new BookList("HTML","박길동","코리아출판사"));
		list.add(new BookList("MySQL","오길동","코리아출판사"));
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년-MM월-dd일 (E)");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		ArrayList<BookDTO> dto = new ArrayList<BookDTO>(); 
		dto.add(new BookDTO(sdf4.format(sdf1.parse("2026-01-12")), 10000));
		dto.add(new BookDTO(sdf4.format(sdf1.parse("2024-02-12")), 12000));
		dto.add(new BookDTO(sdf4.format(sdf1.parse("2020-03-14")), 13000));
		dto.add(new BookDTO(sdf4.format(sdf1.parse("2026-02-03")), 14000));
		dto.add(new BookDTO(sdf4.format(sdf1.parse("2022-01-13")), 12000));
		
		// TODO Auto-generated method stub
		System.out.println("==============================================================");
		System.out.println("도서명    저자     출판사           출판일                   가격 ");
		System.out.println("==============================================================");
		for(int i = 0; i<list.size(); i++) {
			BookList b = list.get(i);
			BookDTO d = dto.get(i);
			System.out.println(b.Booktitle +"\t"+ b.Author +"\t"+ b.Publisher +"\t"+d.now+"\t"+d.price+"원");
		}
		System.out.println("==============================================================");
		System.out.println("합계 : ");
		for(int i = 0; i<list.size(); i++) {
			
		}
	}

}
