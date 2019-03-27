package assignment_3;

public class JaggedArray {
	
	public static void main(String[] args) {
		
		String students[][] = new String[4][0];
		
		students[0] = new String[] {"Tony","JAVA","C","C++"};
		students[1] = new String[] {"Thomas","JAVA","UNIX"};
		students[2] = new String[] {"Dinil","Linux","Oracle"};
		students[3] = new String[] {"Delvin","RDBMS","C#","ORACLE"};
		
		int count;
			System.out.println();
			for(int j=0;j<4;j++)
			{
				System.out.print(students[3][j]+" ");
			}
	
	}
}