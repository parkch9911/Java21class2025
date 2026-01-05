package multiExample;

public class CompareToExample {

	public static void main(String[] args) {
		// CompareTo()메서드는 String pool 과 전혀 
		// 상관 없이 문자열의 내용만을 비교한다. (문자열에서만 사용하는 메서드이다)
		// A.compateTo(B) => 결과는 0, 음수, 양수로 출력된다
		// A와 B가 같으면 0이 출력된다.
		// A가 B보다 사전적으로 순서가 앞이면 음수가 출력된다.
		// A가 B보다 사전적으로 순서가 뒤이면 양수가 출력된다.
		
		String str1 = "가";
		String str2 = "나";
		String str3 = "가";
		
		//유니코드로 가 = 44032, 나 = 45208
		int result1 = str1.compareTo(str2);
		System.out.println(result1);
		
		int result2 = str2.compareTo(str1);
		System.out.println(result2);
		
		int result3 = str1.compareTo(str3);
		System.out.println(result3);
		
	}

}
