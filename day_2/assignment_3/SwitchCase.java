package assignment_3;

public class SwitchCase {
	public static void main(String[] args) {
	char grade = 'A';
	switch(grade){
	case 'A':
		System.out.println("80 - 100");
		break;
	case 'B':
		System.out.println("73-79");
		break;
	case 'C':
		System.out.println("65-72");
		break;
	case 'D':
		System.out.println("55-62");
		break;
	case 'E':
		System.out.println("<55");
		break;
	default:
		System.out.println("Grade does not exist");
		break;
		}
	}
}
