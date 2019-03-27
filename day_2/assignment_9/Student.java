package assignment_9;

public class Student {
	
	private static int studentId = 550;
	private char studentType;
	private String studentName;
	
	public Student() {
		this.studentId += 1;
	}
	
	public Student(char sType, String fname, String lname) {
		
		this(); // calling default constructor
		this.studentType = sType;
		this.studentName = fname + " " + lname;
		
	}
	
	public void displayDetails(Student st) {
		System.out.println("Student Id is: " + st.studentId + "\nStudent Type is: " + st.studentType + "\nStudent Name is: " + st.studentName);
	}
	
	public static void main(String[] args) {
		Student studentOne = new Student('D',"Bony","Thomas");
		studentOne.displayDetails(studentOne);
		Student studentTwo = new Student('H',"Dinil","Bose");
		studentTwo.displayDetails(studentTwo);
	}
	
}