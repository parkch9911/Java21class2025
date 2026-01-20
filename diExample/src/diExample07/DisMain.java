package diExample07;

public class DisMain {

	public static void main(String[] args) {
		DiscountCal dm = new DiscountCal();
		dm.doOper(new FixedDis(10, 1000));
		dm.doOper(new PercentDis(20, 634000));
		dm.doOper(new NoDis(1000));
	}

}
