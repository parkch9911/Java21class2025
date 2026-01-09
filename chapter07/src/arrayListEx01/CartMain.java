package arrayListEx01;

import java.util.*;

public class CartMain {

	public static void main(String[] args) {
		// UI부분
		Scanner scan = new Scanner(System.in);
		Cart cart = new Cart();
		
		// 기본 장바구니 상품 목록 추가
		// ArrayList<Product> list = new ArrayList<Product>();
		// Cart의 ArrayList<>에 아래 목록이 담김.
		
		cart.addCart(new Product("사과",1000));
		cart.addCart(new Product("바나나",2000));
		cart.addCart(new Product("망고",5000));
		cart.addCart(new Product("포도",8000));
		cart.addCart(new Product("수박",10000));
		
		System.out.println("[장바구니목록]");
		cart.showCart();
		System.out.println("총 금액 : "+cart.total()+"원");
		System.out.println("=========================");
		System.out.print("삭제 할 상품 입력 : ");
		int sel = scan.nextInt();
		cart.delCart(sel);
		System.out.println("삭제 한 후 장바구니목록");
		cart.showCart();
		System.out.println("=========================");
		System.out.print("추가 할 상품 입력 : ");
		String name = scan.next();
		cart.addCart(new Product(name,3000));
		System.out.println("=========================");
		System.out.println("추가 한 후 장바구니목록");
		cart.showCart();
		}

}
