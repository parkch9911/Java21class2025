package inheritance02;

public class FounctionPen extends BollPen {
	public FounctionPen() {};
	public FounctionPen(String penName, int Residual, int thickness, String color) {
		super.penName=penName;
		super.Residual=Residual;
		super.thickness=thickness;
		super.color=color;
	};
		
		
		
	public void printF() {
	System.out.println(penName+" : 잔여량 : "+Residual+", 펜굵기 : "+thickness+", 색상 : "+color);
	}
	
	
}
