package arrayListEx01;

public class Product {
	String name;
	int price;
	
	public Product() {};
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//상품 출력메서드
	public void printItem() {
		System.out.printf("%s : %d원%n",name, price);
	}
	
}
