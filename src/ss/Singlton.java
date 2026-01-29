package ss;


public class Singlton {

	private static Singlton a;
	
	private Singlton() {
		
	}

	public static Singlton getA() {
		if(a==null) {
			a=new Singlton();
			return a;
		}else {
			return a;
		}
	
	}

	

	
	
	
	
	
	
	
	
}
