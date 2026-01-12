package BookMax;

import java.util.ArrayList;

public class PrivateBook {
	//멤버변수
	ArrayList<BookInfo> bookp;
	public PrivateBook() {
		bookp = new ArrayList<BookInfo>();
	}
	
	// 책 추가 메서드
		public void addBook(BookInfo bif) {
			bookp.add(bif);
		}
		
	//출력메서드
		public void bookInfo() {
			for(BookInfo b : bookp) {
				b.showBook();
			}
		}
		
		
	// 최대값 메서드
		public void maxprint() {
			int max = 0;
			int cnt = 0;
			for(int i = 0; i<bookp.size(); i++) {
				if(bookp.get(i).getPrice() > max){
					max = bookp.get(i).getPrice();
					cnt = i;
				}
			}
			System.out.println(bookp.get(cnt).getBooktitle()+bookp.get(cnt).getAuthor()+ bookp.get(cnt).getPrice());
		}

		
		
}
