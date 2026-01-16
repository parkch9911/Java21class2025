package interfaceExample01;

public class Main {

	public static void main(String[] args) {
		Buyable tv = new Television("TV-samsung","MV-2020",509000);
		Buyable ref = new Refrigerator("1등급","MV-2020",2000000);
		
		Buyable[] by = {tv,ref};
		for(int i =0; i<by.length; i++) {
			System.out.println("===="+by[i].getName()+"정보====");
			if(i == 0) {
				System.out.println("메이커 : "+by[i].getMaker());
			}else {
				System.out.println("효율성 등급 : "+by[i].getMaker());
			}
			System.out.println("모델명 : "+by[i].getModel());
			System.out.println("금액 : "+by[i].getPrice());
			System.out.println("----------------");
		}
		
	}

}
