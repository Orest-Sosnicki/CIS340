//Orest Sosnicki, CIS340, 1:30, A3
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		int loopCounter = 0;
		int count = 0;
		
		double total = 0;
		int input = 0;
		
		int call = 0;
		System.out.println("Part 1 - Odd Numbers");
		
		for(int i = 1; i < 21; i += 2)
		{
			System.out.print(i + " ");
			
		}
		
		System.out.println("\n\n\nPart 2 - Even Numbers");
		
		while(loopCounter < 21)	
		{
			
			count = loopCounter%2;
			
			if(count == 0)
			{
				System.out.print(loopCounter + " ");
			}
			
			loopCounter++;
			
		}
		
		System.out.println("\n\n\nPart 3 - factorial");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number for the factorial: ");
		
		input = Integer.parseInt(scan.next());
		
		total = input;
		
		while(input > 1)
		{

			    input--;
				total = input * total;
				
		}
		
		System.out.println("the factorial is " + total);
		
		System.out.print("\n\nPart 4 - Triangle");
		
		for(int row = 0; row < 10; row++)
		{
			System.out.print("\n");
			
			for(call = 10; call > row; call--) 
			{
				
				System.out.print("*");
			}
			call = 0;
			
		}
		System.out.println("\n\nPress Enter for next page...");
		
		System.out.println("\n\nPart 5 - Average calculator");
		System.out.println("\nThis program will ask you to enter 2 scores each for 3 students.\n");
		
		total = 0;
		
		for(int s = 1; s < 4; s++)
		{
			for(int p = 1; p < 3; p++)
			{
				
				System.out.print("Student " + s + ", score " + p + ": ");
				input = Integer.parseInt(scan.next());
				
				total += input;
				
			
			}
		}
		
		total /= 6;
		System.out.printf("\nThe average of all scores is %.2f", total);
		
		System.out.println("\n\nPress Enter for next page...");
		
		System.out.println("\nPart 6 - Multiplication table");
		
		for(int i = 5; i < 11; i++)
		{
			for(int m = 1; m < 6; m++)
			{
				count = m*10;
				total = count * i;
				System.out.printf("\n%2d * %d  =  %5.0f",i,count,total);
			}
			System.out.println("");
		}
		
		System.out.println("\npress Enter to exit...");

	}

}
