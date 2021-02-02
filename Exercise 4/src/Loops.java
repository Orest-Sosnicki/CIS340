//Orest Sosnicki, CIS340, 1:30, PE4

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		
		double number = 0;
		double score = 0;
		double total = 0;
		
		
		String hold = "";
		
		Scanner scan = new Scanner(System.in);
		

		System.out.println("\t\t\t\t\tIn-Class: Logic and Looping Exercises");
		
		System.out.println("\n\nAverage using Do Loop");

		System.out.println("\nCalculate an average of all numbers entered. Enter \"X\" when finished entering numbers. ");
		
		do
		{
			System.out.print("Enter number: ");
			
			hold = scan.nextLine();
			   
			if(!hold.equalsIgnoreCase("x"))
			{
		
				score = Double.parseDouble(hold);
				total += score;
				number++;
			}
				
		}
		while(!hold.equalsIgnoreCase("x"));
		
		total = total / number;
		
		System.out.println("The average of all numbers is " + total);
		
		System.out.println("\n\nAverage Demo using While loop");
		
		System.out.print("Calculate an average of all numbers entered. Enter \"X\" when finished entering numbers. \n");
		
		hold = "";
		number = 0;
		total = 0;
		
		
		while(!hold.equalsIgnoreCase("x"))
		{
			System.out.print("Enter number: ");
			
			hold = scan.nextLine();
			   
			if(!hold.equalsIgnoreCase("x"))
			{
		
				score = Double.parseDouble(hold);
				total += score;
				number++;
			}
			
		}
		
		total = total / number;
		
		System.out.println("The average of all numbers is " + total);
		
		System.out.println("Check to see that the average produced using while and do is identical");
		
	
		int call = 0;
	
		for(int row = 0; row < 10; row++)
		{
			for(call = 0; call < row; call++) 
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		
		for(int row = 0; row < 10; row++)
		{
			System.out.println("");
			
			for(int space = 0; space < row; space++)
			{
				System.out.print(" ");
			}
			
			for(call = 10; call > row; call--) 
			{
				
				System.out.print("*");
			}
			call = 0;
			
		}
		
		
		System.out.print("\n\n\nEnter the number of rows you want in the triangle :");
		
		score = 2 * Double.parseDouble(scan.nextLine() );
		
		for(int row = 1; row < score; row+= 2)
		{
			
			for(double dash = score; dash > row; dash-=2) 
			{
				System.out.print(" ");
			}
			
			for(call = 0; call < row; call++) 
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		scan.close();
		
	}	
}
