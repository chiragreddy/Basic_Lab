package assignment_8;

public class Operator {
	
	public static void main(String[] args) {
		
		int intVal = 100;
		byte byteVal = (byte)intVal;
		byte max = (byte)127; 
		byte min = (byte)-128;
		byte sum = (byte)(max + min);
		
		System.out.println("Sum = " + sum);
		
	}
	
}

// Int must be type-casted to byte