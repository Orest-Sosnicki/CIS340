//Orest Sosnicki, CIS340, 1:30, PE14

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {

	private static ArrayList<Student> studentRoster;
	
	public static void main(String[] args) {
		
		loadStudent();

	}
	
	private static void loadStudent()
	{
		
		boolean continueLoop = false;
		String name = "";
		String id = "";
		String loop = "";
		
		studentRoster = new ArrayList<Student>();
	
		Scanner scan = new Scanner(System.in);
		
		do
		{
		
		continueLoop = false;
			
		System.out.print("Enter Student Name: ");
		name = scan.nextLine();
		
		System.out.print("Enter Studnet ID: ");
		
		id = scan.nextLine();
			
		Student tmpStudent = new Student(name,id);
		
		studentRoster.add(tmpStudent);
		
		System.out.println("\nDo you want to enter information for another studnet?");
		System.out.print("Enter 'Y' for Yes. Any key for No. ");
		loop = scan.nextLine();
		System.out.print("\n");
		
		if(loop.equalsIgnoreCase("y"))
		{
			continueLoop = true;
		}
		
		} while(continueLoop);
		
		for(Student s: studentRoster)
		{
			System.out.printf("%-20s %s\n",s.getName(),s.getId());
		}
	}

}
