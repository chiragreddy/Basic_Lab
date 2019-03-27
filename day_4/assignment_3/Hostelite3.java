package assignment_3;

public class Hostelite3 extends Student3{
	
	private String hostelName;
	private int roomNumber;
	
	public Hostelite3() {
		
	}
	
	public Hostelite3(int id, char type, String firstName, String lastName, String hostelName, int roomNumber) {
		
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
		System.out.println("The hostel Name is: " + getHostelName() + "\n The room number is: " + getRoomNumber());
	}
	
}