//Orest Sosnicki, CIS340, 1:30, A1
import java.util.Scanner;
public class TaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double grossIncome = 0;
		double deduction = 0;
		double netIncome = 0;
		
		double fedrealTax = 0;
		double fedrealTaxRate = 0;
		double stateTax = 0;
		double incomeTax = 0;
		
		String code = "";
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Income Tax Calculator \n");
		
		System.out.println("\nThis program will calcualte your income tax. \n");
		
		System.out.print("What is your gross income? ");
		
		//Covert string to double
		grossIncome = Double.parseDouble(Input.nextLine());
		
		//test Gross Income and get Tax Rate
		if(grossIncome >= 30000 && grossIncome < 60000)
		{
			fedrealTaxRate = .1;
		}
		
		else if(grossIncome < 100000)
		{
			fedrealTaxRate = .2;
		}
		
		else if(grossIncome < 250000)
		{
			fedrealTaxRate = .3;
		}
		
		else if(grossIncome >= 250000)
		{
			fedrealTaxRate = .4;
		}
		
		System.out.println("\nFILLING STATUS.");
		System.out.println("Single - SG");
		System.out.println("Married Joint - MJ");
		System.out.println("Married Separately - MS");
		System.out.println("Head of HouseHold - HH \n");
		
		System.out.print("Enter The two Letter code corresponding with your status: ");
		
		//Read string and return deduction value
		switch(code = Input.next())
		{
		case "SG":
			deduction = 5950;
			break;
		case "MJ":
			deduction = 11900;
			break;
		case "MS":
			deduction = 5950;
			break;
		case "HH":
			deduction = 8700;
			break;
		}
		//Calculate  tax values
		netIncome = grossIncome - deduction;
		fedrealTax = netIncome * fedrealTaxRate;
		stateTax = netIncome * .025;
		incomeTax = fedrealTax + stateTax;
		
		System.out.printf("\nYour stated income was $%.2f. "
				+ "\nYour final tax liability is $%.2f.",grossIncome ,incomeTax);
		
		Input.close(); 
		
		}
		
	}