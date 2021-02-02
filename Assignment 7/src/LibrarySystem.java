//Orest Sosnicki, CIS340, 1:30, A7

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
	
	ArrayList<Book> newBook = new ArrayList<Book>();

	public static void main(String[] args) {
		
		LibrarySystem library = new LibrarySystem();
		
		library.displayHeader();
		
		library.loadLabrarySystem();

	}
	
	public void addBook(String bookTitle, int bookYear)
	{
		Book book = new Book(bookTitle,bookYear);
		
		newBook.add(book);
	}
	
	public ArrayList<Book> displayBookList()
	{
		return newBook;
	}
	
	public void displayHeader()
	{
		System.out.print("\t\tNew Library System\n");
	}
	
	public void loadLabrarySystem()
	{
		int bookCount;
		String holdString;
		int holdInt;
		
		Scanner scan = new Scanner(System.in);
		
		Book addNewBook = new Book();
		
		System.out.print("\nHow many new books do you want to add to the Library? ");
		bookCount = Integer.parseInt(scan.nextLine());
		System.out.print("\n");
		
		for(int i = 0; i < bookCount; i++)
		{
			System.out.print("Enter Book title: ");
			holdString = scan.nextLine();
			addNewBook.setTitle(holdString);
			System.out.printf("Enter Book Year: ");
			holdInt = Integer.parseInt(scan.nextLine());
			if(holdInt > 2019)
			{
				holdInt = 1900;
			}
			addNewBook.setYear(holdInt);
			addBook(addNewBook.getTitle(),addNewBook.getYear());
			System.out.printf("Title '%s' added to the library.\n",addNewBook.getTitle());
		}
		
		System.out.println("\nAdding books complete. press Enter to continue.");
		scan.nextLine();
		
		System.out.print("\t\tNew Library System\n\n\n");
		System.out.printf("%-50s%s","Title","Year");
		
		for(Book s: newBook)
		{
			System.out.printf("\n%-50s%d",s.getTitle(),s.getYear());
		}
	
		scan.close();
	}

}
