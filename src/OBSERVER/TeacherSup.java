package OBSERVER;

public class TeacherSup {
private Base Student ;
private Base Local ;
private Base Parent ;


public void setStudent(Base student) {
	this.Student = student;
}


public void setLocal(Base local) {
	this.Local = local;
}


public void setParent(Base parent) {
	this.Parent = parent;
}


private void not(String massege) {
	if(Student !=null) Student.ubdate(massege);
	if(Local !=null) Local.ubdate(massege);
	if(Parent !=null) Parent.ubdate(massege);
}

public void Pnew() {
	String message="new assinment posted";
	not(message);
}






}
