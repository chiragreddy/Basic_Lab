package assignment_5;

public class Student5 {

	protected static int studentId;
	protected char studentType;
	protected String studentName;
	
	public Student5() {
		studentId += 1;
		System.out.println("Student constructor 1 called");
	}
	
	public Student5(int sId, char sType, String sName) {
		this();
		studentId = sId;
		studentType = sType;
		studentName = sName;
		System.out.println("Student constructor 2 called");
	}
	
}
