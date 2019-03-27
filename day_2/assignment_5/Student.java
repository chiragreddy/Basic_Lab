package assignment_5;

public class Student {
	private int studentId;
	private char studentType;
	
	public Student() {         // Default Constructor
		this.studentId = 10;
		this.studentType = 'F'; 
	}
	
	public void setStudentId(int id) {
		this.studentId = id;
	}
	public void setStudentType(char type) {
		this.studentType = type;
	}
	public int getStudentId() {
		return this.studentId;
	}
	public char getStudentType() {
		return this.studentType;
	}
}
