package diExample06;

public class GreenTea implements BeverageInterface{

	@Override
	public void doOper(String tem) {
		System.out.println(tem+"그린티를 제조합니다 -물 추가 - 티백 추가");
	}

}
