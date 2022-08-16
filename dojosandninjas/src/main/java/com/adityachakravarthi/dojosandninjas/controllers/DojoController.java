package com.adityachakravarthi.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.adityachakravarthi.dojosandninjas.models.Dojo;
import com.adityachakravarthi.dojosandninjas.services.DojoAndNinjaService;

@Controller
public class DojoController {
	
	@Autowired
	private DojoAndNinjaService ds;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/dojos";
	}
	
	@GetMapping("/dojos")
	public String dojos(Model model) {
		List<Dojo> dojos = ds.allDojos();
		model.addAttribute("dojos", dojos);
		return "index.jsp";
	}

	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("newDojo") Dojo newDojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojos/add")
	public String addDojo(@Valid@ModelAttribute("newTravel")Dojo newDojo, BindingResult result) {
		if (result.hasErrors()) {
            return "newDojo.jsp";
        } else {
            ds.createDojo(newDojo);
            return "redirect:/dojos";
        }
	}
	
	@GetMapping("/dojos/{dojoId}")
	public String showDojo(@PathVariable("dojoId") long id, Model model) {
		Dojo dojo = ds.getDojo(id);
		model.addAttribute("dojo", dojo);
		return "oneDojo.jsp";
	}

}
