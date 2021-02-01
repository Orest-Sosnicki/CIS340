//Orest Sonicki, CIS340, 1:30, IC1
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		
		
		String studentName; 
		int grade;
		char letter;
		
		System.out.print("What is Your name? ");
		
		Scanner Input = new Scanner(System.in);

		studentName = Input.next();
		
		System.out.printf("Enter an Interger Score for %s:",studentName);
		
		grade = Integer.parseInt(Input.next());
		
		
		if(grade < 60 )
		{
			letter = 'F';
			System.out.println("The grade for this class is " + letter + ". You failed. forget it happend!");
		}
		
		else if(grade < 70)
		{
			letter = 'D';
			System.out.println("The grade for this class is " + letter + ". You passed. Done!");
		}
		
		else if(grade < 80)
		{
			letter = 'C';
			System.out.println("The grade for this class is " + letter + ". You passed. Completed!");
		}
		
		else if(grade < 90)
		{
			letter = 'B';
			System.out.println("The grade for this class is " + letter + ". You passed. Beautiful!");
		}
		
		else
		{
			letter = 'A';
			System.out.println("The grade for this class is " + letter + ". You passed. Awesome!");
		}
		
		
		System.out.println("\n***Feedback using if statement***");
		
		if(letter == 'A' || letter == 'B')
		{
			System.out.println("Keep doing what you are doing.");
		}
		else if(letter != 'F')
		{
			System.out.println("Do better next smester.");
		}
			
		
		
		
	}

}
