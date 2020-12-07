package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

public class testEncapsulate {
	EncapsulateTheData etd = new EncapsulateTheData();
	@Test
	public void testItemsRecieved() {
		etd.setItemsRecieved(-10);
		assertEquals(0, etd.getItemsReceived());
	}
	@Test
	public void testDegreesTurned() {
		etd.setDegreesTurned(999);
		assertNotEquals(999, etd.getDegreesTurned());
	}
	@Test public void testNomenclature() {
		
	}
}
class runner{
	static testEncapsulate t = new testEncapsulate();
	public static void main(String[] args) {
		 t.testItemsRecieved();
	 }
}
