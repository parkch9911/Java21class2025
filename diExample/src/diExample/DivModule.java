package diExample;

public class DivModule implements Ical{

	@Override
	public int doOper(int x, int y) {
		int result = (y!=0)? x/y:0; 
		return result;
	}

}
