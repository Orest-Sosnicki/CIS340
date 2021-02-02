//Orest Sosnicki, CIS340, 1:30, PE12

import java.util.Scanner;
import java.util.ArrayList;

public class References {

	public static void main(String[] args) {
		
		String [] nameArray = {"","","","",""}; 
		int counter = 0;
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<>();
		
		System.out.println("\t\t**** Passing Refereences - Reading 5 Names ****");
		
		System.out.println("\n\nMain Method: Passing an Array, nameArray, by-value");
		System.out.println("resdStudentnames Method: Putting values inside stringArray parameter");
		
		for(int i = 0; i < nameArray.length; i++)
		{
			System.out.printf("Enter name %d:", i+1);
			nameArray[i] = scan.nextLine();
		}
		
		readStudentNames(nameArray);
		
		
		System.out.println("\nMain Method: Passing an ArrayList, NameArrayList, by-value");
		
		readStudentNames(names);
		
		System.out.println("\nMain Method: The contents of nameArrayList are:");
		
		for(String s: names)
		{
			System.out.println(names.get(counter));
			counter += 1;
		}
	}
	
	
	public static void readStudentNames(String [] stringArray) 
	{
		System.out.println("\nMain Method: The contents of nameArray are:");
		for(int i = 0; i < stringArray.length; i++)
		{
		System.out.println(stringArray[i]);
		}
	}
	
	public static void readStudentNames(ArrayList <String> stringList)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println("ReadStudentNames Method: Putting values inside stringListparameter");
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("Enter name %d:", i+1);
			stringList.add(scan.nextLine());
		}
	}

}
