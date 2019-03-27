package assignment_3;

public class DayScholar3 extends Student3{

	private String residentialAddress;
	
	public DayScholar3() {
		
	}
	
	public DayScholar3(int id, char type, String firstName, String lastName, String residentialAddress) {
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
	
	
}
