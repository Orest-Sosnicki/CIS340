//Orest Sosnicki, CIS340, 1:30, PE5
import java.util.Scanner;


public class GPACalc {

	public static void main(String[] args) {
		
		String lGrade = "";
		
		double holdCredit = 0;
		double creditAttempted = 0;
		
		double creditValue = 0;
		double gpa = 0;

		Scanner scan = new Scanner(System.in);
	
		System.out.println("\t\t\tGPA Calcualtor");
		
		System.out.println("\n\nThis program will calculate GPA based on course grades");
		
		for(int i = 0; i < 4; i++)
		{
			System.out.print("Enter Grade: ");
			
			lGrade = scan.nextLine();
			lGrade = lGrade.toUpperCase();
			
			System.out.print("Enter number of credits for grade: ");
			
			holdCredit = Double.parseDouble(scan.nextLine());
			
			creditAttempted += holdCredit;
			
			switch(lGrade)
			{
			
			case "A":
			{
				creditValue += (4 * holdCredit);
				
				break;
			}
			
			case "B":
			{
				creditValue += (3  * holdCredit);
				break;
			}
			
			case "C":
			{
				creditValue += (2  * holdCredit);
				break;
			}
			
			case "D":
			{
				creditValue += (1  * holdCredit);
				break;
			}
			
			default:	
			{
				creditValue += (0  * holdCredit);
				break;
				
			}
			
			}
			
			System.out.println("");
			
			
		}
		
		gpa = creditValue/creditAttempted;
		
		System.out.printf("The GPA is %.2f",gpa);
		
		
		
		

	}

}
