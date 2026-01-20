package diExample03;

public class CreditMod implements PayInterface{

	@Override
	public void payfor(int money) {
		System.out.println("신용카드로"+money+"원 결제완료");
	}

}
