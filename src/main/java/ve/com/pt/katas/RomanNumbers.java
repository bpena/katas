package ve.com.pt.katas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RomanNumbers {
	@SuppressWarnings("serial")
	private static Map<Integer, String> mapa = new LinkedHashMap<Integer, String>(){{
		put(10000, "Z");
		put(9000, "MZ");
		put(5000, "W");
		put(4000, "MW");
		put(1000, "M");
		put(900, "CM");
		put(500, "D");
		put(400, "CD");
		put(100, "C");
		put(90, "XC");
		put(50, "L");
		put(40, "XL");
		put(10, "X");
		put(9, "IX");
		put(5, "V");
		put(4, "IV");
		put(1, "I");
	}};
	
	public String integerToRoman(Integer value) {
		String result = "";
		if (value < 1)
			return result;
		else
			for (Entry<Integer, String> entry : mapa.entrySet()) {
				if (value >= entry.getKey()) {
					result = entry.getValue();
					result += integerToRoman(value - entry.getKey());
					return result;
				}
			}
		return result;
	}
}
