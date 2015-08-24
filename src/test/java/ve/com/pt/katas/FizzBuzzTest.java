package ve.com.pt.katas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fb;
	
	@Before
	public void initTest() {
		fb = new FizzBuzz();
	}
	
	@Test
	public void nonThreeOrFiveMultiplerShowNUmber() {
		assertEquals("1", fb.getFizzBuzz(1));
	}
	
	@Test
	public void divisibleByThreeShowFizz() {
		assertEquals(FizzBuzz.FIZZ, fb.getFizzBuzz(3));
		assertEquals(FizzBuzz.FIZZ, fb.getFizzBuzz(9));
		assertEquals(FizzBuzz.FIZZ, fb.getFizzBuzz(18));
	}
	
	@Test
	public void divisibleByFiveShowBuzz() {
		assertEquals(FizzBuzz.BUZZ, fb.getFizzBuzz(5));
		assertEquals(FizzBuzz.BUZZ, fb.getFizzBuzz(10));
	}
	
	@Test
	public void divisibleByThreeAndFiveShowFizzBuzz() {
		assertEquals(FizzBuzz.FIZZ_BUZZ, fb.getFizzBuzz(15));
		assertEquals(FizzBuzz.FIZZ_BUZZ, fb.getFizzBuzz(30));
	}
}
