//Orest Sosnicki, CIS340, 1:30, PE10

import java.util.Scanner;
import java.util.Random;
public class Craps {

	public static void main(String[] args) {
		
		int dieValue1 = 0;
		int dieValue2 = 0;
		
		String loop = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\t\t\tCraps Die Roll");
		System.out.println("Press Enter to roll a pair of dice...");
		
		scan.nextLine();
		
		do
		{

			
		
			dieValue1 = generateRandomNumber();
			dieValue2 = generateRandomNumber();
		
			System.out.printf("You rolled a %s", numberToText(dieValue1));
			System.out.printf("\nYou rolled a %s", numberToText(dieValue2));
		
			if(dieValue1 == 6 && dieValue2 == 6)
			{
				System.out.println("\nYou rolled a Boxcar!");
			}
		
			if(dieValue1 == 1 && dieValue2 == 1)
			{
				System.out.println("\nYou rolled Snake Eyes!");
			}
			
			System.out.println("\n\nType x to exit or press Enter to roll again...");
			
			loop = scan.nextLine();
			
		}while(!loop.equalsIgnoreCase("x"));
		
		
	}
	
	public static String numberToText(int number)
	{
		String numberText = "";
		
		switch(number)
		{
			case 1:
			{
				numberText = "ONE";
				break;
			}
				
			case 2:
			{
				numberText = "TWO";
				break;
			}
			
			case 3:
			{
				
				numberText = "THREE";
				break;
			}
			
			case 4:
			{
				
				numberText = "FOUR";
				break;
			}
			
			case 5:
			{
				
				numberText = "FIVE";
				break;
			}
			
			case 6:
			{
				
				numberText = "SIX";
				break;
				
			}
		}
		
	return numberText;
	}
	
	public static int generateRandomNumber()
	{
		int randomNumber = 0;
		
		Random randomGenerator = new Random();
		
		randomNumber = randomGenerator.nextInt(6) + 1;
		
		return randomNumber; 
	}

}
