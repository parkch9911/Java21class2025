package multiExample;

import java.util.*;

public class StringEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] items = new String[100][2];
		
		//null값을 해결하기 위해 공백으로 초기화
		for(int i = 0; i<items.length; i++) {
			for(int j = 0; j<items[i].length; j++) {
				items[i][j]=" ";
			}
		}
		
		
		boolean run = true;
		int itemCount = 0; // 아이템 개수
		
		while(run) {
			System.out.println("[관리자모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아이템 관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[0]종료");
			System.out.print("관리자 모드를 선택 : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.print("추가할 카테고리 입력 : ");
				String cateName = scan.next();
				items[itemCount][0] = cateName;
				itemCount++;
				
			}else if(sel == 2) {
				// [0] 과일류 출력 코드
				for(int i =0; i<itemCount; i++) {
					System.out.printf("[%d] %s%n",i,items[i][0]);
				}
				System.out.print("카테고리를 선택하세요 : ");
				int choice = scan.nextInt();
				System.out.print("추가할 상품을 입력하세요 : ");
				String addName = scan.next();
				items[choice][1] += addName;
				items[choice][1] += "/";
				
			}else if(sel == 3) {
				for(int i =0; i<itemCount; i++) {
					System.out.printf("%s : %s%n",items[i][0],items[i][1]);
				}
				
			}else if(sel == 0) {
				System.out.println("시스템을 종료합니다.");
				run = false;
			}
			
			
			
			
		}
		
		scan.close();
	}

}
