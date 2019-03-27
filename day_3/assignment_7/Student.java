package assignment_7;

public class Student {

	private int studentId;
	private String studentName;
	private String residentialStatus;
	private long feesPerMonth;
	
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
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public String getResidentialStatus() {
		return this.residentialStatus;
	}
	
	public long getFees() {
		return this.feesPerMonth;
	}
	
	public static void main(String [] args) {
		
		int studentId = Integer.parseInt(args[0]);
		String  studentName = args[1];
		String residentialStatus = args[2];
		int fees = Integer.parseInt(args[3]);
		if(args[2].equalsIgnoreCase("hostelite")) {
			fees = fees + 500; // fees increased by 500 if status if hostelite
		}
		
		Student student = new Student();
		
		// setting command line arguments
		
		student.setStudentId(studentId);
		student.setStudentName(studentName);
		student.setResidentialStatus(residentialStatus);
		student.setFeesPerMonth(fees);
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getResidentialStatus());
		System.out.println(student.getFees());
				
	}
	
}