package classpart05;

import classpart07.ClassEx07;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassEx05 e5 = new ClassEx05();
		e5.print();
		e5.random();
		e5.check();
		e5.score();
	}

}
// 확장 for 문 쓰는 방식
// for(자료형 변수 : 배열){실행문};
// 장점: 1. index를 사용하지 않는다.
// 		2. 코드가 짧다.
//		3. 요소를 하나씩 처리한다.

// 단점:	1. index값을 가져올 수 없어 값을 비교할 수 없다.
//		2. 출력할 부분이 존재할때만 쓰자.

// answer의 값의 배열을 하나씩 꺼내 n에 담아 배열이 끝날때 까지 출력
// for(int n : answer)
//	  syso(n + " ");


