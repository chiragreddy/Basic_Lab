package assignment_4;

class Student4 {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;
	
	Student4(int studentId){
		this.studentId = studentId;
		System.out.println("Student Constructor 1 invoked");
	}
	Student4(int studentId, char studentType, String studName, int semFees){
		this(studentId);
		this.studentType = studentType;
		studentName = studName;
		semesterFees = semFees;
		System.out.println("Student Constructor 2 invoked");
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
	public int getSemesterFees() {
		return semesterFees;
	}
	public int getFeesPerMonth() {
		return feesPerMonth;
	}
	void displayDetails() {
		System.out.println("\nStudent Details:");
		System.out.println("The student id is: " + getStudentId() + "\nThe student type is: " + getStudentType() + "\nThe student name is: " + getStudentName() + "\nThe fees per month is: " + getFeesPerMonth());
	}
	
}

class DayScholar extends Student4{
	
	private String residentialAddress;
	 DayScholar(int studentId, char studentType, String studName, int semFees, String residentialAddress){
		super(studentId, studentType, studName, semFees);
		this.residentialAddress = residentialAddress;
		
	}
	 
	 void displayDetails() {
		 super.displayDetails();
		 System.out.println("\nDay Scholar Details:");
		 System.out.println("The residential address is: " + residentialAddress);
	 }

}

public class CourseReg{
	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar(1001,'D',"Eugene",12000,"No 32/68 Vijayanagar");
		dayscholar.displayDetails();
	}
}