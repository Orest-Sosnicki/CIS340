//Orest Sosnicki, CIS340, 1:30, SMS

public class SMS {

	public static void main(String[] args) {
		
		SMS myStudentSystem = new SMS();

		myStudentSystem.loadSMS();
		

	}
	
	private void loadSMS()
	{
		Course my340Class = new Course();
		
		Student tmpStudent = my340Class.add();
		
		tmpStudent.setName("John Smith");
		
		my340Class.getStudentRoster().get(0).setName("Jonathan Smith");
		
		System.out.printf("The first student in the roster is %s",my340Class.getStudentRoster().get(0).getName());
		
	}


}
