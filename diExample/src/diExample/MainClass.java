package diExample;

public class MainClass {

	public static void main(String[] args) {
		MyCal mc = new MyCal();
		
		mc.cal(10, 20, new AddModule());
		mc.cal(10, 20, new SubModule());
		mc.cal(20, 10, new MulModule());
		mc.cal(20, 10, new DivModule());
	}
}
