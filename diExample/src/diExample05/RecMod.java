package diExample05;

public class RecMod implements ShapeInterface {
	//멤버변수
	private double garo;
	private double sero;
	
	//생성자
	public RecMod(double garo, double sero) {
		this.garo = garo;
		this.sero = sero;
	}
	
	@Override
	public double calcArea() {
		return garo*sero;
	}

	@Override
	public String ShapeName() {
		return "사각형";
	}

}
