package classpart11;

public class ClassEx11 {
	String name = "";
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore = { 92, 38, 87, 100, 11};
	
	public ClassEx11() {};
	
	//1등 성적확인 
	public int choice2() {
		int maxScore = 0;
		int max = -1;
		for(int i = 0; i<arHakbun.length; i++) {
			if(arScore[i] > maxScore) {
				maxScore = arScore[i];
				max = i;
				}
		}
		return max;
	}
	//꼴등 성적확인
	public int choice3() {
		int minScore = arScore[0];
		int min = -1;
		for(int i = 0; i<arHakbun.length; i++) {
			if(arScore[i] < minScore) {
				minScore = arScore[i];
				min = i;
				}
		}
		return min;
	}
	
	//학번으로 성적확인
	public int choice4(int hak) {
		int num = 0;
		for(int i=0; i<arHakbun.length; i++) {
			if(arHakbun[i] == hak) {
				num = arScore[i];
			}
		}
		return num;
		//void로 체크키 만들어서 i값 담으면 리턴없어도됨
	}
	
}
