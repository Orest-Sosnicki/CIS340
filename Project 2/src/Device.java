//Orest Sosnicki, CIS340, 1:30, MP2

public class Device {
	
	private String SKU;
	private String name;
	private boolean availability;
	
	public Device(String SKU, String name, boolean availability)
	{
		this.SKU = SKU;
		this.name = name;
		this.availability = availability;
	}
	
	public void setSKU(String SKU)
	{
		this.SKU = SKU;
	}
	
	public String getSKU()
	{
		return this.SKU;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setAvailability(boolean availability)
	{
		this.availability = availability;
	}
	
	public boolean getAvailability()
	{
		return this.availability;
	}

}
