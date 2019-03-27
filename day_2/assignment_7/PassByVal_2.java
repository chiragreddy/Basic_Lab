package assignment_7;

public class PassByVal_2 {
	public static void main(String[] args) {
	
		PassByVal_2 val = new PassByVal_2();
		Student st = new Student();
		System.out.println(st.getStudentId());
		val.passTheValueMethod(st);
		System.out.println("The sId are: " + st.getStudentId());
	}
	
	public void passTheValueMethod(Student st) {
		st.setStudentId(10);
		System.out.println("The sId are: " + st.getStudentId());
	}
}

// The value of student Id changed as the student object 'st' is a reference variable which is passed by reference and the value is changed by its address.