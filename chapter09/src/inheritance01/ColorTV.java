package inheritance01;

public class ColorTV extends ParentTV{
	//color해상도 만 가지고 있으면 부모의 size를 받아올수있음.
	protected int res;
	
	public ColorTV() {};
	
	public ColorTV(int size, int res) {
		this.res = res;
		super.size = size;
	}
	
	public void printTV() {
		//size라는 변수는 부모클래스인 TV의 멤버변수로 상속받아 접근이 가능하다.
		System.out.println(size+"인치 "+res+"컬러" );
	}
}
