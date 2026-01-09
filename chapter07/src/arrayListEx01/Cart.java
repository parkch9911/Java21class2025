package arrayListEx01;

import java.util.*;

public class Cart {
	
	//현재 작성한 Product 클래스는 데이터 타입이다.
	ArrayList<Product> list = new ArrayList<Product>();
	
	//상품추가함수
	// 매개변수로 Product p 의미 =>현재 Product클래스의 멤버변수, 생성자, 메소드에 p로 접근할수있다.
	public void addCart(Product p) {
		list.add(p);
	}
	
	//상품삭제함수
	public void delCart(int sel) {
		list.remove(sel-1);
	}
	
	//상품출력함수
	public void showCart() {
		for(Product p : list) {
			p.printItem();
		}
	}
	
	//총계구하는함수
	public int total() {
		int sum =0;
		for(Product p : list) {
			sum += p.price;
		}
		return sum;
	}
	
}
