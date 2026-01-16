package shopMall;

public class Cart extends User{
	CartArray cartarray = new CartArray();
	String name; // 카테고리의 item 이름
	int price; // item 가격
	String category; // 카테고리 : 육류, 과자 , 어류 기타 등등
	int cateNum;
	int quantity = 0;
	public Cart() {};
	//생성자
	public Cart(int log,String name,int price,int quantity) {
		super.log =log;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//출력 메서드   
	public void printCart() {
		for(int i = 0; i<cartarray.cartList.size(); i++) {
			if(cartarray.cartList.get(i).quantity >= 1) {
				System.out.println("["+super.id[super.log]+"]항목 : "+name+", 금액 : "+price+" ,수량 : "+quantity);
			}
		}
		
	}
}
