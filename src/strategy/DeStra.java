package strategy;

public class DeStra {
private Dellvery s;



public void setS(Dellvery s) {
	this.s = s;
}



public DeStra(Dellvery s) {
	super();
	this.s = s;
}

public int f() {
	return s.fee();
}



}
