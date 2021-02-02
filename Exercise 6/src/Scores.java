//Orest Sosnicki, CIS340, 1:30, PE6

import java.util.Scanner;
public class Scores {
	public static void main(String[] args) {

		int [] scores;
		String [] names;
	
		scores = new int[5];
		names = new String[5];
	
		Scanner scan = new Scanner(System.in);
	
		System.out.println("This program will store student grades and look them up for you.");
	
		System.out.println("\n*************************");
		System.out.println("Enter names. one name per line.");
		System.out.println("*************************\n");
	
	
		for(int i = 0;i < names.length;i++)
		{
			System.out.print("Enter Name: ");
			names[i] = scan.nextLine();
		}
	
		System.out.println("\n*************************");
		System.out.println("Enter score. one score per line.");
		System.out.println("*************************\n");
	
		for(int i = 0; i < scores.length;i++)
		{
			System.out.print("Enter Score for " + names[i] + ": ");
			scores[i] = Integer.parseInt(scan.nextLine());
		}
	
		System.out.println("\n\n\n\n\nYou entered the following data:");
	
		System.out.printf("\n%-20s %-5s","Name", "score");
		
		for(int i = 0; i < scores.length; i++)
		{
			
				System.out.printf("\n%-20s %5d",names[i],scores[i]);
		}
	}
}
