package assignment_4;

public class CourseManagement {
	
	public static void main(String[] args) {
		
		Students student = new Students();
		int id = 10;
		char type = 'L';
		student.setStudentId(id);
		student.setStudentType(type);
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
		
		
	}

}