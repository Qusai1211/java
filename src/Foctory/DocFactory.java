package Foctory;

public class DocFactory {
	public Doc creat(String t) throws Exception {
	if(t.equalsIgnoreCase("word")) {
		return new Word();
		
	}else if(t.equalsIgnoreCase("Pdf")) {
		return new Pdf();
		
	}else {
		throw new Exception("Unknown Doc");
	}
		
	}
}
