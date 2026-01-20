package diExample02;

public class EngModule  implements InterfaceGreet {

	@Override
	public void sayHi(String name) {
		System.out.println("Hello,"+name+"!");
	}

}
