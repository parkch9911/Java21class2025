package interfaceExample01;

public class Refrigerator implements Buyable {

	String name="냉장고";
	String model;
	String denggub;
	int price;
	//생성자
	public Refrigerator(String denggub,String model , int price) {
		this.model=model;
		this.denggub=denggub;
		this.price=price;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getModel() {
		return model;
	}
	@Override
	public String getMaker() {
		return denggub;
	}

}
