//Orest Sosnicki, CIS340, 1:30, PE11

import java.util.Scanner;
import java.util.ArrayList;

public class Methods {

	public static void main(String[] args) {
		
		int number = 0;
		int aList = 0;
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> values = new ArrayList<Integer>(aList);
		
		values.add(10);
		values.add(15);
		values.add(20);
		values.add(25);
		values.add(30);
		
		System.out.println("*** Testing Products method using 2 arguments, 5 and 2***");
		System.out.printf("The product using two arguments, 5 and 2 is %d",product(5,2));
		
		System.out.println("\n\n*** Testing Product method using 3 arguemnts, 2, 3, and 5***");
		System.out.printf("The product using three arguemnts - 2, 3, and 5 is %d",product(2,3,5));
		
		System.out.println("\n\n*** Testing Average Method With Integer Arguemnts***");
		System.out.println("This method will calculate the average of all numbers from 1 to n.");
		System.out.print("Enter n: ");
		
		number = Integer.parseInt(scan.nextLine());
		
		System.out.printf("The average of all numbers from 1 to %d is %.2f",number,calculateAverage(number));
		
		System.out.println("\n\n*** Testing Average Method With ArrayList Arguemnt***");
		System.out.println("This method will calculate the average of integers in the ArrayList.");
		System.out.printf("\nThe average of all numbers in the array is %.2f",calculateAverage(values));
		
		

		
	}

	private static int product (int number1, int number2)
	{
		int result = 0;
		
		result = number1 * number2;
		
		return result;
	}
	
	private static int product(int number1,int number2,int number3)
	{
		int result = 0;
		
		result = number1 * number2 * number3;
		
		return result;
		
		
	}
	
	private static double calculateAverage(int n)
	{
		int number = 0;
		double total = 0;
		double average = 0;
		
		number = n;
	
		{
			for(int i = 0; i < number ; i++)
			{
				
				total = total + i +1;
			}
			
			average = total/number;
		}
		
		return average;
	}
	
	private static double calculateAverage(ArrayList<Integer> number)
	{
		double average = 0;
		
		if(number == null)
		{
			average = 0;
		}
		else
		{
			for(int n: number)
			{
				System.out.print(n + " ");
				average += n;
				
			}
			average = average/number.size();
		}
		
		return average;
	}
	
	
}
