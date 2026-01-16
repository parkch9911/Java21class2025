package interfaceExample03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Shape sh = new Circle(20);
		sh.redraw();
		sh.draw();
		System.out.println("면적은 "+sh.getArea());
	}
}
