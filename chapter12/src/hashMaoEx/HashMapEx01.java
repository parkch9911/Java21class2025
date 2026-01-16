package hashMaoEx;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx01 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		String addIn = "";
		String searchIn = "";
		boolean run = true;
		boolean search = true;
		Map<String, Integer> nations = new HashMap<String, Integer>(); //여기에 넣어야 함 put
		//Integer 데이터 타입으로 파싱한다.(형변환);
		//반드시 파싱은 클래스이어야한다. 고로, 래퍼클래스로 진행한다.
		
		System.out.println("나라이름과 인구를 입력하세요. (예)korea 5000");
		while(run) {
			System.out.print("나라이름,인구 >>");
			addIn = scan.nextLine(); //스캔받고
			if(addIn.equals("그만")) { 	//그만이면 while 종료---
				System.out.println("나라 추가 끝");
				run = false;
			}else {				//아니면 나라추가
				StringTokenizer ST = new StringTokenizer(addIn); //scan 값을 공백 기준으로 나눠
				for(int i =0; i<1; i++) {	//이제 포문돌려서 위에꺼는 키값에 넣고 아래꺼는 parse 해서 밸류값에 넣고 put
					String thisKey = ST.nextToken();
					Integer thisVal = Integer.parseInt(ST.nextToken());
					nations.put(thisKey, thisVal); //잘 들어감
				}
			}
		}
		while(search) {
			System.out.print("인구검색>>");
			searchIn = scan.next();
			if(searchIn.equals("그만")) {
				search = false;
				System.out.println("종료");
			}else {
				System.out.println(searchIn+"의 인구수 : "+nations.get(searchIn));
			}
		}
		scan.close();
	}
}