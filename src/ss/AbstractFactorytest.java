package ss;

public class AbstractFactorytest {

	public static void main(String[] args) {
		Factory fA=new FoctoryA();
Product pA=fA.f();
pA.use();
Factory fB=new FoctoryB();
Product pB=fB.f();
pB.use();

	}

}
