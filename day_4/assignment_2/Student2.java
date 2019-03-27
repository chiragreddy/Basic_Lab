package assignment_2;

public class Student2 {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	
	public Student2() {
		
	}
	
public Student2(int id, char type, String firstName, String lastName) {
		
		feesPerMonth = 100;
		studentId = id;
		studentType = type;
		studentName = firstName + " " + lastName;
	}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public void setStudentType(char studentType) {
	this.studentType = studentType;
}

public void setStudentName(String firstName, String lastName) {
	this.studentName = firstName + lastName;
}

public void setFeesPerMonth(double feesPerMonth) {
	this.feesPerMonth = feesPerMonth;
}

public int getStudentId() {
	return studentId;
}

public char getStudentType() {
	return studentType;
}

public String getStudentName() {
	return studentName;
}

public double getFeesPerMonth() {
	return feesPerMonth;
}
	
}
