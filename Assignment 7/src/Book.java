//Orest Sosnicki, CIS340, 1:30, A7

public class Book {
	
	private String title;
	private int year;
	
	public Book()
	{
		
	}
	
	public Book(String title, int year)
	{
		this.title = title;
		this.year = year;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
		
}
