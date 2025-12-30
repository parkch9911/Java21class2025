package ifexample;

import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tall = 0;
		String withParent = "";
		System.out.print("키(cm)를 입력하세요 : ");
		tall = scan.nextInt();
		if(tall >= 120) {
			System.out.println("놀이기구를 이용할 수 있습니다.");
		}else {
			System.out.print("부모님과 함께 오셨나요?(yes:네, no:아니오) : ");
			withParent = scan.next();
			if(withParent.equals("네")) {
				System.out.println("놀이기구 이용 가능합니다.");
			}else {
				System.out.println("놀이기구 이용 불가능합니다.");
			}
		}
		

	}

}
