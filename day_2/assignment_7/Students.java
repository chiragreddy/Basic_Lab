package assignment_7;

public class Students {
	private int studentId;
	private char studentType;
	
	public Students() {        
		this.studentId = 25;
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
