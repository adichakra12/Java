//package com.adityachakravarthi.savetravels.controllers;
//
//import java.util.List;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.adityachakravarthi.savetravels.models.Travel;
//import com.adityachakravarthi.savetravels.services.TravelService;
//
//@RestController
//public class TravelApi {
//	private final TravelService ts;
//	
//	public TravelApi(TravelService ts) {
//		this.ts = ts;
//	}
//	@GetMapping("/travels")
//	public List<Travel> getAllTravels(){
//		return ts.allTravels();
//	}
//	
//	@PostMapping("/travels/create")
//	public Travel createTravel(
//			@RequestParam(value = "title") String title,
//			@RequestParam(value = "description") String description,
//			@RequestParam(value = "vendor") String vendor,
//			@RequestParam(value = "amount") double amount) {
//		Travel travel = new Travel(title, description, vendor, amount);
//		return ts.createTravel(travel);
//	}
//
//}
