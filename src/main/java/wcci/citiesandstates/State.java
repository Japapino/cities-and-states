package wcci.citiesandstates;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class State {
	
	@Id
	@GeneratedValue
	private Long id; 
	private String name;
	private String abbrev;
	private String motto;
	
	@ManyToOne
	public Fish fish; 
	
	@OneToOne
	public City city; 
	
	public State () {}
	
	public State (String name, String abbrev, City city, String motto, Fish fish) {
		this.name = name;
		this.abbrev = abbrev;
		this.city = city; 
		this.motto = motto;
		this.fish = fish; 
		
	}
	
	public Long getId() {
		return id; 
	}
	
	public String getName() {
		return name; 
	}
	
	public String getAbbrev() {
		return abbrev; 
	}
	
	public City getCity() {
		return city; 
	}

	public String getMotto() {
		return motto;
	}
	
	public Fish getFish() {
		return fish; 
	}
	

}
