package otShop;

public class Item {
	//멤버변수
	String name; //카테고리 item이름 //상품명
	int price; //item 가격
	String category; //카테고리명 ex)과자 육류 어류 음료수 ~
	
	//디폴트생성자
	public Item() {};
	
	//매개변수 생성자
	public Item(String name, int price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	};
	
	//출력 메서드
	public void printInfo() {
		System.out.println("["+name+"]["+price+"]["+category+"]");
	}
}
