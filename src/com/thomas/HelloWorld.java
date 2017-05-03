public class HelloWorld { 

	private static final String HELLO_WORLD = "Hello World!";

	public static void main(String[] args) { 
		System.out.println(HELLO_WORLD);
		String[][] countries = new String[10][2];

		countries[0][0] = "Germany";
		countries[0][1] = "Europa";

		writeOutCountry(countries[0][0], countries[0][1]);
	}

	private void writeOutCountry(String countryName, String continent) { 
		System.out.println("The country is "+countryName+", and it is located in "+continent);
	}
}
