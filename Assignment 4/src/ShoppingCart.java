//Orest Sosnicki, CIS340, 1:30, A4

import java.util.Scanner;

public class ShoppingCart {
	public static void main(String[] args) {
		
	String [] name;
	String [] category;
	double [] price; 
	
	// T = Total
	double techCounter = 0;
	double groceryCounter = 0;
	double officeCounter = 0;
	double otherCounter = 0;
	
	// A = Average
	double techA = 0;
	double groceryA = 0;
	double officeA = 0;
	double otherA = 0;
	
	Scanner scan = new Scanner(System.in);
	
	name = new String [5];
	category = new String [5];
	price = new double [5];
	
	
	System.out.println("\t\t\t\tShopping cart");
	
	System.out.println("This program maintains a list of products (name, category, price)."
			+ " it will calcualte average dollars spent per category for you.");
	
	for(int i = 0; i < 5; i++)
	{
		System.out.print("\nEnter product name: ");
		name[i] = scan.nextLine();
		
		System.out.print("Enter product category (Tech/Grocery/Office): ");
		category[i] = scan.nextLine();
		
		System.out.print("Enter product price: ");
		price[i] = Double.parseDouble(scan.nextLine());
	}
	
	
	
	System.out.println("\nTECH PRODUCTS");
	for(int i = 0; i < 5; i++)
	{
		
		if(category[i].equalsIgnoreCase("Tech"))
		{
			System.out.println(name[i]);
			techA += price[i];
			techCounter++;
		}
	}
	
	if(techCounter == 0)
	{
		techCounter = 1;
	}
	
	techA = techA / techCounter;
	System.out.println("Average dollars spent: " + techA);
	
	
	
	System.out.println("\nGROCERY");
	for(int i = 0; i < 5; i++)
	{
		if(category[i].equalsIgnoreCase("Grocery"))
		{
			System.out.println(name[i]);
			groceryA += price[i];
			groceryCounter++;
		}
	}
	
	if(groceryCounter == 0)
	{
		groceryCounter = 1;
	}
	
	groceryA = groceryA / groceryCounter;
	System.out.println("Average dollars spent: " + groceryA);
	
	
	
	System.out.println("\nOFFICE");
	for(int i = 0; i < 5; i++)
	{
		if(category[i].equalsIgnoreCase("Office"))
		{
			System.out.println(name[i]);
			officeA += price[i];
			officeCounter++;
		}
	}
	
	if(officeCounter == 0)
	{
		officeCounter = 1;
	}
	
	officeA = officeA / officeCounter;
	System.out.println("Average dollars spent: " + officeA);
	
	
	
	System.out.println("\nOTHERS");
	for(int i = 0; i < 5; i++)
	{
		if(category[i].equalsIgnoreCase("Tech") || category[i].equalsIgnoreCase("Grocery") ||  category[i].equalsIgnoreCase("Office"))
		{
		}
		
		else
		{
			System.out.println(name[i]);
			otherA += price[i];
			otherCounter++;
		}
	}
	
	if(otherCounter == 0)
	{
		otherCounter = 1;
	}
	
	otherA = otherA / otherCounter;
	System.out.println("Average dollars spent: " + otherA);
	
	System.out.println("\nPress Enter to Exit...");
	
	scan.close();
	
	}
}
