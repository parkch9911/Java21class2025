package inheritance01;

public class IPTV extends ColorTV{

	String ip;
	//default 생성자
	public IPTV() {};
	
	public IPTV(String ip, int size, int res) {
		this.ip=ip;
		super.res=res;
		//ColorTV가 ParentTV의 size를 상속받았기에 IPTV에서 ColorTV에 있는 size를 사용할 수 있다.
		super.size=size;
		
	}
	//@어노테이션 , Override => 재정의하다
	@Override
	public void printTV() {
		System.out.print("나의 IPTV는 "+ip+" 주소의 ");
		super.printTV();
	}
	
}
