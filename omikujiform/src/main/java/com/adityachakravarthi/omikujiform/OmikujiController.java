package com.adityachakravarthi.omikujiform;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class OmikujiController {
	
	@GetMapping("/")
	public String index() {
		
		return "index.jsp";
	}
	@PostMapping("/submit")
	public String submitForm(
			@RequestParam(value = "years") int years,
			@RequestParam(value = "city") String city,
			@RequestParam(value = "person") String person,
			@RequestParam(value = "profession") String profession,
			@RequestParam(value = "thing") String thing,
			@RequestParam(value = "letter") String letter,
			HttpSession session) {
		session.setAttribute("years", years);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("profession", profession);
		session.setAttribute("thing", thing);
		session.setAttribute("letter", letter);
				return "redirect:/show";
		
	}
	
	@GetMapping("/show")
	public String showForm(HttpSession session, Model model) {
		model.addAttribute("years", session.getAttribute("years"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("person", session.getAttribute("person"));
		model.addAttribute("profession", session.getAttribute("profession"));
		model.addAttribute("thing", session.getAttribute("thing"));
		model.addAttribute("letter", session.getAttribute("letter"));
		return "show.jsp";
	}

}
