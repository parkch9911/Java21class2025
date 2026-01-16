package hashMaoEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx02 {

	public static void main(String[] args) {
		Map<String,Location> nations = new HashMap<String,Location>();
		int run = 0;
		boolean search = true;
		Scanner scan = new Scanner(System.in);
		String addIn = "";
		
		while(run <= 3) {
			
			System.out.println("도시, 경도, 위도를입력하시오. ex)서울,37,126");
			System.out.print(">> ");
			String loca = scan.nextLine();
			StringTokenizer ST = new StringTokenizer(loca,",");
			for(int i =0; i<1; i++) {	//이제 포문돌려서 위에꺼는 키값에 넣고 아래꺼는 parse 해서 밸류값에 넣고 put
				String city = ST.nextToken().trim();
				//나라이름은 문자이지만, 경·위도는 숫자이기에 파싱
				Integer latitude = Integer.parseInt(ST.nextToken().trim());
				Integer longitude = Integer.parseInt(ST.nextToken().trim());
				//객체화 인스턴스
				Location lo = new Location(city,latitude,longitude);
				nations.put(city, lo);
			}
			run++;
		}
		//nations의 모든 정보 출력
		System.out.println("==========================");
		for(String key : nations.keySet()) {
			//Location 이라는 객체를 데이터 타입으로 hashLocation 참조변수의
			// 도시별 도시이름, 경도 , 위도 값을 loca 참조변수에 저장.
			Location loca = nations.get(key);
			// 객체 데이터 타입을 지정한 경우, 출력할때 내부적으로 자동 toString()메소드를 호출한다.
			System.out.println(loca.toString());
		}
		System.out.println("==========================");
		while(search) {
			System.out.print("도시이름 >>");
			String city = scan.next();
			if(city.equals("그만")) {
				search = false;
			}else if(nations.containsKey(city)) {
				System.out.println(nations.get(city));
			}else {
				System.out.println(city+"가 데이터에 없습니다.");
			}
		}
		scan.close();
	}

}