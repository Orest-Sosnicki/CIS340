//Orest Sosnicki, CIS340, 1:30, A6
import java.util.Scanner;

public class FruitBasket {
	
	private Apple apple;
	private Banana banana;
	private String basketName;
	
	public String getBasketName()
	{
		return this.basketName;
	}
	
	public void setBasketName(String basketName)
	{
		this.basketName = basketName;
	}
	
	public void makeFruit()
	{
		apple = new Apple(1.5);
		banana = new Banana(3.5);
		
		apple.setPeelThickness(1);
		banana.setPeelThickness(4);
		
	}
	
	public void eatFruits()
	{
		double amountToEat;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\t\t\t\t" + getBasketName().toUpperCase()+"\n");
		
		System.out.printf("You have a Apple and a banana in your %s basket",getBasketName());
		
		System.out.print("\nHow much of the apple would you like to eat? ");
		amountToEat = Double.parseDouble(scan.nextLine());
		apple.eat(amountToEat);
		
		System.out.print("How much of the banana would you like to eat? ");
		amountToEat = Double.parseDouble(scan.nextLine());
		banana.eat(amountToEat);
		
		System.out.printf("\nYou have %.2f of your apple and %.2f of your bannan left in your %s basket\n",apple.getPercentLeft(),banana.getPercentLeft(),getBasketName());
		
	}

}
