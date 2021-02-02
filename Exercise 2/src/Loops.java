//Orest Sosnicki, CIS340, 1:45

import java.util.Scanner;

public class Loops 
{
	
	public static void main(String[] args) 
	{
		
		int asterisks;
		int loopCounter = 0;
		int asterisksMultiples = 0;
		int tableNumber = 0;
		int value = 0;
		
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("I can build you a line of asterisks.");
		
		System.out.print("\nHow many asterisks do you want? ");
		
		asterisks = Integer.parseInt(Scan.next());
		asterisksMultiples = asterisks;
		
		System.out.println("\nPrinting a line of asterisks using a while loop");
		
		while(asterisks > loopCounter) 
		{
			System.out.print("*");
			loopCounter++;
		}
		
		
		System.out.println("\n\nPrinting a line of asterisks using a for loop");
		for(int i = 0; i < asterisks; i++)
		{
			
			System.out.print("*");
			
		}
		
		loopCounter = 0;

		System.out.println("\n\nList of numbers from 1 to " + asterisks);
		while(asterisks > loopCounter)
		{
			loopCounter++;
			System.out.print(loopCounter + "  ");
			
		}
		
		System.out.println("\n\nList of multiples of " + asterisks + " from " + asterisks + " to 50");
		
		while(asterisksMultiples <= 50) 
		{
		
			System.out.print(asterisksMultiples + " ");
			
			asterisksMultiples += asterisks;
		}
		
		System.out.println("\nMultiplication Table for 2");
		
		for(int i = 0; i < 12; i++)
		{
			tableNumber++;
			
			value = 2 * tableNumber;
			System.out.printf("\n2 * %2d =  %2d", tableNumber,value);
			
		}
		
		System.out.println("\n\n\nPress Enter to exit...");
		
		Scan.close();
	}
}
