package diExample02;

public class JapModule  implements InterfaceGreet {

	@Override
	public void sayHi(String name) {
		System.out.println("こんにちは,"+name+"さん!");
	}

}
