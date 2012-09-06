import junit.framework.Assert;
import org.junit.Test;

public class TestDeliveryCosts {

	@Test
	public void DeliveryNormalTest() {
		// gewicht 10, volumen 10
		Delivery d = new Delivery("normal", 10.0f, 10.0f);
		Assert.assertEquals(d.getTotalCosts(), 31.5f);
		
		// gewicht 10, volumen 8
		d.setGewicht(10f);
		d.setVolumen(8f);
		Assert.assertEquals(d.getTotalCosts(), 19.5f);
	
		// gewicht 2, volumen 2
		d.setGewicht(2f);
		d.setVolumen(2f);
		Assert.assertEquals(d.getTotalCosts(), 9.9f);
		
		// gewicht 2, volumen 15
		d.setGewicht(2f);
		d.setVolumen(15f);
		Assert.assertEquals(d.getTotalCosts(), 37.9f);
	}
	

	@Test
	public void DeliveryPrimeTest() {
		// gewicht 10, volumen 10
		Delivery d = new Delivery("prime", 10.0f, 10.0f);
		Assert.assertEquals(d.getTotalCosts(), 37.5f);		
		
		// gewicht 10, volumen 8
		d.setGewicht(10f);
		d.setVolumen(8f);
		Assert.assertEquals(d.getTotalCosts(), 25.5f);
	
		// gewicht 2, volumen 2
		d.setGewicht(2f);
		d.setVolumen(2f);
		Assert.assertEquals(d.getTotalCosts(), 16.2f);
		
		// gewicht 2, volumen 15
		d.setGewicht(2f);
		d.setVolumen(15f);
		Assert.assertEquals(d.getTotalCosts(), 44.2f);
	}
}
