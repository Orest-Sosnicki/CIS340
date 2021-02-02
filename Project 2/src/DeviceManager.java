//Orest Sosnicki, CIS340, 1:30, MP2

import java.util.ArrayList;
import java.util.Scanner;

public class DeviceManager {
	
	static ArrayList<Device> arrayDevice = new ArrayList<Device>();

	public static void main(String[] args) {
		
		DeviceManager dManager = new DeviceManager();
		
		System.out.print("Device Manager\n");
		
		generateData(); //generates data for Arrays List
		
		dManager.menu(); //Display menu for user to interact with
	
	}
	
	public static void generateData() //method that generates 5 inputs for array list
	{
		Device phone = new Device("1","Phone",true); //Creating device
		Device tv = new Device("2","tv",true);
		Device watch = new Device("3","watch",true);
		Device laptop = new Device("4","laptop",true);
		Device computer = new Device("5","computer",true);
		
		arrayDevice.add(phone); //Inputing in to arraylist
		arrayDevice.add(tv);
		arrayDevice.add(watch);
		arrayDevice.add(laptop);
		arrayDevice.add(computer);
	}
	
	public void showArrays()  //Method that show all devices in the array list
	{
		System.out.print("\n");
		System.out.printf("\n%-10s %-10s %-10s","SKU","Name","Availability");
		for(Device d: arrayDevice)
		{
			System.out.printf("\n%-10s %-10s %-10s",d.getSKU(),d.getName(),d.getAvailability());
		}
	}
	
	public void newDevice() //Method That will create a new device and put it in the array list
	{
		String SKU;
		String name;
		String availavilityChecker;
		boolean availability;
		boolean loop = true;
		
		Scanner scan = new Scanner(System.in);
		DeviceManager dManager = new DeviceManager();
		
		System.out.print("Enter the SKU: ");
		SKU = scan.nextLine();
		
		System.out.print("Enter the name: ");
		name = scan.nextLine();
		
		System.out.print("Is the availability true or false? ");
		
		do //Checks to see if user inputed true or false correctly
		{
			availavilityChecker = scan.nextLine();
			
			if(availavilityChecker.equalsIgnoreCase("true") || availavilityChecker.equalsIgnoreCase("false"))
			{
				availability = Boolean.parseBoolean(availavilityChecker);
				dManager.addDevice(SKU,name,availability);
				loop = false;
			}
			else
			{
				System.out.print("You did not enter true or false. try again :");
			}
		}
		while(loop);
	}
	//method that calls the Device class and creates a new device 
	public void addDevice(String SKU, String name, boolean availability)
	{
		Device newDevice = new Device(SKU,name,availability);
				
		arrayDevice.add(newDevice);	
	}
	
	public void editDevice() //Method taht allwas the user to change the data avout the device
	{
		String name = "";
		String holdString;
		boolean holdBoolean = true;
		int switchNumber = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nWhat is the name of the device you would like to edit: ");
		
		name = scan.nextLine();
		
		for(Device d: arrayDevice) //scans through all devices in the array list to get the correct array
		{
			if((d.getName().equalsIgnoreCase(name)))
			{
				System.out.print("\nEnter 1 to change SKU");
				System.out.print("\nEnter 2 to change Name");
				System.out.print("\nEnter 3 to change availability");
				System.out.print("\n\nWhat would you like to change? ");
				
				try //prevents user from entering anything except a number
				{
					switchNumber = Integer.parseInt(scan.nextLine());
				}
				catch(NumberFormatException x)
				{
					System.out.print("\nyou did not enter one of the options");
				}
		
				switch(switchNumber) //option for user to pick what they would like to change
				{
					case 1:
					{
						System.out.print("\nEnter new SKU: ");
						holdString = scan.nextLine();
						d.setSKU(holdString);
						break;
					}
					
					case 2:
					{
						System.out.print("\nEnter new Name: ");
						holdString = scan.nextLine();
						d.setName(holdString);
						break;
					}
					
					case 3:
					{
						System.out.print("\nChange availability: ");
						holdBoolean = Boolean.parseBoolean(scan.nextLine());
						d.setAvailability(holdBoolean);
						break;
					}
				}
				break;
			}
		}
	}
	
	public void showMatchingDevices()  //Method that displays all device that match the users input
	{
		String deviceName;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n");
		
		System.out.print("Enter the name of the devices you are looking for: ");
		deviceName = scan.nextLine();
		
		System.out.printf("\n%-10s %-10s %-10s","SKU","Name","Availability");
		
		for(Device d: arrayDevice) //scans through all devices in the array list to get correct array
		{
			if(d.getName().equalsIgnoreCase(deviceName))
			{
				System.out.printf("\n%-10s %-10s %-10s",d.getSKU(),d.getName(),d.getAvailability());
			}	
		}
	}

	public void checkOutDevice() //Method that allows the user to check out the device
	{
		String deviceName;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n");
		
		System.out.printf("\n%-10s %-10s %-10s","SKU","Name","Availability");
		for(Device d: arrayDevice)
		{
			if(d.getAvailability() == true)
			{
				System.out.printf("\n%-10s %-10s %-10s",d.getSKU(),d.getName(),d.getAvailability());
			}
		}
		
		System.out.print("\n\nEnter the name of the device you would like to check out: ");
		deviceName = scan.nextLine();
		
		for(Device d: arrayDevice) //scans through all devices in the array list to get correct array
		{
			if(d.getName().equalsIgnoreCase(deviceName))
			{
				d.setAvailability(Boolean.parseBoolean("False"));
				System.out.printf("\nYou have checked out %s", d.getName());
			}
		}
	
	}
	
	public void checkInDevice() //Method that allows user to check in a device
	{
		String deviceName;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n");
		
		System.out.printf("\n%-10s %-10s %-10s","SKU","Name","Availability");
		for(Device d: arrayDevice)
		{
			if(d.getAvailability() == false)
			{
				System.out.printf("\n%-10s %-10s %-10s",d.getSKU(),d.getName(),d.getAvailability());
			}
		}
		
		System.out.print("\n\nEnter the name of the device you would like to check In: ");
		deviceName = scan.nextLine();
		
		for(Device d: arrayDevice) //scans through all devices in the array list to get correct array
		{
			if(d.getName().equalsIgnoreCase(deviceName))
			{
				d.setAvailability(Boolean.parseBoolean("True"));
				System.out.printf("\nYou have checked out %s", d.getName());
			}
		}
	
	}
	
	public void menu() //Method that display a menu to let user pick a option
	{
		int option = 0;
		boolean menu = true;
		
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.print("\n1. Display a list of all Devices");
			System.out.print("\n2. Add a new Device");
			System.out.print("\n3. Edit Device");
			System.out.print("\n4. Display all Devices with the same name");
			System.out.print("\n5. Check out a Device");
			System.out.print("\n6. Check in a Device");
			System.out.print("\n7. Exit the program");
			
			System.out.print("\n\nEnter the Number you would like to preform: ");
			
			try //system from crase do to inproper input 
			{
				option = Integer.parseInt(scan.nextLine());
				if(option > 7 || option < 1) 
				{
					System.out.print("You did not choose one of the options. Try again");
				}
			}
			catch(NumberFormatException x)
			{
				System.out.print("You did not choose one of the options. Try again");
			}
		
			switch(option)
			{
				case 1:
				{
					showArrays();
					break;
				}
					
				case 2:	
				{
					newDevice();
					break;
				}
					
				case 3:
				{
					editDevice();
					break;
				}
				case 4:
				{
					showMatchingDevices();
					break;
				}
					
				case 5:
				{
					checkOutDevice();
					break;
				}
				
				case 6:
				{
					checkInDevice();
					break;
				}
					
				case 7:
				{
					menu = false;
					break;
				}
			}
			System.out.print("\n");
		}
		while(menu);
	}

}
