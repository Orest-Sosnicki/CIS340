//Orest Sosnicki, CIS340, 1:30, SMS

import java.util.ArrayList;


public class Course {

	private String coursePrefix;
	private int courseNumber;
	private static String collegeName;
	private double classAverage = 0.0;
	
	private int studentCount;
	
	private ArrayList<Student> studentRoster;
	
	
	
	public Course()
	{
		studentRoster = new ArrayList<Student>();
	}
	
	public ArrayList<Student> getStudentRoster()
	{
		return studentRoster;
	}
	
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
	
	public int getStudentCount()
	{
		return studentCount;
	}
	
	public Student add() 
	{
		Student tmpStudent = new Student();
		
		studentRoster.add(tmpStudent);
		
		studentCount++;
		
		return tmpStudent;
	}

	

	
	
}
