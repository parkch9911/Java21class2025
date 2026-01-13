package inheritance02;

public class ShapPencil {
		protected String penName;
		protected int Residual;
		protected int thickness;
		
		public ShapPencil() {};
		public ShapPencil(String penName ,int Residual,int thickness) {
			this.penName=penName;
			this.Residual=Residual;
			this.thickness=thickness;
		};
		
		public String getPenName() {
			return penName;
		}

		public void setPenName(String penName) {
			this.penName = penName;
		}

		public int getResidual() {
			return Residual;
		}

		public void setResidual(int residual) {
			Residual = residual;
		}

		public int getThickness() {
			return thickness;
		}

		public void setThickness(int thickness) {
			this.thickness = thickness;
		}

	public void printS() {
		System.out.println(penName+" : 잔여량 : "+Residual+", 펜굵기 : "+thickness);
	}
}
