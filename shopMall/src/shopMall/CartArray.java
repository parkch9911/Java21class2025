package shopMall;

import java.util.ArrayList;

public class CartArray  {
	
	ArrayList<Cart> cartList = new ArrayList<Cart>();
	
	//장바구니 추가하는 메서드
		public void AddCart(int log,String name,int price,int quantity) {
			for(int i = 0; i<cartList.size(); i++) {
				if(cartList.get(i).quantity >= 1) {
					cartList.get(i).quantity++; //이미있으면 1증가
				}
				
			}
			
		}
	
}
