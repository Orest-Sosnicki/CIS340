//Orest Sosnicki, CIS340, 1:30, PE13

import java.util.Scanner;

public class CourseApp {

	public static void main(String[] args) {
		
		Course Course1 = new Course();
		Course Course2 = new Course();
		
		Scanner scan = new Scanner(System.in);
		
		Course.setCollegeName("ASU");
		
		System.out.print("Please enter the first course prefix: ");
		Course1.setCoursePreFix(scan.nextLine());
		
		System.out.print("Please enter the course number: ");
		Course1.setCourseNumber(Integer.parseInt(scan.nextLine()));
		
		System.out.printf("\nA new Course has been created for %s %d at %s \n", Course1.getCoursePrefix(), Course1.getCourseNumber(),Course.getCollegeName());
		
		Course1.displayMessage();
		
		System.out.print("\n\nPlease enter the first course prefix: ");
		Course2.setCoursePreFix(scan.nextLine());
		
		System.out.print("Please enter the course number: ");
		Course2.setCourseNumber(Integer.parseInt(scan.nextLine()));
		
		System.out.printf("\nA new Course has been created for %s %d at %s \n", Course2.getCoursePrefix(), Course2.getCourseNumber(),Course.getCollegeName());
		
		Course2.displayMessage();
		
		
	}

}
