package diExample06;

public class Americano implements BeverageInterface{

	@Override
	public void doOper(String tem) {
		System.out.println(tem+"아메리카노를 제조합니다 -원두 갈기 - 에스프레소 추출 - 물 추가");
	}

}
