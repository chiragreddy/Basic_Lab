package assignment_4;

public class Students {

	private int studentId;
	private char studentType;
	private String studentName;
	
	public Students() {
		
		this.studentId = 10;
		this.studentType = 'F';
		
	}
	
	public Students(int id, char type, String fname, String lname) {
		
		this.studentId = id;
		this.studentType = type;
		this.studentName = fname + " " + lname;
		
		
	}
	
	public void setStudentId(int id) {
		
		this.studentId = id;
		
	}
	
	public void setStudentType(char type) {
		
		this.studentType = type;
		
	}
	
	public void setStudentName(String fname, String lname) {
		
		this.studentName = fname + " " + lname;
		
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public char getStudentType() {
		return this.studentType;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public static void main(String[] args) {
		
		Students student = new Students();
		student.setStudentName("Chris", "Evans");
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
		
		Students student2 = new Students(20,'M',"Chirag","Jitta");
		
		System.out.println(student2.getStudentName());
		System.out.println(student2.getStudentId());
		System.out.println(student2.getStudentType());
		
		
		
	}
	
	
}
