package assignment_2;

public class Hostelite2 extends Student2{
	
	private String hostelName;
	private int roomNumber;
	
	public Hostelite2() {
		
	}
	
	public Hostelite2(int id, char type, String firstName, String lastName, String hostelName, int roomNumber) {
		
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
	
	public static void main(String[] args) {
		
		Hostelite2 h = new Hostelite2(10,'M',"Chirag","Jitta","IMCS",1714);
		System.out.println(h.getStudentId());
		System.out.println(h.getStudentType());
		System.out.println(h.getStudentName());
		System.out.println(h.getFeesPerMonth());
		System.out.println(h.getHostelName());
		System.out.println(h.getRoomNumber());
		
	}
	
}