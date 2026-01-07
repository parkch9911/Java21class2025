package classpart01;

public class Ex01 {
	// 멤버변수는 배열도 작성할 수 있다.
	// class 는 데이터, 기능만 작성
	// main() method 는 출력을 담당
	
	int[] arr = {87,100,11,72,92};
	int res = 0;
	
	//기본생성자
	public Ex01() {}
	
	//이게 메서드인가...
	public void sum() {
		for(int i = 0; i<arr.length; i++) {
			res += arr[i];
		}
		System.out.println("총계 : "+res);
	}
	//메서드 따로 안뺄거면 메인에서 ans.arr.length 처럼 접근도할수잇음.
	
	
	//메인 출력
	public static void main(String[] args) {
		Ex01 ans = new Ex01();
		ans.sum();	// 정답 1) 362
		
	}
	
	
	
	
}
