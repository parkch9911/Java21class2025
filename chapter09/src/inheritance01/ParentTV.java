package inheritance01;

public class ParentTV {
	
	protected int size; //tv 크기
	
	//default 생성자
	public ParentTV() {}
	
	//매개변수 생성자
	public ParentTV(int size) {
		this.size = size;
	}

	//getter setter
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
