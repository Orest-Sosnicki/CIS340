//Orest Sosnicki, CIS340, 1:30, MP1

import java.util.Scanner;

public class MP1 {
	
	static double [][] qScores;
	static String [] students;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int quizNumber = 0; //holds value for number of quizzes 
		
		System.out.println("How many scores per student?");
		quizNumber = Integer.parseInt(scan.nextLine()); //prompt user to enter number of scores per student
		
		classScores(quizNumber); //fills student and quiz data in to arrays
		
		menu(quizNumber);
		
	}
	
	//Show a menu and lets the user pick a option in the menu
	private static void menu(int quizNumber)
	{
		String name = ""; //holds value entered
		String menu = ""; 
		int qNumber = 0; 
	
		boolean loop = true; //loop controller
		
		
		do 
		{
			
			
			System.out.println("\n\n\n\n\t\t\t\tMenu");	//menu options
			System.out.println("1. Class Average");
			System.out.println("2. Studnet Average");
			System.out.println("3. Quiz Average\n");
			
			System.out.print("Enter choice number, or x to exit: ");
			
			menu = scan.nextLine(); //prompt user to choose menu option
			
			if(menu.equalsIgnoreCase("x")) // if menu option is x then end program
			{
				loop = false; //tell loop to stop repeating
			}
			else
			{
				switch(menu) //results of menu options
				{
					case "1":
					{
						//calculates total score class average
						System.out.printf("Class average for all quizzes is %.2f", classAverage(quizNumber));
						
						break; //end switch
					}
					case "2":
					{
						System.out.println("Calculate average by student.\n");
						
						System.out.print("Enter student name: ");
						name = scan.nextLine(); //prompt user to enter name of student
						
						//calculates student average
						studentAverage(name, quizNumber);
					
						break; //end switch
					}
					case "3":
					{
						System.out.println("Calculate average by Quiz Number");
						System.out.print("\nEnter Quiz number: ");
						
						qNumber = Integer.parseInt(scan.nextLine()); //prompt user to enter quiz number
						
						// calculates quiz average for class
						quizAverage(qNumber);
						
						break; //end switch
					}
					
				}
				
				System.out.println("\n\nPress Enter to continue...");
				scan.nextLine(); //prompt user to hit enter to continue
			} 

			//keep loop repeating until statement becomes false
		} while(loop);
	}
	
	//Creates arrays for students and quiz scores
	private static void classScores(int scores)
	{
		qScores = new double[3][scores]; //create the size of score array table
	    students = new String[3]; // create the size of student array table
	    
	    //loops through the array tables to enter in student name and quiz scores
		for(int i = 1; i <= 3; i++)
		{
			//prompt user to enter student name
			System.out.printf("\nEnter name for Student %d :",i );
			students[i-1] = scan.nextLine(); 
			
			System.out.printf("\nEntering scores for %s \n",students[i-1]);
			for(int s = 1; s <= scores; s++)
			{
				//prompt user to enter students quiz score
				System.out.printf("Quiz %d: ",s);
				qScores[i-1][s-1] = Double.parseDouble(scan.nextLine());
				
			}
			
		}
	}
	
	//Calculate Class Average quiz score
	private static double classAverage(int quizes)
	{
		double classAverage = 0; 
		double numberOfQuiz = 0;
		
		//calculate total number of quizes
		numberOfQuiz = quizes * 3;
		
		//loop through all quizes and and them all together
		for(int i = 1; i <= 3; i++) //access student
		{
			
			for(int s = 1; s <= quizes; s++) //access score
			{

				classAverage += qScores[i-1][s-1];
			}
		}
		
		return classAverage = classAverage/numberOfQuiz;
	}
	
	//Calculate Average quiz score for a student
	private static void studentAverage(String student, int quiz)
	{
		
		double studentAverage = 0;
		int nameFound = 0;
		
		for(int i = 1; i <= 3; i++)
		{
			//find if the student entered is found
			if(students[i-1].equalsIgnoreCase(student)) 
			{
				System.out.printf("%s's scores are: ",students[i-1]);
				for(int s = 1; s <= quiz; s++) 
				{
					//add all students scores
					System.out.printf("%.2f ",qScores[i-1][s-1]);
					studentAverage += qScores[i-1][s-1];
				}
				//calculate student average score for all quiz they have taken
				studentAverage = studentAverage/quiz;
				
				System.out.printf("\n%s's average is %.2f",students[i-1],studentAverage);
				nameFound = 0;
				break;
			}
			
			else
			{
				nameFound = 1; //sets up activation of student not found statement
			}
		}
		
		if(nameFound == 1)
		{
			//name entered did not match student name in array
			System.out.println("Student not found.");
		}
	}
	
	//calculate class average for the selected quiz
	private static void quizAverage(int quiz)
	{
		
		double qAverage = 0;
		
		//select all score for that quiz
		for(int i = 1; i <= 3; i++)
			
		{
			qAverage += qScores[i-1][quiz-1];
		}
		//calculate average quiz grade
		qAverage = qAverage/3;
		
		System.out.printf("Quiz %d average is %.2f",quiz,qAverage);
		qAverage = 0;
	}
}
