package abstraction;

public class Circle extends Shape{
private double r;

public double getR() {
	return r;
}

public void setR(double r) {
	this.r = r;
}

public Circle(double r) {
	super();
	this.r = r;
}
public double area() {
	return 3.14*r*r;
}

}
