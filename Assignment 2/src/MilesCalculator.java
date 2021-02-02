//Orest Sosnicki, CIS340, 1:30

import java.util.Scanner;

public class MilesCalculator {

	public static void main(String[] args) {
		
		String cityCode;
	
		int option = 0;
		
		double miles = 0;
		double bonousMiles = 0;
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("\t\tMiles Calculator");
		
		System.out.println("\nThis program will calculate how many miles you earn on your Phoenux Air flight");
		
		System.out.println("\nDESTINATIONS");
		System.out.println("Los Angles (LAX)");
		System.out.println("San Diego (SAN)");
		System.out.println("Las Vagas (LAS)");
		
		System.out.print("\nEnter Destination airport code: ");

		cityCode = Scan.next();
		
		switch(cityCode)
		{
		
			case "LAX":
				
				miles = 369;
				break;
				
			case "SAN":
				
				miles = 304;
				break;
				
			case "LAS":
				
				miles = 255;
				break;
			
			default:
					
				System.out.println("\nPhoenix Air does not fly to " + cityCode + ". There will be zero miles earned.");
				System.out.println("Press enter to quit...");
					
				Scan.next();
				System.exit(0);
				break;
					
		}
		
			System.out.println("STATUS");
			System.out.println("1. Bronze");
			System.out.println("2. Silver");
			System.out.println("3. Gold");
			System.out.println("4. Platinum");
			
			System.out.print("\n\nEnter frequent Statue option (1-4): ");
			
			option = Integer.parseInt(Scan.next());
			
			switch(option)
			{
				
				case 1:
					bonousMiles = miles;
					break;
			
				case 2:
					bonousMiles = 1.25 * miles;
					break;
				case 3:
					bonousMiles = 1.5 * miles;
					break;
				case 4:
					bonousMiles =  2 * miles;
					break;
				default:
					break;
			}
			
			System.out.printf("\nYou will earn %.2f miles flying from Phoenix to %s.",  bonousMiles, cityCode );
		
		
		Scan.close();
		
		
	}

}
