package inheritance02;

public class BollPen extends ShapPencil {
	protected String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public BollPen() {};
	public BollPen(String penName, int Residual, int thickness, String color) {
		super.penName=penName;
		super.Residual=Residual;
		super.thickness=thickness;
		this.color=color;
	};
	public void printB() {
		System.out.println(penName+" : 잔여량 : "+Residual+", 펜굵기 : "+thickness);
	}
	
}
