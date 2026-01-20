package diExample06;

public class MainBeverage {

	public static void main(String[] args) {
		MakeBeverage mb = new MakeBeverage();
		mb.makeit("핫",new Americano());
		mb.makeit("아이스",new GreenTea());
		mb.makeit("아이스",new Latte());
		mb.makeit("핫",new Makiatto());

	}

}
