package scheduler;

public interface Scheduler {
	void getNextCall(); //다음 고객의 call 가져오는 메소드
	void sendCallAgent(); // 상담원에게 call 던지는 메소드
	void getLunch(); // 점심시간 물어보는 메소드
	
}
