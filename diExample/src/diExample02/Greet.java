package diExample02;

public class Greet{
	public void greet(String name, InterfaceGreet ifg) {
		ifg.sayHi(name);
	}
}
