package assignment_5;

public class DayScholar5 extends PostGradStudent{
	private String residentialAddress;
	int fees;
	
	public DayScholar5(int sId, char sType, String sName, int pCourseId, String pCourseName, int pCourseFees, String address) {
		super(sId,sType,sName, pCourseId, pCourseName, pCourseFees);
		residentialAddress = address;
		System.out.println("DayScholar constructor called");
	}
	
	public void calculateFees() {
		fees = postCourseFees/6;
	}
	
	public int getFees() {
		return this.fees;
	}
	
	public static void main(String[] args) {
		
		DayScholar5 dayscholar = new DayScholar5(1001,'D',"Manu",5,"OOP",16000, "No 32/3 Vijayanagar");
		dayscholar.getFees();
	}
	
}
