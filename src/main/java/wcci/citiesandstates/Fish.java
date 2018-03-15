package wcci.citiesandstates;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fish {
	
	@Id
	@GeneratedValue
	private Long id; 
	private String name; 
	private String binomial; 
	private String imgUrl; 
	
	@OneToMany(mappedBy = "fish")
	public Collection<State> state; 
	
	public Fish() {}
	
	public Fish(String name, String binomial, String imgUrl) {
		this.name = name; 
		this.binomial = binomial; 
		this.imgUrl = imgUrl; 
	}
	
	public String getName() {
		return name; 
	}

	public String getBinomial() {
		return binomial; 
	}
	
	public String getImgUrl() {
		return imgUrl; 
	}
	
	public Collection<State> getState() {
		return state; 
	}
}
