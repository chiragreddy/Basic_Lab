package assignment_1;

public class Student1 {
	
	private static int studentId = 550;
	private char studentType;
	private String studentName;
	private static int studentCount;  
	
	public Student1() {
		studentCount += 1;
		this.studentId = studentCount;
	}
	
	static { // executed before the constructor
		studentCount = 10;
	}
	
	public Student1(char sType, String fname, String lname) {
		
		this(); // calling default constructor
		this.studentType = sType;
		this.studentName = fname + " " + lname;
		
	}
	
	public static int getStudentCount() {
		return studentCount;
	}
	
	public void displayDetails(Student1 st) {
		System.out.println("Student Id is: " + st.studentId + "\nStudent Type is: " + st.studentType + "\nStudent Name is: " + st.studentName);
	}
	
	public static void main(String[] args) {
		Student1 studentOne = new Student1('D',"Bony","Thomas");
		studentOne.displayDetails(studentOne);
		Student1 studentTwo = new Student1('H',"Dinil","Bose");
		studentTwo.displayDetails(studentTwo);
	}
	
}