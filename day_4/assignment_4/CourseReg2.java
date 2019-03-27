package assignment_4;

class CourseRegistration{
	
	static protected int regId;
	protected String courseName;
	public CourseRegistration(){
		regId++;
		System.out.println("Course Registration Constructor 1 called");
	}
	public CourseRegistration(String cname){
		this();
		courseName = cname;
		System.out.println("Course Registration Constructor 2 called");
	}
	
	public void displayDetails() {
		System.out.println("Registration ID: " + regId);
		System.out.println("CourseName: " + courseName);
	}
	
}

class Student5 extends CourseRegistration{
	
	protected int studentId;
	protected char studentType;
	protected String studentName;
	private int semesterFees;
	private int feesPerMonth;
	
	Student5(String cName, int studentId){
		super(cName);
		this.studentId = studentId;
		System.out.println("Student Constructor 1 invoked");
	}
	
	Student5( String cName, int studentId, char studentType,String studName, int semFees){
		this(cName,studentId);
		this.studentType = studentType;
		studentName = studName;
		semesterFees = semFees;
		System.out.println("Student Constructor 2 invoked");
	}
	
}

class DayScholar5 extends Student5{
	
	private String residentialAddress;
	DayScholar5(String cName, int studentId, char studentType, String studName, int semFees, String residentialAddress){
		super(cName,studentId, studentType, studName, semFees);
		this.residentialAddress = residentialAddress;
	}
	
	public void displayDetails() {
		
		super.displayDetails();
		System.out.println("Residential Address is: " + residentialAddress);
		
	}
	
}

public class CourseReg2 {

	public static void main(String[] args) {
		DayScholar5 dayscholar = new DayScholar5("OOP",1001,'D',"Eugene",12000,"No 32/68 Vijayanagar");
		dayscholar.displayDetails();
		
	}
	
}
