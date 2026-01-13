package inheritance02;

public class Main {

	public static void main(String[] args) {
		ShapPencil shaP = new ShapPencil("ShapPencil",10,1);
		BollPen bolP = new BollPen("Ball",25,2,"black");
		FounctionPen funP = new FounctionPen("FuntionPen",15,2,"blue");
		shaP.printS();
		bolP.printB();
		funP.printF();

	}

}
