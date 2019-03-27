package assignment_4;

public class Student {
	private int studentId;
	private char studentType = 'F';
	
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