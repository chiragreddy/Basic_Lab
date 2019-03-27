package assignment_3;

public class Student3 {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	
	public Student3() {
		
	}
	
	public Student3(int id, char type, String firstName, String lastName) {
		
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
	
public void displayStudentDetails() {
	System.out.println("The student id is: " + getStudentId() + "\n The student type is: " + getStudentType() + "\n The student name is: " + getStudentName() + "\n The fees per month is: " + getFeesPerMonth());
}

public static void main(String[] args) {
	
	Student3 student;
	String status = args[0];
	if(status.equalsIgnoreCase("Hostelite")) {
		student = new Hostelite3(10,'M',"Chirag","Jitta","IMCS",1714);
		student.displayStudentDetails();
	}
	else {
		student = new DayScholar3(10,'M',"Chirag","Jitta","Texas");
		student.displayStudentDetails();
	}
	
}

}