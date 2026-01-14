package inheritance03;

public class Customer {
	//
	protected String customerID;
	protected String customerName;
	protected String customerGrade; 
	int bonusPoint;
	protected int bonusRatio;
	
	// default 생성자
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio=1;
	};
	public Customer(String customerID, String customerName) {
		
		this.customerName =customerName;
		this.customerID =customerID;
		customerGrade = "SILVER";
		bonusRatio=1;
	};
	
	// 제품에 대해 지불해야 하는 금액을 계산하여 반환함. 할인이 없는 경우 가격을 그대로 반환함. 
	// 가격에 대해 보너스 포인트 비율을 적용하여 보너스 포인트를 적립
	
	public int calcPrice(int price){
		int discount = 0; //기본 할인비율 근데이걸 여기서 만드는건지 아니면 가서 만드는건지
		int resultPrice = price-price*discount/100;
		return resultPrice;
	}
	// 기본 생성자고객 한 명이 새로 생성되면 customerGrade는 SILVER이고, bonusRatio는 1%로 지정함
	public int customer(int price) { 
		int result = price/100*bonusRatio;
		return result;
		// 이거 적립 누적되는 함수도 있어야될거같은데 완성하려면
	}
	
	//고객 정보를 출력함 고객 이름, 등급, 현재 적립된 포인트 정보를 보여 줌
	public void showCustomerInfo() { 
		System.out.println(customerName+customerGrade);
		// 누적적립금액
	}
	
	public void printINFO() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+ customer(0)+"원 입니다.");
	}
	public void printP() {
		System.out.println(customerName+"님의 지불 금액은 "+ calcPrice(10000)+"원이고, 회원등급은 "+customerGrade
				+"이며, 보너스 포인트는 "+ customer(10000)+"원 입니다.");
	}
}
