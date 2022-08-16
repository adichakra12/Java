package com.adityachakravarthi.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.adityachakravarthi.dojosandninjas.models.Ninja;
import com.adityachakravarthi.dojosandninjas.services.DojoAndNinjaService;

@Controller
public class NinjaController {
	
	@Autowired
	private DojoAndNinjaService ns;
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("newNinja")Ninja ninja, Model model) {
		model.addAttribute("dojos", ns.allDojos());
		return "addNinja.jsp";
	}
	
	@PostMapping("/ninjas/add")
	public String addNinja(@Valid@ModelAttribute("newNinja")Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "addNinja.jsp";
		}
		else {
			ns.addNinja(ninja);
			return "redirect:/dojos";
		}
	}
	
	
	
	
}
