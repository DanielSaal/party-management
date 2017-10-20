package br.com.dsa.party.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.dsa.party.model.Guest;
import br.com.dsa.party.repository.GuestsRepository;

@Controller
@RequestMapping("/guests")
public class GuestController {
	
	@Autowired
	private GuestsRepository guestsRepo;

	@GetMapping
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("guestList");
		mav.addObject(new Guest());
		mav.addObject("guests", guestsRepo.findAll());
		
		return mav;
	}
	
	@PostMapping
	public String save(Guest guest) {
		guestsRepo.save(guest);
		
		return "redirect:/guests";		
	}
}
