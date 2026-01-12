package bookshop;

import java.util.ArrayList;
import java.util.Date;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class BookList {
	String Booktitle;
	String Author;
	String Publisher;
	Date now = new Date();
		ArrayList<BookDTO> bookdto = new ArrayList<BookDTO>();
		
		public BookList(String Booktitle,String Author,String Publisher) {
			this.Booktitle = Booktitle;
			this.Author = Author;
			this.Publisher = Publisher;
		}
		
}
