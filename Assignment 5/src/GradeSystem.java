//Orest Sosnicki, CIS340, 1:30, A5

import java.util.Scanner;

public class GradeSystem {
	
	static int [] scoreArray = {0,0,0,0,0};
	static String [] nameArray = {"","","","",""};
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name = "";
		int possition = -1;
		
		System.out.println("This program will store student grades and look them up fro you.");
		
		System.out.println("***********************************");
		System.out.println("Enter the names of 5 students");
		System.out.println("***********************************\n\n");
		
		populateNameArray();
		
		
		System.out.println("\n\n***********************************");
		System.out.println("Enter scores. One score per line.");
		System.out.println("***********************************\n\n");
		
		populateScoreArray();
		
		System.out.println("\n\nEnter name of student whoes score you want to find: ");
		
		name = scan.nextLine();
		
		possition = findStudentPosition(name);
		
		if(possition == -1)
		{
			System.out.println("Im Sorry. There is no student by that name");
		}
		else
		{
			System.out.printf("%s's score is %d", nameArray[possition], scoreArray[possition]);
		}
		
		System.out.println("\n\nPress Enter key to exit..");
		
		scan.nextLine();
	}
	
	public static void populateNameArray()
	{
		
		for(int i = 0; i < nameArray.length; i++)
		{		 
			
		nameArray[i] = scan.nextLine();
		
		
		}
		
	}
	
	public static void populateScoreArray()
	{
		
		for(int i = 0; i < nameArray.length; i++)
		{		 
			
		scoreArray[i] = Integer.parseInt(scan.nextLine());
		
		}
	}
	
	public static int findStudentPosition(String nameOfStudent)
	{
		int studentNumber = -1;
		
		for(int i = 0; i < nameArray.length; i++)
		{
			if(nameOfStudent.equalsIgnoreCase(nameArray[i]))
			{
				studentNumber = i;
				break;
				
			}
			
		}
		
		return studentNumber;
	}
}
