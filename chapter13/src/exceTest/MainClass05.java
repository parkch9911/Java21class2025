package exceTest;

public class MainClass05 {

	public static void main(String[] args){
		
		MainClass05 main05 = new MainClass05();
		try {
			//main05.firstMethod();
			main05.thirdMethod();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("예외처리 연습");
		
	}

	//메소드 생성
	//throws Exception 은 예외 던지기 라고 한다.
	// 자기자신에서 예외처리를 하는것이 아니라
	// 자기자신을 호출하는 메소드로 예외처리를 넘기는 것이다.
	// 만약 main()메소드에 throws Exception 으로 예외 던지기를 진행하면
	// JVM(자바가상머신)이 알아서 예외처리를 진행한다.
	
	//public void firstMethod() throws Exception{secondMethod();};
	//public void secondMethod() throws Exception{thirdMethod();};
	public void thirdMethod() throws Exception{
		System.out.println("(10 / 0) : "+(10/0));
	};
}
