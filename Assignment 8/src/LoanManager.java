//Orest Sosnicki, CIS340, 1:30, A8
import java.util.Scanner;

public class LoanManager {
	
	double loanAmountArray[] = new double[10];
	double loanMonthlyArray[] = new double [10];
	
	int loopCounter = 0;
	double total = 0;

	public static void main(String[] args) {
	
		LoanManager LM = new LoanManager();
	
		
		System.out.println("\t\tFirst National Loans\n");
		
		LM.getLoanAmount();
		
		LM.outPutTotals();
		
		
		System.out.println("\npress Enter to exit....");
		

	}
	
	public void getLoanAmount()
	{
		
		double loanAmount = 0;
		int years = 0;
		
		String checkLoop;
		
		boolean inputLoop = false;
		boolean exceptLoop = true;
		
		Scanner scan = new Scanner(System.in);
		Loan loan = new Loan();
		
		do 
		{
			do
			{
				try 
				{
					System.out.printf("\nEnter loan amount: ");
					loanAmount = Double.parseDouble(scan.nextLine());
					exceptLoop = false;
				}
				catch(NumberFormatException x)
				{
					System.out.println("you did not enter a number try again");
				}
				}
			while(exceptLoop);
			exceptLoop = true;
			do
			{
				try
				{
					System.out.printf("Enter number of years: ");
					years = Integer.parseInt(scan.nextLine());
					exceptLoop = false;
				}
				catch(NumberFormatException x)
				{
					System.out.println("you did not enter a number try again");
				}
			}
			while(exceptLoop);
			
			System.out.printf("The total payment on this loan will be $%.2f", loan.totalPayment(loanAmount,years));
			
			System.out.printf("\n\nDo you want to apply for anthoer loan? (Y/N) : ");
			checkLoop = scan.nextLine();
			
			loanAmountArray[loopCounter] = loanAmount;
			loanMonthlyArray[loopCounter] = loan.totalPayment(loanAmount,years);
			
			
			if(checkLoop.equalsIgnoreCase("y"))
			{
				inputLoop = true;
			}
			else
			{
				inputLoop = false;
			}
			loopCounter++;
		}while(inputLoop);
	}
	
	public void outPutTotals()
	{
		System.out.println("\nFollowing are the loans in the system.");
		System.out.println("\tAmount Total Payments");
		
		for(int i = 0; i < loopCounter; i++)
		{
			System.out.printf("\t%.2f      %.2f\n",loanAmountArray[i],loanMonthlyArray[i]);
		}
		
		for(int i = 0; i < loopCounter; i++)
		{
			total += loanMonthlyArray[i];
		}
		
		System.out.printf("\nThe total payment of all loans in $%.2f",total);
	}

}
