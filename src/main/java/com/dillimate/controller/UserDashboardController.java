package com.dillimate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dillimate.entities.Cafe;
import com.dillimate.entities.Clinic;
import com.dillimate.entities.Driver;
import com.dillimate.entities.Guide;
import com.dillimate.entities.Hotel;
import com.dillimate.entities.Monument;
import com.dillimate.entities.Museum;
import com.dillimate.entities.Restaurant;
import com.dillimate.service.CabService;
import com.dillimate.service.CafeService;
import com.dillimate.service.GuideService;
import com.dillimate.service.HealthService;
import com.dillimate.service.HotelService;
import com.dillimate.service.MonumentService;
import com.dillimate.service.MuseumService;
import com.dillimate.service.RestaurantService;

@Controller
public class UserDashboardController {
	
	@Autowired
	private MuseumService museumService;
	
	@Autowired
	private MonumentService monumentService;
	
	@Autowired
	private CafeService cafeService;
	
	@Autowired
	private RestaurantService restaurantService;
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private HealthService healthService;
	
	@Autowired
	private CabService cabService;
	
	@Autowired
	private GuideService guideService;
	
	// Show user dashboard page
	@GetMapping("/user/dashboard/{role}/{id}")
	public String getUserDashboard(@PathVariable("id") Long id, 
			@PathVariable("role") String role, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("role", "USER");
		return "userDashboard";
	}
			
	// show dashboard header
	@GetMapping("/dashboard/header")
	public String getDashboardHeader() {
		return "dashboardHeader";
    }
	
	// show select location type
	@GetMapping("/dashboard/show/locations/{role}/{id}")
	public String getLocations(@PathVariable("id") Long id, 
			 @PathVariable("role") String role, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("role", role);
		return "location";	
	}
	
	// show the list of museum
	@GetMapping("/dashboard/show/museumList/{role}/{id}")
	public String getMuseumList(@PathVariable("id") Long id, 
			@PathVariable("role") String role, Model model) {
		List<Museum> museums = museumService.getListOfMuseumDetails();
		model.addAttribute("museums", museums);
		model.addAttribute("id", id);
		model.addAttribute("role", role);
		if(role.equalsIgnoreCase("USER")) {
			return "museumList";
		}else {
			return "museumCRUD";
		}		
	}
	
	// show the list of monument
	@GetMapping("/dashboard/show/monumentList/{role}/{id}")
	public String getMonumentList(@PathVariable("id") Long id, 
			@PathVariable("role") String role, Model model) {
		List<Monument> monuments = monumentService.getListOfMonumentDetails();
		model.addAttribute("monuments", monuments);
		model.addAttribute("id", id);
		model.addAttribute("role", role);
		if(role.equalsIgnoreCase("USER")) {
			return "monumentList";			
		}else {
			return "monumentCRUD";
		}	
	}
	
	// show select type of food places
	@GetMapping("/dashboard/show/food/{role}/{id}")
	public String getFoodPlaces(@PathVariable("id") Long id, 
			@PathVariable("role") String role, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("role", role);
		return "food";		
	}
	
	// show the list of cafe
	@GetMapping("/dashboard/show/cafeList/{role}/{id}")
	public String getCafeList(@PathVariable("id") Long id,
		   @PathVariable("role") String role, Model model) {
		List<Cafe> cafes = cafeService.getListOfCafeDetails();
		model.addAttribute("cafes", cafes);
		model.addAttribute("id", id);
		model.addAttribute("role", role);
		if(role.equalsIgnoreCase("USER")) {
			return "cafeList";
		}else {
			return "cafeCRUD";
		}
	}
		
	// show the list of restaurant
	@GetMapping("/dashboard/show/restaurantList/{role}/{id}")
	public String getRestaurantList(@PathVariable("id") Long id,
		   @PathVariable("role") String role, Model model) {
		List<Restaurant> restaurants = restaurantService.getListOfRestaurantDetails();
		model.addAttribute("restaurants", restaurants);
		model.addAttribute("id", id);
		model.addAttribute("role", role);
		if(role.equalsIgnoreCase("USER")) {
			return "restaurantList";
		}else {
			return "restaurantCRUD";
		}	
	}
	
	// show the list of hotels
    @GetMapping("/dashboard/show/hotelList/{role}/{id}")
	public String getHotelList(@PathVariable("id") Long id,
			@PathVariable("role") String role, Model model) {
		List<Hotel> hotels = hotelService.getListOfHotelDetails();
		model.addAttribute("hotels", hotels);
		model.addAttribute("role", role);
		model.addAttribute("id", id);
		if(role.equalsIgnoreCase("USER")) {
			return "hotelList";
		}else {
			return "hotelCRUD";
		}		
	}
    
    // show the list of hospitals and clinics
    @GetMapping("/dashboard/show/clinicList/{role}/{id}")
	public String getHospitalsAndClinicList(@PathVariable("id") Long id,
		   @PathVariable("role") String role, Model model) {
		List<Clinic> clinics = healthService.getListOfClinicDetails();
		model.addAttribute("clinics", clinics);
		model.addAttribute("role", role);
		model.addAttribute("id", id);	
		if(role.equalsIgnoreCase("USER")) {
			return "healthList";
		}else {
			return "healthCRUD";	
		}
	}
    
    // show the list of cab drivers
    @GetMapping("/dashboard/show/cabList/{role}/{id}")
	public String getCabDriversList(@PathVariable("id") Long id,
		   @PathVariable("role") String role, Model model) {
		List<Driver> drivers = cabService.getListOfCabDriverDetails();
		model.addAttribute("drivers", drivers);
		model.addAttribute("role", role);
		model.addAttribute("id", id);
		if(role.equalsIgnoreCase("USER")) {
			return "cabList";
		}else {
		    return "cabCRUD";	
		}
	}
    
    // show the list of tourist guides
    @GetMapping("/dashboard/show/guideList/{role}/{id}")
	public String getTouristGuidesList(@PathVariable("id") Long id,
		   @PathVariable("role") String role, Model model) {
		List<Guide> guides = guideService.getListOfTouristGuideDetails();
		model.addAttribute("guides", guides);
		model.addAttribute("role", role);
		model.addAttribute("id", id);		
		if(role.equalsIgnoreCase("USER")) {
			return "guideList";
		}else {
			return "guideCRUD";
		}
	}    
}
