package assignment_6;

public class Student6 {
	
	protected int studentId;
	protected char studentType;
	protected String studentName;
	
	public void setStudentId(int sId) {
		this.studentId = sId;
	}
	
	public void setStudentType(char sType) {
		this.studentType = sType;
	}
	
	public void setStudentName(String sName) {
		this.studentName = sName;
	}
	
	public void getDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Type: " + studentType);
	}
	
}

class DayScholar6 extends Student6{
	private String residentialAddress;
	public void setResAddress(String resAddress) {
		this.residentialAddress = resAddress;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("Student Name: " + studentName);
		System.out.println("Residential Address: " + residentialAddress);
	}
}

class DynamicEx{
	public static void main(String[] args) {
		
		// As residential address cannot be set with super class reference, it should be changed to subclass reference
		DayScholar6 dayscholar = new DayScholar6(); 
		dayscholar.setStudentId(1001);
		dayscholar.setStudentType('D');
		dayscholar.setStudentName("Thomas");
		dayscholar.setResAddress("No 32/3 Vijayanagar");
		dayscholar.getDetails();
	}
}
