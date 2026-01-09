package arrayListEx03;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameApp {
	public static void main(String[] args) {
		int people = 0;
		int run = 1;
		boolean game = true;
		String ans ="아버지";
		String newans ="";
		String lose = "";
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Player> player = new ArrayList<Player>();
	//=================================================================	
		System.out.print("참가자 수를 입력하세요 >> ");
		people = scan.nextInt();
		
		while(run <= people) {
			System.out.print(run+"번 참가자 이름 : ");
			String name = scan.next();
			player.add(new Player(name));
			run++;
		}
		System.out.println();
		System.out.println("게임 시작!");
		System.out.println("현재 단어 : 아버지");
		while(game) {
			for(int i = 0; i<player.size(); i++) {
				Player p = player.get(i);
				System.out.print(p.name+ ">> ");
				newans = scan.next();
				if(ans.charAt(ans.length()-1) == newans.charAt(0)) {
					ans=newans;
				}else {
					lose = p.name;
					System.out.println("게임 종료!");
					System.out.println("진 사람 : "+lose);
					game = false;
					break;
				}
			}
		}
		scan.close();
	}
}
