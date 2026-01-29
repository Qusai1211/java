package polymorphisem;

public class Trainer extends Person {
	private double salary;
	private String major;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	void describe() {
		 
		 System.out.println("salary "+salary);
		 System.out.println("major "+major);
	 }
	public Trainer() {
		super();
		
	}
	
}
