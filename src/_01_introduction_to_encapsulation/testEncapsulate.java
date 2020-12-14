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
	@Test 
	public void testNomenclature() {
		etd.setNomenclature("");
		assertEquals(" ", etd.getNomenclature());
	}

	@Test
	public void testMemberObj() {
		String s = "e";
		etd.setMemberObj(s);
		assertNotEquals(s, etd.getMemberObj());
	}
class runner{
	final testEncapsulate t = new testEncapsulate();
	public void main(String[] args) {
		 t.testItemsRecieved();
	 }
}
}
