public class WorldObject { 

	private String countryName;
	private String continent;

	public WorldObject (String countryName, String continent) { 
		this.countryName = countryName;
		this.continent = continent;
	}


	private String getCountryName() { 
		return countryName;
	}

	private void setCountryName(String countryName) { 
		this.countryName = countryName;
	}

	private String getContinent() { 
		return continent;
	}

	private void setContinent(String continent) { 
		this.continent = continent;
	}

}