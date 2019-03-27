package assignment_5;

public class PostGradStudent extends Student5{

	protected int postCourseId;
	protected String postCourseName;
	protected int postCourseFees;
	
	public PostGradStudent(int sId, char sType, String sName, int pCourseId, String pCourseName, int pCourseFees) {
		super(sId,sType,sName);
		postCourseId = pCourseId;
		postCourseName = pCourseName;
		postCourseFees = pCourseFees;
		System.out.println("PostGrad constructor called");
	}
	
	public int getpostCourseId() {
		return this.postCourseId;
	}
	
	public String getpostCourseName() {
		return this.postCourseName;
	}
	
}
