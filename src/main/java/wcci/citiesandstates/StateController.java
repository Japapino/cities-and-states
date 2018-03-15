package wcci.citiesandstates;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StateController {
	@Resource
	StateRepository stateRepo; 
	
	@RequestMapping("/show-states")
	public String findAllStates(Model model) {
		model.addAttribute("states", stateRepo.findAll());
		return "states"; 
	}

}
