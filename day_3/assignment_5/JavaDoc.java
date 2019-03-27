package assignment_5;

import java.util.Scanner;

public class JavaDoc {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("User Name: ");
		String name = scanner.nextLine();
		System.out.println("The length of string is " + name.length());
		System.out.println("Hi " + name);
		System.out.println("Username in Lower case is: " + name.toLowerCase());
		System.out.println("Username in Upper case is: " + name.toUpperCase());
		
		if(name.startsWith("a")) {
			System.out.println("Username starts with a");
		}
		else {
			System.out.println("Username does not start with a");
		}
		
		name = "KRISHNA";
		System.out.println("The new Username is :" + name);
		
	}
	
}
