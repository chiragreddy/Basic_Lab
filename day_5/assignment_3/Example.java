package assignment_3;

public class Example implements InterOne{
	public void methodOne() {
		// varTwo = varTwo + 10; - final values cannot be modified
		System.out.println("Value of varTwo: " + varTwo);
		System.out.println("Good Morning");
	}
	public void methodTwo() {
		System.out.println("Good Afternoon");
	}
}

class DemoInterface{
	public static void main(String[] args) {
		Example obj = new Example();
		obj.methodOne();
		obj.methodTwo();
	}
}