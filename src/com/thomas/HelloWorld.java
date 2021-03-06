public class HelloWorld { 

	private static final String HELLO_WORLD = "Hello World!";

	public static void main(String[] args) { 
		System.out.println(HELLO_WORLD);

		WorldObject france = new WorldObject("France", "Europa");
		WorldObject germany = new WorldObject("Germany", "Europa");
		WorldObject italia = new WorldObject("Italia", "Europa");

		print(france);
		print(germany);	
		print(italia);
	}

	private static void print(WorldObject object) { 
		System.out.println("This country with the name "
			+object.getCountryName()+
			" is located in "+object.getContinent());
	}
}
