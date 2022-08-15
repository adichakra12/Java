package com.adityachakravarthi.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.adityachakravarthi.savetravels.models.Travel;
import com.adityachakravarthi.savetravels.services.TravelService;

@Controller
public class TravelController {
	
	@Autowired
	private TravelService ts;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/travels";
	}
	
	@GetMapping("/travels")
	public String travels(Model model) {
		List<Travel> allTravels = ts.allTravels();
		model.addAttribute("travels", allTravels);
		return "index.jsp";
	}
	
	@GetMapping("/travels/new")
	public String newTravel(@ModelAttribute("newTravel") Travel newTravel) {
		return "newTravel.jsp";
	}
	
	@PostMapping("/travels/create")
	public String createTravel(@Valid@ModelAttribute("newTravel")Travel newTravel, BindingResult result) {
		if (result.hasErrors()) {
            return "newTravel.jsp";
        } else {
            ts.createTravel(newTravel);
            return "redirect:/travels";
        }
	}
	@GetMapping("travels/{id}")
	public String oneTravel(@PathVariable("id")Long id, Model model) {
		model.addAttribute("travel", ts.oneTravel(id));
		return "oneTravel.jsp";
	}
	
	@GetMapping("travels/{id}/edit")
	public String editTravel(@PathVariable("id")Long id, Model model) {
		model.addAttribute("travel", ts.oneTravel(id));
		return"editTravel.jsp";
	}

	@PutMapping("/travels/{id}/update")
	public String updateTravel(@Valid@ModelAttribute("travel")Travel travel, BindingResult result, @PathVariable("id")Long id) {
		if (result.hasErrors()) {
            return "editTravel.jsp";
        } else {
            ts.createTravel(travel);
            return "redirect:/travels/" + id;
        }
	}
	
	@DeleteMapping("/travels/{id}/delete")
	public String deleteExpense(@PathVariable("id")Long id) {
		ts.deleteTravel(id);
		return "redirect:/travels";
	}

}
