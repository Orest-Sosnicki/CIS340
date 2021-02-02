//Orest Sosnicki, CIS340, 1:30, A6

public class PicnicSystem {

	public static void main(String[] args) {
		
		PicnicSystem myPicnicSystem = new PicnicSystem();
		
		myPicnicSystem.makeFruitBasket();
	}
	
	private void makeFruitBasket()
	{
		FruitBasket basket1 = new FruitBasket();
		FruitBasket basket2 = new FruitBasket();
		
		basket1.setBasketName("Weekend");
		basket1.makeFruit();
		basket1.eatFruits();
		
		basket2.setBasketName("Weekday");
		basket2.makeFruit();
		basket2.eatFruits();
	}

}
