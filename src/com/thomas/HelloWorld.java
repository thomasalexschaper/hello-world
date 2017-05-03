public class HelloWorld { 

	private static final String HELLO_WORLD = "Hello World!";

	public static void main(String[] args) { 
		System.out.println(HELLO_WORLD);

		WorldObject france = new WorldObject("France", "Europa", "German");
		WorldObject germany = new WorldObject("Germany", "Europa", "French");
		WorldObject southAfrica = new WorldObject("South Africa", "Africa", "Afrikaans");
		WorldObject chile = new WorldObject("Chile", "America", "Spanish");

		print(france);
		print(germany);	
	}

	private static void print(WorldObject object) { 
		System.out.println("This country with the name "
			+object.getCountryName()+
			" is located in "+object.getContinent());
	}
}
