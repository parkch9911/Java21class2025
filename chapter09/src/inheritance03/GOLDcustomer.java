package inheritance03;

public class GOLDcustomer extends Customer {
	int discount;
	
	public GOLDcustomer() {};
	public GOLDcustomer(String customerID,String customerName) {
		super.customerName = customerName;
		super.customerID = customerID;
		super.bonusRatio = 2; //적립비
		super.customerGrade ="GOLD"; //등급
		this.discount = 10; //할인비
	}
	
	public int calcPrice(int price){
		 //기본 할인비율 근데이걸 여기서 만드는건지 아니면 가서 만드는건지
		int resultPrice = price-price*discount/100;
		return resultPrice;
	}

	@Override
	public void printP() {
		super.printP();
	}	
}
