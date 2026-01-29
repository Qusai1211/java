package polymorphism;

public class Animale {
	private String name;
	private String type;
	
	
	public Animale() {
	
		
	}
	
	public Animale(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	int sum(int a,int b) {
		return a +b;
	
	}
	double sum(int a,double b) {
		return a + b;
	}
	void print() {
		System.out.println("animals info");
	}
	
	
	
	
	
	
	
	
}



