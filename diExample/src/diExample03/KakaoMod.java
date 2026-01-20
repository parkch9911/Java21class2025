package diExample03;

public class KakaoMod implements PayInterface{

	@Override
	public void payfor(int money) {
		System.out.println("카카오페이로"+money+"원 결제완료");
	}
	
}
