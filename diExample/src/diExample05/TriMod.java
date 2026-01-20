package diExample05;

public class TriMod implements ShapeInterface {
	
	//멤버변수
	private double garo;
	private double sero;

	//생성자
	public TriMod(double garo, double sero) {
		this.garo = garo;
		this.sero = sero;
	}
	
	@Override
	public double calcArea() {
		return (garo*sero)/2;
	}

	@Override
	public String ShapeName() {
		return "삼각형";
	}


}
