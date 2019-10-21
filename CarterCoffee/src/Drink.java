/*
Name: Carter Butz
Current Date: February 14, 2018
Sources Consulted: https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
https://stackoverflow.com/questions/7456462/what-does-the-operator-do-in-java
Group.java, Person.java, Test_Group.java, Test_Group.Person used to help find code

By submitting this work, I attest that it is my original work and that I did not violate the University of Mississippi academic policies set forth in the M book.
*/

public class Drink {
	//name of drink, then description, then cost
	private String name;
	private String description;
	private double cost;
	
	//Constructors
//	public Drink()  {
//		name = "Coffee";
//		description = "Medium or Dark Roast, Size: small or medium";
//		cost = 2.50;
//	}
	
	public Drink() {
		name = "";
		description = "";
		cost = 0.0;
	}
	
	public Drink(String Name, String Description, double Cost) {
		//shadowing
		this.name = Name;
		this.description = Description;
		this.cost = Cost;
	}
	
	//Setters (all similar to Person.java and Group.java
	public void setName(String Name) {
		this.name = Name;
	}
	//setting description for Drink being passed
	public void setDescription(String Description) {
		this.description = Description;
	}
	//setting cost being passed  
	public void setCost(double Cost) {
		this.cost = Cost;
	}
	//Getters - returning what is being set (similar to Person.java and Group.java
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	
}
