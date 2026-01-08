package classpart10;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassEx10 e10 = new ClassEx10();
		int[] x = new int[10];
		System.out.print("학생점수 = ");e10.test(x);
		System.out.print("\n학생총점 = "+e10.sum(x));
		System.out.print("\n학생전체평균 = "+e10.avg(x));
		System.out.print("\n1등점수 = "+e10.max(x));
		System.out.print("\n꼴등점수 = "+e10.min(x));
		
	}

}
