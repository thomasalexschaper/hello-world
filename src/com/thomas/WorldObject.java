public class WorldObject { 

	private String countryName;
	private String continent;
	private String language;

	public WorldObject (String countryName, String continent, String language) { 
		this.countryName = countryName;
		this.continent = continent;
		this.language = language;
	}


	public String getCountryName() { 
		return countryName;
	}

	public void setCountryName(String countryName) { 
		this.countryName = countryName;
	}

	public String getContinent() { 
		return continent;
	}

	public void setContinent(String continent) { 
		this.continent = continent;
	}

	public String getLanguage() { 
		return language;
	}

	public String setLanguage(String language) { 
		this.language = language;
	}

}