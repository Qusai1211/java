package abstraction;

public class Rectangle  extends Shape  {
	private double wideth;
	 private double lingth;
	
	
	public double getWideth() {
		return wideth;
	}
	public void setWideth(double wideth) {
		this.wideth = wideth;
	}
	public double getLingth() {
		return lingth;
	}
	public void setLingth(double lingth) {
		this.lingth = lingth;
	}
	@Override
	public double area() {
		return wideth* lingth;
		}
	public Rectangle(double wideth, double lingth) {
		
		this.wideth = wideth;
		this.lingth = lingth;
	}
}
