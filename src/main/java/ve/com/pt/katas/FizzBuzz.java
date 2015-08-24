package ve.com.pt.katas;

public class FizzBuzz {
	public static String FIZZ = "fizz";
	public static String BUZZ = "buzz";
	public static String FIZZ_BUZZ = "fizz buzz";
	
	public String getFizzBuzz(Integer value) {
		String result = "";
		if (isFizz(value) && isBuzz(value))
			result += FIZZ_BUZZ;
		else if (isFizz(value))
			result += FIZZ;
		else if (isBuzz(value))
			result += BUZZ;
		else
			result += value.toString();
		
		return result;
	}
	
	public Boolean isFizz(Integer value) {
		return value % 3 == 0;
	}
	
	public Boolean isBuzz(Integer value) {
		return value % 5 == 0;
	}
}
