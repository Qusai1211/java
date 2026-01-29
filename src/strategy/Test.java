package strategy;

public class Test {

	public static void main(String[] args) {
		DeStra s=new DeStra (new  City ());
System.out.println(s.f());
s.setS(new OutSaide());
System.out.println(s.f());
	}

}
