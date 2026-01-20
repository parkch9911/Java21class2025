package diExample05;

public class Maincal{

	public static void main(String[] args) {
		CalShape cs = new CalShape();
		
		cs.getArea(new CirMod(2));
		cs.getArea(new TriMod(10, 3));
		cs.getArea(new RecMod(4, 2));
	}



}
