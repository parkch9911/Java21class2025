package hashMaoEx;

import java.util.*;


public class HashMapEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> customer = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		System.out.println("포인트 관리 시스템입니다.");
		int allPoint =0;
		while(run) {
			System.out.print("\n이름과 포인트 입력 ex)홍길동 10 >>");
			String input = scan.nextLine();
			StringTokenizer token = new StringTokenizer(input);
			if(input.equals("그만")) {
				run =false;
				System.out.println("포인트 관리 종료");
				
				
				
			}else {
				int newPoint = 0;
				String name = token.nextToken();
				Integer point = Integer.parseInt(token.nextToken());
				newPoint = point;
				if(customer.containsKey(name)) { //이미 존재하면
					customer.put(name, point+newPoint);
				}
				else { //처음 추가됐다면
					customer.put(name, point);
				}
			}
			for(String fname : customer.keySet()) {
				System.out.print("("+fname+","+customer.get(fname)+") ");
				
			}
		}
		
		
		
		
		
		
	}

}
