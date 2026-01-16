package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest01 {

	public static void main(String[] args) {
		//Map<key,value> : 자바의 collection 프레임워크의 일종
		//Map 의 특징은 반드시 key(키),value(값)의 쌍으로
		//key(키)는 중복을 허용하지 않는다.
		//value(값)은 중복을 허용한다.
		//Map 은 key(키)를 이용하여 value(값)을 저장,검색,삭제할 때 사용하면 유용하다.
		//Map 의 종류 : HashMap, HashTable, TreeMap, Properties... 
		//Map 인터페이스 메소드 : put[키,값] => 키와 값을 입력하는 메소드이다.
		//Map 은 클래스이므로 import 해야한다.
		//Map<K,V> => "<>" 부분을 제네릭 이라고한다.
		//Map<K,V> => K는 반드시 래퍼클래스(String, Integer , Double)..
		// 			=> 또는 개발한 클래스 예)Member, Product, Cart.. 
		//HashMap은 Map 의 하위 클래스 이므로 데이터 타입을 부모인 Map 으로 업캐스팅 할 수 있다.
		Map<String, String> list = new HashMap<String, String>();
		//생성한 객체의 list 를 부르는 말 = "참조변수" 라 한다.
		
		//HashMap<String, String> list02 = new HashMap<String, String>();
		
		//Map 은 인터페이스이므로 객체를 생성할 수 없다.
		//Map<String, String> list03 = new Map<String, String>();
		
		
		//list.put(key[i], value[i]) 메소드 작성 방법.
		String[] key = {"a","b","k","d","e"};
		String[] value = {"apple","banana","candy","dog","era"};
		for(int i =0; i<key.length; i++) {
			//list 참조변수의 put()메서드를 사용할 수 있는 이유
			// => HashMap 객체를 생성하고, 데이터 타입은 Map 이기때문에
			// => Map 인터페이스의 메소드에 모두 접근할 수 있다.
			list.put(key[i], value[i]);
		}
		// 출력 : {a=apple, b=banana, c=candy, d=dog, e=era}
		// HashMap은 순서를 보장하지 않는다.
		// 고로, 입력도 저장도 순서가 없다.
		// HashMap은 HashTable에 저장된다.
		// HashMap은 비선형 자료구조이다.
		System.out.println(list);
		
		// keySet(), values()메소드 사용법
		// ketSet()은 key값들을 출력, values()는 value 값 출력
		System.out.println("============================");
		System.out.println("============================");
		System.out.println(list.keySet());
		System.out.println(list.values());
		
		//get(현재 출력하고싶은 key 값을 입력)메소드 사용법
		System.out.println("============================");
		//list.get("c") => key 값이 "k"에 해당하는 value 값이 출력된다. 
		System.out.println(list.get("k"));
		
		//다 순서대로 나오는데 선생님이 선형구조인 배열을 hash 에 담아서(?)그런건지. 아니면 순서는없는데 자바자체에서 콘솔출력을 그렇게 보여주는건지
		//근데 그러면 list.get(key[1])); 이 바나나가 나오는데 이건 어떻게설명하지 1번 인덱스에 b : banana 가 있다는건데
		//해쉬도 인덱스가 있긴하다고하셨는데...  순서가없다는게뭐지
		
		//replace() : 키값과 바꿀값 제공하면 해당 키의 값이 변경된다.
		list.replace("k", "code");
		System.out.println(list);
		
		//이미 존재하는, 같은 키에 해당하는 value(값)을 새로운 value(값)으로 덮어쓴다. 
		list.put("k", "candy");
		System.out.println(list.get("k"));
		
		//f , float 추가 //배열이라면 맨 뒤로 들어가야하는데 
		// {a=apple, b=banana, d=dog, e=era, f=float, k=candy} 이렇게 들어감
		list.put("f", "float");
		System.out.println(list);
		
		//containsKey(), containsValue() : key 나 value 의 존재유무 결과는 boolean
		boolean isCheck;
		isCheck = list.containsKey("x");
		System.out.println(isCheck); //false
		isCheck = list.containsValue("banana");
		System.out.println(isCheck); //true
		
		//remove(), clear() => remove(제공한 key) : 제공한 key값의 항목만 삭제
		//				clear()는 전체삭제
		list.remove("k");
		System.out.println(list);
		list.clear(); //전체삭제
		System.out.println(list);
		
		System.out.println("--------------------");
		for(int i =0; i<key.length; i++) {
			list.put(key[i], value[i]);
		}
		System.out.println("----확장 포문 이용해서 출력------");
		// a : apple
		// for(데이터타입 작명 : 참조변수) {}
		for(String mList : list.keySet()) {
			System.out.println(mList+" : "+list.get(mList));
		}
		
		System.out.println("-----Iterator()메소드------");
		//collection 또는 Map에서 사용하는 객체 순회 메소드
		//Set<데이터타입>
		Set<String> keyset = list.keySet();
		Iterator<String> ir = keyset.iterator();
		System.out.println(keyset);
		// ir = {"a","b","c","d"}
		while(ir.hasNext()) { //다음 키가 존재하면 true, 없으면 false
			String k = ir.next();
			String v = list.get(k);
			System.out.println(k+" : "+v);
		}
	}

}
