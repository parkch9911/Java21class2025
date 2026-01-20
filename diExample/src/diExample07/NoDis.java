package diExample07;

public class NoDis implements DIsInterface {
	int price;
	
	public NoDis(int price) {
		this.price=price;
	}

	@Override
	public String DisName() {
		return "원가 : "+price+", 할인 미적용";
	}

	@Override
	public int KindOfDis() {
		return 0;
	}
}
