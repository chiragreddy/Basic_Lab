package assignment_3;
import java.util.Scanner;

public class AutoGenerate {
	
	private int companyCode = 115;
	private char modeOfTravel;
	private int travelCode;
	private static int uniqueCode;
	private static Scanner scanner = new Scanner(System.in);	

	public AutoGenerate() {
		this.uniqueCode += 1;
	}
	
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public void setModeOfTravel(char modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
	}

	public void setTravelCode(int travelCode) {
		this.travelCode = travelCode;
	}

	public void setUniqueCode(int uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

	public int getCompanyCode() {
		return companyCode;
	}

	public char getModeOfTravel() {
		return modeOfTravel;
	}

	public int getTravelCode() {
		return travelCode;
	}

	public int getUniqueCode() {
		return uniqueCode;
	}

	public static void main(String[] args) {
		
		AutoGenerate autogenerate = new AutoGenerate();
		
		System.out.println("Enter the mode of travel: ");
		char mode = scanner.next().charAt(0); 
		autogenerate.setModeOfTravel(mode);
		
		System.out.println("Enter the travel code: ");
		int travelcode = scanner.nextInt();
		autogenerate.setTravelCode(travelcode);
		
		System.out.println(generateBookingNumber(autogenerate));
		
	}
	
	public static String generateBookingNumber(AutoGenerate auto) {
		return ("The booking number is: " + auto.companyCode + auto.modeOfTravel + auto.travelCode + "000" + auto.uniqueCode);
	}
	
}