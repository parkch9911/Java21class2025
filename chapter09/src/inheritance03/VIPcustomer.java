package inheritance03;

public class VIPcustomer extends Customer {
	int discount;	//VIP되면 할인율이랑 상담원 추가
	int personalCall;
	
	public VIPcustomer() {};
	public VIPcustomer(String customerID, String customerName) {
		//super(customerID,customerName);
		super.customerName =customerName;
		super.customerID =customerID;
		super.bonusRatio = 5; //적립비
		super.customerGrade ="VIP"; //등급
		this.discount = 10; //할인비
		this.personalCall = 1010; //상담번호
		super.customer(10000);
	};
	
	public int calcPrice(int price){
		 //기본 할인비율 근데이걸 여기서 만드는건지 아니면 가서 만드는건지
		int resultPrice = price-price*discount/100;
		return resultPrice;
	}

	@Override
	public void printP() {
		super.printP();
		System.out.println("전문 상담 번호는 "+personalCall+"번 입니다.");
	}	
	
}
