package it.corsojava.dstech.PuntoCinque;

/*
 * scrivere una classe (seguendo il db di esempio) che rappresenti le città con tutti 
 * i metodi minimali (equals, tostring) e con un ordinamento naturale sulla popolazione.
 * */
 
public class City implements Comparable<City>{
	
	private int id;
	private String name;
	private String countryCode;
	private String district;
	private int population;
	
	public City(int id, String name, String countryCode, String district, int population) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof City)) {
			return false;
		}
		City other = (City) obj;
		if (countryCode == null) {
			if (other.countryCode != null) {
				return false;
			}
		} else if (!countryCode.equals(other.countryCode)) {
			return false;
		}
		if (district == null) {
			if (other.district != null) {
				return false;
			}
		} else if (!district.equals(other.district)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (population != other.population) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "City [id = " + id + ", name = " + name + ", countryCode = " + countryCode + ", district = " + district
				+ ", population = " + population + "]";
	}

	public int compareTo(City o) {
		if(this.population > o.population) {
			return 1;
		}else if(this.population < o.population) {
			return -1;
		}else
			return 0;
	}
	
	
}
