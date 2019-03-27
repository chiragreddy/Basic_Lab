package assignment_7;

public class PassByVal {
	public static void main(String[] args) {
		int sId = 25;
		PassByVal val = new PassByVal();
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("The sId are: " + sId);
	}
	
	public void passTheValueMethod(int sId) {
		sId = 10;
		System.out.println("The sId are: " + sId);
	}
}

// The value of sId remains unchanged as it is a primitive variable which is passed by value. Since, the value of sId is not changed by reference, the value remains same