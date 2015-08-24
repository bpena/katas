package ve.com.pt.katas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private StringCalculator calc;
	
	@Before
	public void initClass() {
		// Clase a probar
		calc = new StringCalculator();
	}
	
	@Test
	public void voidStringReturnZero() throws Throwable {
		assertEquals(0, calc.Add(""));
	}
	
	@Test
	public void singleValueReturnValue() throws Throwable {
		assertEquals(1, calc.Add("1"));
	}
	
	@Test
	public void multiValuesReturnSum() throws Throwable {
		assertEquals(3, calc.Add("1,2"));
		assertEquals(6, calc.Add("1,2,3"));
	}
	
	@Test
	public void allowHandleNewLinesBetweenNumbers() throws Throwable {
		assertEquals(6, calc.Add("1\n2,3"));
		assertEquals(6, calc.Add("1\n2\n3"));
	}

	@Test
	public void allowChangeDelimiters() throws Throwable {
		assertEquals(5, calc.Add("//;\n2;3"));
		assertEquals(6, calc.Add("//;\n1\n2\n3"));
		assertEquals(6, calc.Add("//;\n1\n2;3"));
	}
	
	@Test (expected = Exception.class)
	public void notAllowNegativeNumbers() throws Throwable {
		calc.Add("//;\n1\n2;-3");
//	    thrown.expect( Exception.class );
//	    thrown.expectMessage("negatives not allowed");
	}
}
