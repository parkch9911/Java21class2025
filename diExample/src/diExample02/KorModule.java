package diExample02;

public class KorModule  implements InterfaceGreet {

	@Override
	public void sayHi(String name) {
		System.out.println("안녕하세요."+name+"님!");
	}
	
}
