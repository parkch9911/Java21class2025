package diExample03;

public class MainPay {

	public static void main(String[] args) {
		Payments pay = new Payments();
		pay.payfor(10000, new KakaoMod());
		pay.payfor(10000, new NaverMod());
		pay.payfor(10000, new CreditMod());
	}

}
