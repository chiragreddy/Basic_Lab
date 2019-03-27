package registrationpack;

public class Registration {
	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar();
		dayscholar.setStudentId(1001);
		dayscholar.setStudentType('D');
		dayscholar.setStudentName("Dinil");
		dayscholar.getDetails();
	}
}