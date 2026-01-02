package example;

import java.util.Arrays;

public class Arrtest01 {

	public static void main(String[] args) {
		// 배열 선언 방법
		// 1. int[] arr = new int[3];
		// 2. int arr[] = new int[3];
		// 선언한 배열에 초기값 지정하는 방식
		// 1. int[] arr01 = new int[]{1,2,3};
		// 2. int[] arr01 = new int[3]{1,2,3}; =>오류출력
		//							이유: 배열에 초기값 지정 시 크기는 적지 않는다.
		// 3. int[] arr01 = {1,2,3};
		// 배열 선언 시 int[] arr = new int[]=> 오류, 반드시 크기 입력
		// 배열의 특징
		// 1. 배열은 고정길이이다.(fixed length)
		// 2. 배열은 자동으로 길이를 늘리고, 줄일 수 없다.
		// 3. 배열을 생성과 동시에 메모리를 한 번에 할당한다.
		// 4. 배열은 중간에 값을 비울 수 없다.
		// 5. 배열은 단순한 자료구조이므로 가변기능은 컬렉션이 담당한다.
		//		예) ArryList, Linkedlist, Vector, Stack...
		
		
		int[] arr = new int[3];
		for(int i=0; i < arr.length; i++) {
			// 정수형 배열의 초기값을 지정하지 않으면 0 출력
			System.out.println(arr[i]);
		}
		double[] doub = new double[3];
		for(int j=0; j < doub.length; j++) {
			// 실수형 배열의 초기값을 지정하지 않으면 0.0 출력
			System.out.println(doub[j]);
		}
		String[] str = new String[3];
		String[] str2 = null;
		String[] str3 = null;
		
		//배열의 길이 : 3
		System.out.println(str.length);
		
		//배열의 요소 : [null, null, null]
		System.out.println(Arrays.toString(str));
		
		//배열의 래퍼런스 : [Ljava.lang.String;@2ff4acd0
		System.out.println(str);
		
		//객체배열의 요소를 복사 : Arrays.copyOf(복사할 대상 ,복사할 대상의 길이)
		str2 = Arrays.copyOf(str, str.length);
		System.out.println(str2);
		
		str3 = str; //복사가 아니라 str와 같은 배열을 대입한 경우이다.
		System.out.println(str3);
		
		for(int k=0; k < str.length; k++) {
			// 객체형 배열의 초기값을 지정하지 않으면 null 출력
			// str 이 null 이면 "난 배열값"으로 출력하고,
			// null 이 아니면 자기 값 출력
			// String 객체는 비교할때 equals()를 사용해야 하지만
			// 문제는 null 이 객체가 아니므로 메서드 사용 못함
			if(str[k]==null) {
				System.out.println("난 배열값");
			}else {
				System.out.println(str[k]);
			}
		}
		
		
		
		
	}

}
