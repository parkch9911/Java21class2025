package staticEx;

public class MainClass {

	public static void main(String[] args) {
		StaticEx01 st = new StaticEx01("박찬호");
		st.sMoney(100);
		st.getBankInfo();
		System.out.println("=============");
		
		StaticEx01 st2 = new StaticEx01("이승엽");
		st2.sMoney(200);
		st2.getBankInfo();
		st2.out(100);
		
		
	}

}
