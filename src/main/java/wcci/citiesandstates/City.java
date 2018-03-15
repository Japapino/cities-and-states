package wcci.citiesandstates;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class City {
	
	@Id
	@GeneratedValue
	private Long id; 
	private String name;
	private int population; 
	
	@JsonIgnore
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
