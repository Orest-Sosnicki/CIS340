//Orest Sonicki, CIS340, 1:30, PE2
import java.util.Scanner;
public class SwitchExercise {
	
	public static void main(String[] args) {
		
	    String studentId = "";
		String zip = "";
		double gpa = 0;
		String thesis = "";
		String dissertation = "";
		int studentType = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\tStudent Information System");
		System.out.print("\nEnter Student ID: ");
		studentId = input.next();
		
		System.out.println("\n\n\n1. Undergraduate.");
		System.out.println("2. Graduate.");
		System.out.println("3. PhD.");
		System.out.println("4. Non-degree Certificate.");
		
		System.out.print("\nEnter Option (1-4): ");
		
		studentType = Integer.parseInt(input.next());
		
		System.out.print("\nEnter zip Code: ");
		
	    zip = input.next();
	    		
	    		
		switch(studentType){
		
		case 1:
			
			System.out.print("\nEnter GPA: ");
			
			gpa = Double.parseDouble(input.next());
	
			break;
		case 2:
			
			System.out.print("\nEnter thesis title: ");
			
			thesis = input.next();
			
			break;
		case 3:
			
			System.out.print("\nEnter dissertation title: ");
			
			dissertation = input.next();
			break;
		case 4:
			
			break;
			
			default:
				System.out.println("invalid option was selected");
				break;
		}
		
		
	    
	    System.out.println("\n****** Recorded Data ******");
	    System.out.println("Student ID: " + studentId);
	    System.out.println("Zip: " + zip);
	    
	    switch(studentType){
	    
	    case 1:
	    case 4:
	    	
	    	System.out.printf("GPA: %.2f",gpa);
	    	break;
	    case 3:
	    	
	    	System.out.println("Dissertation: " + dissertation);
	    	break;
	    case 2:
	    	
	    	System.out.println("Thesis: " + thesis);
	    	break;
	    
	    }
	    
	    System.out.println("\nPress Enter to exit...");
		
	    input.close();
		
	    
		
		
		
	}
}
