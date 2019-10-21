
public class P1Driver {

	public static void main(String[] args) {
		//welcome message
		System.out.println("Welcome to Carter's Coffee Shop");
		System.out.println();
		//instantiate and making the name of drinks in the shop with labels(: " +) to flow better and clearer
		//five drinks with description of each drink
		CoffeeShop cShop = new CoffeeShop("Carter's Coffee");
		cShop.addDrink("Coffee", "Medium or Dark Roast", 3.55);
		cShop.addDrink("Sweet Tea", "Tea with sugar", 1.01);
		cShop.addDrink("Fountain Drink", "Your choice of Coca Cola products", 2.05);
		cShop.addDrink("Hot Tea", "Hot tea to help replenish you", 2.55);
		cShop.addDrink("Adult Hot Chocolate", "Hot chocolate with an extra kick", 4.05);
		//print lines above, using a for loop to be more efficient,  declare totalCost 
		System.out.println("Shop Name: " + cShop.getshopName());
		double totalCost = 0;
		for(int i = 0; i < cShop.getcounter(); i++) {
			System.out.println(i + 1);
			System.out.println("Drink Name: " + cShop.getDrinkName(i));
			System.out.println("Drink Description: " + cShop.getDrinkDescription(i));
			System.out.println("Drink Cost: $" + cShop.getDrinkCost(i));
			totalCost += cShop.getDrinkCost(i);
			//for loop prints all the above drinks and total cost declaration
		}
		//declaring average calculation and printing out average
		//had to figure out how to print out to two decimal places (* 100.0) / 100.0)
		double average = totalCost / cShop.getcounter();
		System.out.println("The average is $" + Math.round(average * 100.0) / 100.0);
		System.out.println();
		//goodbye message
		System.out.println("Thank you for coming and come back soon!");
	}
	
}
