package hashMaoEx;

import java.util.*;


public class TcHashMapEx04 {
	public static void main(String[] args) {
		Map<String, Integer> customer = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		System.out.println("포인트 관리 프로그램");
		while(run) {
			System.out.print("\n이름과포인트입력>>");
			String KV = scan.nextLine();
			if(KV.equals("그만")) {
				run =false;
				System.out.println("포인트 관리 종료");
			}
			StringTokenizer token = new StringTokenizer(KV);
			String name = token.nextToken().trim();
			Integer point = Integer.parseInt(token.nextToken().trim());
			// 고객명이 존재하는지 체크
			if(customer.containsKey(name)) {
				//같은 고객명이 있으면 포인트 누적
				point += customer.get(name);
			}
			customer.put(name, point);
			
			for(String fname : customer.keySet()) {
				System.out.print("("+fname+","+customer.get(fname)+") ");
			}
		}
		scan.close();
	}
}
