package polymorphisem;

public class testP {

	public static void main(String[] args) {
		Person a=new Person();
		a.setName("Ahmad");
		a.setAge(120);
		a.describe();
		a.getAge();
		a.getName();
		
		Student  b=new Student();
		a.describe();
		b.equals(a);
		b.setNumUnv("22423434");
		b.setGpa(90);
        b.getGpa();
        b.getNumUnv();
		b.describe();
		
		
		Trainer c=new Trainer();
		a.describe();
		c.setSalary(1000);
		c.setMajor("It");
		c.getMajor();
		c.getSalary();
		c.describe();
		Person d=new Student();
		d.setName("ahmad");
		
		System.out.println(d.getName());
		
		
		
	}

}
