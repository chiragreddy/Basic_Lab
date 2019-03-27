package assignment_7;

public class Student7 {

	protected int studentId;
	protected char studentType;
	protected String studentName;
 	protected int semesterFees;
	protected int feesPerMonth;
	
	public Student7() {
		semesterFees = 12000;
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
	
	public void calculateFees() {
		feesPerMonth = semesterFees/ 6;
	}
	
	public void displayDetail() {
		System.out.println("Student Id is: " + studentId + "\nStudent Type is: " + studentType +"\nStudent Name is: " + studentName + "\nSemester Fees is: " + semesterFees + "\nFees Per Month is: " + feesPerMonth);
	}
	
}
