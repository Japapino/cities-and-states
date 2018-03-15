package wcci.citiesandstates;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StatePopulator implements CommandLineRunner {
	
	@Resource
	private StateRepository stateRepo;
	
	@Resource 
	private FishRepository fishRepo; 
	
	@Resource
	private CityRepository cityRepo; 
	
	@Override
	public void run(String... args) throws Exception {
		
		Fish tuna = new Fish("Tuna","Tunacus","URL"); 
		fishRepo.save(tuna); 
		
		City columbus = new City("Columbus",123); 
		cityRepo.save(columbus); 
		
		State ohio = new State("Ohio", "OH", columbus, "Birthplace of aviation", tuna);
		stateRepo.save(ohio); 

	}

}
