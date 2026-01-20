package diExample03;

public class NaverMod implements PayInterface{

	@Override
	public void payfor(int money) {
		System.out.println("네이버페이로"+money+"원 결제완료");
	}

}
