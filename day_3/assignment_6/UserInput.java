package assignment_6;

public class UserInput {
	
	public static void main(String[] args) {
		
		int number, iterations;
		number = Integer.parseInt(args[0]);
		iterations = Integer.parseInt(args[1]);
		
		for(int i = 1; i <= iterations; i++) {
			System.out.println(number + " * " + i + " = " + number*i);
		}
		
	}
	
}
