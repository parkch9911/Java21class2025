package otShop;

public class Cart {
	//userId
	String userId; //구매한 유저 아이디
	String itemName; //구매한 상품이름
	int price; //구매한 상품가격
	int quantity; //구매한 상품수량
	
	//디폴트 생성자
	public Cart() {};
	
	//매개변수 생성자
	public Cart(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
	}
	
	//cart출력 메서드
	public void printCart() {
		System.out.println("["+userId+"]항목 : "+itemName+" ,금액 : "+price+", 수량 : "+quantity+"개");
	}
	
}
