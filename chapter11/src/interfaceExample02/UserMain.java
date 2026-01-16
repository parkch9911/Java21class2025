package interfaceExample02;

public class UserMain {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal mon = new Monkey();
		Animal chi = new Chicken();
		String[] eat = {"생선","과일","사료"};
		String[] move = {"네발로","네발 또는 두발로","두발로"};
		String[] zzz = {"엎드려서","누워서","서서"};
		Animal[] aniArr = {cat,mon,chi};
		
		for(int i = 0; i<aniArr.length; i++) {
			aniArr[i].eat(eat[i]);
			aniArr[i].work(move[i]);
			aniArr[i].sleep(zzz[i]);
		}
	}

}
