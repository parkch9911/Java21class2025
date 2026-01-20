package diExample05;

public class CirMod implements ShapeInterface{
	
	//멤버변수
	private double r;
	
	//생성자
	public CirMod(double r) {
		this.r = r;
	}
	
	@Override
	public double calcArea() {
		return 3.14*Math.pow(r, 2);
	}

	@Override
	public String ShapeName() {
		return "원";
	}

}
