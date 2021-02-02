//Orest Sosnicki, CIS340, 1:30, A6
public class Banana{
	
	private double length;
	private int peelThickness;
	private double percentLeft;
	
	public Banana()
	{
		percentLeft = 100;
	}
	
	public Banana(double length)
	{
		this.length = length;
		percentLeft = 100;
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public void setLength(double value)
	{
		this.length = value;
	}
	
	public int getPeelThickness()
	{
		return this.peelThickness;
	}
	
	public void setPeelThickness(int value)
	{
		this.peelThickness = value;
		
	}
	
	public double getPercentLeft()
	{
		return this.percentLeft;
	}
	
	public void eat(double eatenAmount)
	{
		percentLeft = percentLeft - eatenAmount;
	}

}
