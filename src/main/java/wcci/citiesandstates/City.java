package wcci.citiesandstates;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class City {
	
	@Id
	@GeneratedValue
	private Long id; 
	private String name;
	private int population; 
	
	@OneToOne(mappedBy = "city")
	private State state; 
	
	public City() {}
	
	public City (String name, int population) {
		this.name = name; 
		this.population = population; 
	}
	
	public String getName() {
		return name; 
	}
	
	public int getPopulation() {
		return population; 
	}
	
	public State getState() {
		return state; 
	}

}
