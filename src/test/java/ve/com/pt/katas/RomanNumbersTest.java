package ve.com.pt.katas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RomanNumbersTest {
	RomanNumbers rn;
	
	@Before
	public void initialize() {
		rn = new RomanNumbers();
		
	}
	
	@Test
	public void basicNumeralsTest() {
		assertEquals("I", rn.integerToRoman(1));
		assertEquals("V", rn.integerToRoman(5));
		assertEquals("X", rn.integerToRoman(10));
		assertEquals("L", rn.integerToRoman(50));
		assertEquals("C", rn.integerToRoman(100));
		assertEquals("D", rn.integerToRoman(500));
		assertEquals("M", rn.integerToRoman(1000));
	}
	
	@Test
	public void concatenatesNumeralsTest() {
		assertEquals("II", rn.integerToRoman(2));
		assertEquals("III", rn.integerToRoman(3));
		assertEquals("XX", rn.integerToRoman(20));
		assertEquals("XXX", rn.integerToRoman(30));
		assertEquals("CC", rn.integerToRoman(200));
		assertEquals("CCC", rn.integerToRoman(300));
	}
	
	@Test
	public void complexExamplesTest() {
		assertEquals("IV", rn.integerToRoman(4));
		assertEquals("IX", rn.integerToRoman(9));
		assertEquals("MCMXCIX", rn.integerToRoman(1999));
	}
}
