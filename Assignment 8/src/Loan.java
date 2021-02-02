//Orest Sosnicki, CIS340, 1:30, A8
public class Loan {
	
	private double loanAmount;
	private int years;
	private double annualIntrestRate = 5;
	
	public Loan()
	{
		
	}
	public Loan(double loanAmount, int years)
	{
		this.loanAmount = loanAmount;
		this.years = years;
		this.annualIntrestRate = 5.0;
	}
	
	public void setLoanAmount(double loanAmount)
	{
		this.loanAmount = loanAmount;
		
	}
	
	public double getLoanAmount()
	{
		return this.loanAmount;
	}
	
	public void setYears(int years)
	{
		this.years = years;
	}
	
	public int getYears()
	{
		return this.years;
	}
	
	public double monthlyPayment(double loanAmount, int years)
	{
		double monthlyPayment;
		double monthlyIntrestRate = (annualIntrestRate/1200);
		
		monthlyPayment = loanAmount * monthlyIntrestRate/(1-(Math.pow(1/(1+monthlyIntrestRate),years * 12)));
		
		return monthlyPayment;
	}
	
	public double totalPayment(double loanAmount, int years)
	{
		double totalPayment;
		totalPayment = monthlyPayment(loanAmount,years) * 12 * years;
		return totalPayment;
	}

}
