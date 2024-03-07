package in.aryan;

public class Students {
   int roll_no;
   String student_name;
   String Student_add;
   
   public Students() {
System.out.println("Students::Constructor") ;
}
   
public Students(int roll_no, String student_name, String student_add) {
	super();
	this.roll_no = roll_no;
	this.student_name = student_name;
	Student_add = student_add;
}

public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public String getStudent_add() {
	return Student_add;
}
public void setStudent_add(String student_add) {
	Student_add = student_add;
}
@Override
public String toString() {
	return "Students [roll_no=" + roll_no + ", student_name=" + student_name + ", Student_add=" + Student_add + "]";
}
  
   
}
