public class HelloWorld { 

	private static final String HELLO_WORLD = "Hello World!";

	public static void main(String[] args) { 
		System.out.println(HELLO_WORLD);
		WorldObject germany = new WorldObject("Germany", "Europa");
		WorldObject france = new WorldObject("France", "Europa");

		print(germany);
		print(france);

	}

	private static void print(WorldObject object) { 
		System.out.println("This country with the name "
			+object.getCountryName()+
			" is located in "+object.getContinent());
	}
}
