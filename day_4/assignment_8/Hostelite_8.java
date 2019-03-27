package assignment_8;

public class Hostelite_8 extends Student_8{
	
	private String hostelName;
	private int roomNumber;
	
	public Hostelite_8() {
		
	}
	
	public Hostelite_8(int id, char type, String firstName, String lastName, String hostelName, int roomNumber) {
		
		super(id, type, firstName, lastName);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
		
	}

	public String getHostelName() {
		return hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("The hostel Name is: " + getHostelName() + "\nThe room number is: " + getRoomNumber());
	}
	
	void calculateFees(double semesterFee) {
		feesPerMonth = semesterFee/6.0;
		feesPerMonth = feesPerMonth + 1200;
	}
	
}