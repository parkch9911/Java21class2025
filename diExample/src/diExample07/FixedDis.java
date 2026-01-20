package diExample07;

public class FixedDis implements DIsInterface {
	int discount;
	int price;
	
	public FixedDis(int discount, int price) {
		this.discount = discount;
		this.price=price;
	}

	@Override
	public String DisName() {
		return "원가 : "+price+", 할인된 가격 : ";
	}

	@Override
	public int KindOfDis() {
		return price-discount;
	}
	

}
