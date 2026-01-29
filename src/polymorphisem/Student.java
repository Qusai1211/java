package polymorphisem;

public class Student extends Person {
	private String numUnv;
	private double gpa;
	
	
	public String getNumUnv() {
		return numUnv;
	}
	public void setNumUnv(String numUnv) {
		this.numUnv = numUnv;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	void describe() {
		
		 System.out.println(" numUnv "+numUnv);
		 System.out.println("gpa "+gpa);
	 }
	public Student() {
		super();
		
	}
	
}
