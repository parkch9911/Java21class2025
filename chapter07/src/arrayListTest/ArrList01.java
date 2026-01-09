package arrayListTest;

import java.util.ArrayList;

public class ArrList01 {

	public static void main(String[] args) {
		// ArrayList<E> 참조변수 = new ArrayList<>()
		// <E> 부분을 제네릭(Generic)이라 부르며, 
		// <E> 부분에는 반드시 데이터 타입이 클래스로 작성되어야한다.
		// ArrayList<>는 가변길이 클래스 배열이다.
		// 데이터가 삭제되거나, 추가되면 자동으로 배열의 크기(배열의길이)가 작아지거나 커진다.
		// ArrayList<>에서 데이터 추가 메서드는 add(인덱스번호, 값) 또는 add(값)
		// 단, add(값)은 항상 맨 마지막 위치에 추가된다.
		// 단, add(인덱스번호,값)은 인덱스번호 위치에 값이 추가되는데, 이 경우 뒤의 데이터들은 인덱스번호가 +1된다. (뒤로 밀려남)
		// ArrayList<>에서 데이터 삭제 메서드는 remove(인덱스번호)
		// 단, 삭제 시 뒤의 데이터들은 인덱스번호가 -1된다. (앞으로 당겨짐)
		// ArrayList<>에서 데이터를 추출하는 메서드는 get(인덱스번호)
		// ArrayList<>에서 배열의 길이를 추출하는 메서드는 size()이다.
		// ArrayList<>에서 요소가 비어있는지 확인하는 메서드는 isEmpty()이다.
		// 		isEmpty()는 비어있으면 true, 비어있지않으면 false를 반환한다.
		
		
		// ArrayList<String> list = new ArrayList<>();   아래와같음
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		// ArrayList<E>에서 <E>의 부분에 데이터 타입이 클래스이어야하므로
		// 기본데이터 타입인 int를 사용할 수 없다.
		// 그러므로 정수형 클래스 데이터 타입인 Integer 레퍼클래스를 입력한다.
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(20);
		num.add(30);
		
		// 데이터 추가하기
		// list.add(""); 이걸 넣어도 isEmpty()해도 false가 나온다. (비어있지않음)
		list.add("사과");
		list.add("바나나");
		list.add(1, "딸기");
		// list2의 요소를 list로 통째로 추가하고 싶을때
		// addAll() method 사용
		list2.add("시금치");
		list2.add("콩나물");
		
		list.addAll(list2);
		
		//데이터 삭제
		list.remove(1);
		
	//	System.out.println(list.isEmpty()); //이거 true (공백)
		
		
		// 전체 출력
		for(int i =0 ; i<list.size(); i++) {
			 System.out.println(list.get(i));
			 System.out.println("ㅇㅇㅇ");
		}
		//확장 for문으로 전체출력
		// for(자료형 변수이름작명 : 참조변수)
		for(String li : list) System.out.println(li);
		for(Integer nu : num) System.out.println(nu);
		
		
		// =============================================================
		// 내가 만든 클래스를 ArrayList<>의 데이터 타입으로 사용
		ArrayList<Member> meminfo = new ArrayList<Member>();
		
		// main()메서드에 생성할때 입력한 매개변수의 값이 
		// this.name = "홍길동"
		// this.address = "서울"
		// this.age = 20
		meminfo.add(new Member("홍길동","서울",20));
		meminfo.add(new Member("개나리","인천",15));
		meminfo.add(1,new Member("아무개","수원",22));
		for(Member m : meminfo) {
			m.printMember();
		}
		
		

		
	}

}
