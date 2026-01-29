package polymorphisem;

public class Person {
private String name;
private double age;

public String getName() {
	return name;
}
public void setName(String name) {
	if(!name.isEmpty()&& name.length()<=50) {
		System.out.println("name ");
		this.name = name;
	}else {System.out.println("no name");
		
	}
	this.name = name;
}
public double getAge() {
	return age;
}
public void setAge(double age) {
	if(age>=0 && age<=120) {
		System.out.println("age");
		this.age = age;
	}else {
		System.out.println("not age");
		
	}
	
}
public Person() {
	
	
}
 void describe() {
	 System.out.println(" name "+name);
	 System.out.println(" age "+ age);
	
	 
 }


}
