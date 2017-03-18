import java.math.BigDecimal;

public class City {

	private int id;
	private int population;
	private String name;
	private String cc;
	private String district;

	public City(int id, String name, String cc, String district, int population)
	{
		this.id = id;
		this.name = name;
		this.cc = cc;
		this.district = district;
		this.population = population;
	}

	/**
	 *
	 *  Methods for call
	 */

	public int getID(){
		return id;
	}

	public int getPopulation(){
		return population;
	}

	public String getName(){
		return name;
	}

	public String getCC(){
		return cc;
	}

	public String getDistrict(){
		return district;
	}

	// toString method
	public String toString(){
		return String.format("City [ID=%s, name=%s, CountryCode=%s, District=%s]",
							id, name, cc, district);
	}


}
