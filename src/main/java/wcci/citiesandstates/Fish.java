package wcci.citiesandstates;

import java.util.Collection;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Embeddable
public class Fish {
	

	private String name; 
	private String binomial; 
	private String imgUrl; 
	
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
	
}
