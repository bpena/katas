package ve.com.pt.katas;

public class StringCalculator {
	public int Add(String value) throws Throwable {
		int result = 0;
		int valor;
		
		String delimiter = this.getDelimiters(value);
		value = value.replaceAll("//"+delimiter+"\n", "");

		String[] valueArr = value.split("["+delimiter+"\\n]");
		
		for (int i=0; i < valueArr.length; i++) {
			if (!valueArr[i].isEmpty()) {
				valor = Integer.parseInt(valueArr[i]);
				if (valor < 0)
					throw new Exception("negatives not allowed");
				result += valor;
			}
		}
		
		return result;
	}
	
	public String getDelimiters(String value) {
		String delimiter = ",";
		if (value.startsWith("//")) 
			delimiter = value.substring(2, value.indexOf("\n"));
		
		return delimiter;
	}
}
