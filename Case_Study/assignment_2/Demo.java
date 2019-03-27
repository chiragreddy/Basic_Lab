package assignment_2;

public class Demo {

	public static void main(String[] args) {
		
		Travel travel = new Travel();
		travel.setModeOfTravel('F');
		travel.setNoOfTickets(3);
		
		if(travel.getModeOfTravel() == 'F') {
			travel.setAmount(500 * travel.getNoOfTickets()); // total service charge
			System.out.println(travel.getAmount());
		}
		else if(travel.getModeOfTravel() == 'T') {
			travel.setAmount(100 * travel.getNoOfTickets());
			System.out.println(travel.getAmount());
		}
		else {
			travel.setAmount(50 * travel.getNoOfTickets());
			System.out.println(travel.getAmount());
		}
	}
	
}
