package interfaceExample01;

public class Television implements Buyable {
	//멤버변수
	String name="텔레비전";
	String model;
	String maker;
	int price;
	
	//생성자
	public Television(String model, String maker, int price) {
		this.model=model;
		this.maker=maker;
		this.price=price;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public String getModel() {
		return model;
	}
	@Override
	public String getMaker() {
		// TODO Auto-generated method stub
		return maker;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
}
