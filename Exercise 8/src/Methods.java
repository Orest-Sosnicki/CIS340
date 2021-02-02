//Orest Sosnicki, CIS340, 1:30, PE8

import java.util.Scanner;

public class Methods {
	
	static int[] listOfNumbers = {1,2,3,4,5};

	public static void main(String[] args) {
		
		int number1 = 5;
		int number2 = 2;
		int number = 4;
		
		String string1 = "Hello ";
		String string2 = "World";
		
		Scanner scan = new Scanner(System.in);
		
		printGreetings();
		
		System.out.println("\n*** Testing Product and return values ***");
		System.out.printf("The product of %d and %d is %d",number1,number2,product(number1, number2));
		
		System.out.println("\n\n*** Testing Concatenate and nested method calles ***");
		System.out.printf("the return value is \"%s\" ",concatenate(string1, string2));
		
		System.out.println("\n\n\n*** Testing Array Search ***");
		System.out.printf("Testing if the number %d is present in the array....",number);
		
		
		if(arrayContains(number))
		{
			System.out.printf("\nArray contains the number %d",number);
		}
		else
		{
			System.out.printf("\nArray Does not contain the number %d", number);
		}
		
		number = 50;
		System.out.printf("\n\nTesting if the number %d is present in the array....",number);
		
		
		if(arrayContains(number))
		{
			System.out.printf("\nArray contains the number %d",number);
		}
		else
		{
			System.out.printf("\nArray Does not contain the number %d", number);
		}
		
		System.out.println("\n\n\n*** Testing Divide and return values ***");
		System.out.printf("The results of dividing %d by %d is %f",number1 = 7,number2 = 6,divide(number1,number2));
		
		

	}
	
	private static void printGreetings() {
		
		System.out.println("Hello");
	}
	
	private static int product(int number1, int number2) {
		
		int number3;
		
		number3 = number1 * number2;
		
		return number3;
	}
	
	private static String concatenate(String string1, String string2){
		String string3 = "";
		
		string3 = string1 + string2;
		
		return string3;
		
	}
	
	private static double divide(int number1 ,int  number2) {
		
		double quotuent = 0;
		
		quotuent = Double.valueOf(number1)/number2;
		
		return quotuent;
		
		
	}
	
	private static boolean arrayContains(int number) {
		
		boolean found = false;
		
	    for(int i = 0; i < 5; i++)
	    {
	    	if(listOfNumbers[i] == number)
	    	{
	    		found = true;
	    		break;
	    	}
	    	
	    }	
		
		return found;
	}

}
