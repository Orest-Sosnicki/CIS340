//Orest Sosnicki, CIS340, 1:30, PE13

public class Course {

	private String coursePrefix = "";
	private int courseNumber = 0;
	private static String collegeName;
	private double classAverage = 0.0;
	
	
	
	
	public void displayMessage()
	{
		System.out.printf("Welcome to %s %d", this.coursePrefix, this.courseNumber);
	}
	
	public String getCoursePrefix()
	{
		
		return this.coursePrefix;
	}
	
	public void setCoursePreFix(String coursePrefix)
	{
		this.coursePrefix = coursePrefix;
	}
	
	public int getCourseNumber()
	{
		return this.courseNumber;
	}
	
	public void setCourseNumber(int courseNumber)
	{
		this.courseNumber = courseNumber;
	}
	
	public static String getCollegeName()
	{
		return Course.collegeName;
	}
	
	public static void setCollegeName(String collegeName)
	{
		Course.collegeName = collegeName;
	}
	
	public double getClassAverage()
	{
		return this.classAverage;
	}
}
