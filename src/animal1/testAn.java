package animal1;

public class testAn {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		a.setName("apple");
		System.out.println(a.getName());
		System.out.println(" "  +  " ");
		 
		Dog a1=new Dog();
		a1.eat();
		a1.bark();
		
		 System.out.println(" "  +  " ");
		Cat a2=new Cat();
		a2.eat();
		a2.meow();
	}
}












