//Orest Sosnicki, CIS340, 1:30, PE14

public class Student {
	
	private static int studentCount;
	private String name;
	private String id;
	
	public Student(String name)
	{
		this.name = name;
		
		studentCount++;
		
		System.out.printf("A new student, %s, has been created", name);
		System.out.printf("Total number of student: %f",getStudentCount());
	}
	
	public Student(String name, String id)
	{
		this.name = name;
		this.id = id;
		
		studentCount++;
		
		System.out.printf("A new student with %s, name with, ID %s has been created.", name, id);
		System.out.printf("\nThere are new %d Students in the system.\n",getStudentCount());
		
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public String getId()
	{
		return this.id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public static int getStudentCount()
	{
		return studentCount;
	}
}
