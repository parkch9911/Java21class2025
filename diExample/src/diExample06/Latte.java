package diExample06;

public class Latte implements BeverageInterface {

	@Override
	public void doOper(String tem) {
		System.out.println(tem+"라떼를 제조합니다 -원두 갈기 - 에스프레소 추출 - 우유 추가");
	}

}
