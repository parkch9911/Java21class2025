package diExample02;

public class GreetMain {

	public static void main(String[] args) {
		Greet gr = new Greet();
		gr.greet(" [그린] ", new KorModule());
		gr.greet(" [그린] ", new EngModule());
		gr.greet(" [그린] ", new JapModule());
	}

}
