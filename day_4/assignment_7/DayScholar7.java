package assignment_7;

public final class DayScholar7 extends Student7{

	private String residentialAddress;
	
	public DayScholar7() {
		
	}
	
	public DayScholar7(int id, char type, String fName, String lName, String residentialAddress) {
		studentId = id;
		studentType = type;
		studentName = fName + lName;
		this.residentialAddress = residentialAddress;
	}
	
	public void setResidentialAddress(String residentialAddress) {
	   this.residentialAddress = residentialAddress;
    }
	
    public void displayDaySDetails() {
		System.out.println("The address is: " + this.residentialAddress);
	}
	
	public static void main(String[] args) {
		DayScholar7 dayscholar = new DayScholar7();
		dayscholar.setStudentId(10);
		dayscholar.setStudentType('M');
		dayscholar.setStudentName("Chirag", "Jitta");
		dayscholar.setResidentialAddress("Irving, Texas");
		dayscholar.calculateFees();
		dayscholar.displayDetail();
		dayscholar.displayDaySDetails();
	}
	
}
