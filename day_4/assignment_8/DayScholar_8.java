package assignment_8;

public class DayScholar_8 extends Student_8{

	private String residentialAddress;
	
	public DayScholar_8() {
		
	}
	
	public DayScholar_8(int id, char type, String firstName, String lastName, String residentialAddress) {
		super(id,type,firstName,lastName);
		this.residentialAddress = residentialAddress;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("The residential address is: " + getResidentialAddress());
	}
	
	void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees/6.0;
	}
	
}