//taken from test_Group.java
import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Drink {
	//testing empty and nonempty
	@Test
	public void testEmptyConstructor() {
		Drink dri = new Drink();
		assertTrue( dri != null);
	}
	
	@Test
	public void testNonEmptyConstruct() {
		Drink dri = new Drink("Coffee", "Medium or Dark Roast, Size: small or medium", 2.50);
		assertEquals("Coffee", dri.getName());
	}	
	
	@Test
	public void testSetName() {
		Drink dri = new Drink();
		dri.setName("Coffee");
		assertEquals("Coffee", dri.getName());
	}
	//testing description to make sure runs
	@Test
	public void testSetDescription() {
		Drink dri = new Drink();
		dri.setDescription("Medium or Dark Roast");
		assertEquals("Medium or Dark Roast", dri.getDescription());
	}
	//constant used for (expected, actual, range)of cost (double)
	public static final double DELTA = 1e-12;
	
	@Test
	public void testSetCost() {
		Drink dri = new Drink();
		dri.setCost(2.50);
		assertEquals(2.50, dri.getCost(), DELTA);
	}
	//testing the getname in string, string, double format
	@Test 
	public void testGetName() {
		Drink dri = new Drink("Coffee", "Medium or Dark Roast, Size: small or medium", 2.50);
		assertEquals("Coffee", dri.getName());
	}
	//testing getdescription in string, string, double format
	@Test
	public void testGetDescription() {
		Drink dri = new Drink("Coffee", "Medium or Dark Roast, Size: small or medium", 2.50);
		assertEquals("Medium or Dark Roast, Size: small or medium", dri.getDescription());
	}
	//identical to previous two testing cost this time
	@Test
	public void testGetCost() {
		Drink dri = new Drink("Coffee", "Medium or Dark Roast, Size: small or medium", 2.50);
		assertEquals(2.50, dri.getCost(), DELTA);
	}
}
