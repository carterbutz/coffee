
public class CoffeeShop {
//use counter for array
	//declare private variables + array
	private String shopName;
	private Drink[] dri = new Drink[10];
	private int counter = 0;
	//methods for names
	public CoffeeShop() {
		shopName = "";
	}
	//set shop name similar to Person.java
	public CoffeeShop(String name) {
		shopName = name;
	}
	//method addDrink to add drink from p1 in String, String, double, array with counter incrementing
	public void addDrink(String name, String description, double cost) {
		dri[counter] = new Drink(name, description, cost);
		//instantiating the array with a string, string, double format
		counter++;
	}
	//class attributes declared in instructions
	//Getters for the shopName, Drink, description, being passed in and cost allowing to test in the test_CoffeeShop
	public int getcounter() {
		return counter;
	}
	
	public String getshopName() {
		return shopName;
	}
	
	public String getDrinkName(int index) {
		return dri[index].getName();
	}
	
	public String getDrinkDescription(int index) {
		return dri[index].getDescription();
	}
	
	public double getDrinkCost(int index) {
		return dri[index].getCost();
	}
}
