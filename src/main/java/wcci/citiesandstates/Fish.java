package wcci.citiesandstates;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Fish {
	
	@Id
	@GeneratedValue
	private Long id; 
	private String name; 
	private String binomial; 
	private String imgUrl; 
	
	@OneToMany(mappedBy = "fish")
	public State state; 
	
	public Fish() {}
	
	public Fish(String name, String binomial, String imgUrl, State state) {
		this.name = name; 
		this.binomial = binomial; 
		this.imgUrl = imgUrl; 
		this.state = state; 
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
}
