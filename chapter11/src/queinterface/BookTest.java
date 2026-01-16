package queinterface;

public class BookTest {

	public static void main(String[] args) {
		//Queue 데이터 타입으로 업캐스팅 
		Queue qshelf = new BookShelf();
		// 문자삽입
		//					 in  ──┐
		//		<=<=<=<=<=<=<=<=<  │
		//   ┌──  A | B | C | D  <─┘
		//	 │	<=<=<=<=<=<=<=<=<
		// 	 └>  out
		System.out.println(qshelf.getSize()+"처음 배열 크기");
		qshelf.inQueue("A");
		System.out.println(qshelf.getSize()+"=A삽입후 배열 크기");
		qshelf.inQueue("B");
		System.out.println(qshelf.getSize()+"=B삽입후 배열 크기");
		qshelf.inQueue("C");
		System.out.println(qshelf.getSize()+"=C삽입후 배열 크기");
		qshelf.inQueue("D");
		System.out.println(qshelf.getSize()+"=D삽입후 배열 크기");
		System.out.println(qshelf.deQueue());  	//A 삭제해서 A
			System.out.println(qshelf.getSize());  	
		System.out.println(qshelf.deQueue());  	//B 삭제해서 B
			System.out.println(qshelf.getSize());
		System.out.println(qshelf.deQueue());	//C 삭제해서 C
			System.out.println(qshelf.getSize());
		System.out.println(qshelf.deQueue());	//D 삭제해서 D
			System.out.println(qshelf.getSize());
		
		
		
		
	}

}
