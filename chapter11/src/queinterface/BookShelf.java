package queinterface;


	// Shelf가 Queue를 implements
	// BookShelf가 Shelf 를 extends 받을 예정
	// 실무에서 많이 사용하는 방식이다.
	public class BookShelf extends Shelf implements Queue{

		@Override
		public void inQueue(String title) {
			shelf.add(title);

		}

		@Override
		public String deQueue() {
			// 꺼내기 => 삭제
			//ArrayList는 삭제되고나면 뒤 데이터가 앞으로 당겨짐
			return shelf.remove(0); //제일 첫번째 자료 삭제
		}

		@Override
		public int getSize() {
			return getCount();
		}
		
		
	
}
