package assignment_8;

public abstract class Student_8 {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	
	public Student_8() {
		
	}
	
	public Student_8(int id, char type, String firstName, String lastName) {
		
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
	System.out.println("The student id is: " + getStudentId() + "\nThe student type is: " + getStudentType() + "\nThe student name is: " + getStudentName() + "\nThe fees per month is: " + getFeesPerMonth());
}

abstract void calculateFees(double semesterFees);

public static void main(String[] args) {
	
	Student_8 student;
	String status = args[0];
	if(status.equalsIgnoreCase("Hostelite")) {
		student = new Hostelite_8(10,'M',"Chirag","Jitta","IMCS",1714);
		student.calculateFees(8000);
		student.displayStudentDetails();
	}
	else {
		student = new DayScholar_8(10,'M',"Chirag","Jitta","Texas");
		student.calculateFees(8000);
		student.displayStudentDetails();
	}
	
}
}

