//Orest Sosnicki, CIS340, 1:30, A6
public class Apple{
	
	private int peelThickness;
	private double percentLeft;
	private double radius;
	
	public Apple()
	{
		percentLeft = 100;
	}
	
	public Apple(double radius)
	{
		this.radius = radius;
		percentLeft = 100;
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
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public void setRadius(double value)
	{
		this.radius = value;
	}
	
	public void eat(double eatenAmount)
	{
		percentLeft = percentLeft - eatenAmount;
	}
}
