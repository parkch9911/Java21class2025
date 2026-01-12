package BookMax;

public class BookInfo {
	//얘가 DB 데이터만 담고있는
	//멤버변수
	private String Booktitle;
	private String Author;
	private int price;
	
	//기본 생성자
	public BookInfo() {}

	//매개변수 생성자
	public BookInfo(String Booktitle, String Author, int price) {
		this.Booktitle = Booktitle;
		this.Author = Author;
		this.price = price;
	}
	
	public String getBooktitle() {
		return Booktitle;
	}

	public void setBooktitle(String Booktitle) {
		this.Booktitle = Booktitle;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String Author) {
		this.Author = Author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	};
	
	public void showBook() {
		System.out.printf("%s %s %s%n",Booktitle,Author,price);
	}

}
