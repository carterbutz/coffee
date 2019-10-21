//taken from Test_Group.java
import static org.junit.Assert.*;

import org.junit.Test;

public class Test_CoffeeShop {

	@Test
	public void testEmptyConstructor() {
		CoffeeShop cShop = new CoffeeShop();
		assertTrue( cShop != null);
	}
	//testing name on nonempty
	@Test
	public void testNonEmptyConstruct() {
		CoffeeShop cShop = new CoffeeShop("Carter's Coffee");
		assertEquals("Carter's Coffee", cShop.getshopName());
	}	
	//addDrink,getDrinkName from CoffeeShop class to return the first Drink (index 0)
	@Test
	public void testaddDrink() {
		CoffeeShop cshop = new CoffeeShop();
		cshop.addDrink("Coffee", "Medium or Dark Roast, size: small or medium", 2.50);
		assertEquals("Coffee", cshop.getDrinkName(0));
	}
	//testing the counter used in addDrink to make sure it returns the # of drinks asked
	@Test
	public void testcounter() {
		CoffeeShop cshop = new CoffeeShop("Carter's Coffee");
		cshop.addDrink("Coffee", "Medium or Dark Roast, size: small or medium", 2.50);
		cshop.addDrink("Adult Hot Chocolate", "Hot chocolate with an extra kick", 4.00);
		assertEquals(2, cshop.getcounter());
	}
	//shop name from nonemptyconstructor code
	@Test
	public void testgetShopName() {
		CoffeeShop cShop = new CoffeeShop("Carter's Coffee");
		assertEquals("Carter's Coffee", cShop.getshopName());
	}	
	//testing drink description properly displays for drink entered
	public void testgetDrinkDescription() {
		CoffeeShop cShop = new CoffeeShop("Carter's Coffee");
		cShop.addDrink("Coffee", "Medium or Dark Roast, size: small or medium", 2.50);
		assertEquals("Medium or Dark Roast, size: small or medium", cShop.getDrinkDescription(0));
	}	
	//testing DrinkCost prints properly
	public static final double DELTA = 1e-12;
	//used a constant for assertEquals(expected, actual, range)
	@Test
	public void testgetDrinkCost() {
		CoffeeShop cshop = new CoffeeShop("Carter's Coffee");
		cshop.addDrink("Coffee", "Medium or Dark Roast, size: small or medium", 2.50);
		assertEquals(2.50, cshop.getDrinkCost(0), DELTA);
	}
	
}
