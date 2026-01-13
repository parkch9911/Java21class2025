package inheritance01;

public class Main {

	public static void main(String[] args) {
		ColorTV myTV1 = new ColorTV(32,1024);
		IPTV myTV2 = new IPTV("192.1.1.2",32,2048);
			myTV1.printTV();
			myTV2.printTV();
		}

}
