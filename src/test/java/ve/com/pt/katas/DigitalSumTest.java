package ve.com.pt.katas;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitalSumTest {
	@Test
	public void oneResultOne() throws Exception {
		assertEquals(1, digitalSum(1));
	}
	
	@Test
	public void twoResultTwo() throws Exception {
		assertEquals(2, digitalSum(2));
	}
	
	@Test
	public void twentyResultTwo() throws Exception {
		assertEquals(2, digitalSum(20));
	}
	
	@Test
	public void fiftyfiveResultOne() throws Exception {
		assertEquals(1, digitalSum(55));
	}
	
	@Test
	public void fiveFiveFiveResultSix() throws Exception {
		assertEquals(6, digitalSum(555));
	}
	
	private int digitalSum(int value) {
		for (;(value = value / 10 + value % 10) > 9;);
		return value;
	}
}
