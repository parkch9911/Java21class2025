package diExample;

public class AddModule implements Ical{
	//더하기 함수를 모듈화
	// 이유 : 느슨한 결합이 기본원칙
	//느슨한 결합이어야 유지보수, 협업이 편해진다.
	
	@Override
	public int doOper(int x, int y) {
		int result = x+y;
		return result;
	}

}
