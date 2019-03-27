package assignment_8;

public class Student1 {

	private int studentId;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth;
	
	// Constructor
	
	public Student1(int id, char type, String fname, String lname) {
		studentId = id;
		studentType = type;
		studentName = fname + " " + lname;
	}
	
	// setters
	
	public void setStudentId(int id) {
		this.studentId = id;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public void setResidentialStatus(String status) {
		this.residentialStatus = status;
	}
	
	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	// getters
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public char getStudentType() {
		return this.studentType;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public String getResidentialStatus() {
		return this.residentialStatus;
	}
	
	public String getFees() {
		return "Total fees is: " + "$ " +feesPerMonth ;
	}
	
	public void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees/6.0;
	}
	
	public void calculateFees(double semesterFees, double hostelFees) {
		feesPerMonth = semesterFees/6.0;
		feesPerMonth = feesPerMonth + hostelFees;
	}
	
	public static void main(String [] args) {
		
		Student1 student = new Student1(10,'M',"Chirag","Jitta");
		student.setResidentialStatus("Hostelite");
		
		if(student.getResidentialStatus().equalsIgnoreCase("DayScholar")) {
			student.calculateFees(1000);
		}
		else {
			student.calculateFees(1000, 500);
		}
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getResidentialStatus());
		System.out.println(student.getFees());
				
	}
	
}