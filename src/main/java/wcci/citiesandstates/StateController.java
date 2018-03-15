package wcci.citiesandstates;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {
	@Resource
	private StateRepository stateRepo; 
	
//	@RequestMapping("/show-states")
//	public String findAllStates(Model model) {
//		model.addAttribute("states", stateRepo.findAll());
//		return "states"; 
//	}
	
	@RequestMapping("/states/{id}")
	public State findOneState(@PathVariable long id) {
		return stateRepo.findOne(id); 
	}
	
	@RequestMapping("/")
	public Iterable<State> findAllStates() {
		return stateRepo.findAll(); 
	}

}
