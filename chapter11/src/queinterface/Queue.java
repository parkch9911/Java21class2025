package queinterface;

public interface Queue {
	
	// Queue => 자료구조로 FIFO(first in first out)
	// 처음 입력한 데이터가 처음으로 출력되는 자료구조
	
	void inQueue(String title); //맨 뒤로 넣기
	String deQueue(); //꺼내기
	
	int getSize();
}
