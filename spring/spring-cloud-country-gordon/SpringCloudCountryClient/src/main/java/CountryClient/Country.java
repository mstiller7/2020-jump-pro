package CountryClient;

import java.util.ArrayList;


public class Country {
	
	static ArrayList<Country> countries;
	
	public static void init() {
		
		countries = new ArrayList<>();
		
		countries.add(new Country("USA", "Washington D.C.", 330149796));
		countries.add(new Country("Canada", "Ottawa", 37665546));
		countries.add(new Country("Mexico", "Mexico City", 128620609));
		countries.add(new Country("Greenland", "Nuuk", 56770));
		countries.add(new Country("Iceland", "Reykjavik", 340739));
		
	}
	

	private String name;
	private String capital;
	private int population;
	
	public Country(String name, String capital, int population) {
		this.name = name;
		this.capital = capital;
		this.population = population;
	}
	
	public Country() {
	}
	
	public String getName() {
		return name;
	}
	
	public String getCapital() {
		return capital;
	}
	
	public int getPopulation() {
		return population;
	}
	
}