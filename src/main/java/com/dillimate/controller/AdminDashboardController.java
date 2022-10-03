package com.dillimate.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
public class AdminDashboardController {
	
	@Autowired
	private MuseumService museumService;
	
	@Autowired
	private MonumentService monumentService;
	
	@Autowired
	private CafeService cafeService;
	
	@Autowired
	private RestaurantService restService;
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private HealthService healthService;
	
	@Autowired
	private CabService cabService;
	
	@Autowired
	private GuideService guideService;
	
	// show admin dashboard
    @GetMapping("/admin/dashboard/{role}/{id}")
    public String getAdminDashboard(@PathVariable("id") Long id,
    	   @PathVariable("role") String role, Model model) {
    	model.addAttribute("id", id);
		model.addAttribute("role", "ADMIN");
		return "adminDashboard";
	}
    
    // show museum form
    @GetMapping("/museum/form/{role}/{id}")
    public String getMuseumForm(@PathVariable("id") Long id,
    	   @PathVariable("role") String role, Model model) {
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);
    	model.addAttribute("museum", new Museum());
    	return "museumForm";
    }
    
    // add museum details into database
    @PostMapping("/add/museum/{role}/{id}")
	public String addMuseum(@PathVariable("id") Long id, @PathVariable("role") String role, 
			@ModelAttribute("museum") @Valid Museum museum, BindingResult result, 
			@RequestParam("museumPic1") MultipartFile file1, @RequestParam("museumPic2") MultipartFile file2, 
			@RequestParam("museumPic3") MultipartFile file3, @RequestParam("museumPic4") MultipartFile file4, 
			@RequestParam("museumPic5") MultipartFile file5, @RequestParam("museumPic6") MultipartFile file6,
			Model model) throws IOException{
	     Museum newmuseum = new Museum();
	     newmuseum.setMuseumName(museum.getMuseumName());
	     newmuseum.setAbout(museum.getAbout());
	     newmuseum.setAddress(museum.getAddress());
	     newmuseum.setOpeningTime(museum.getOpeningTime());
	     newmuseum.setClosingTime(museum.getClosingTime());
	     newmuseum.setTicketCharges(museum.getTicketCharges());
	     newmuseum.setMuseumPic1(file1.getBytes());
	     newmuseum.setMuseumPic2(file2.getBytes());
	     newmuseum.setMuseumPic3(file3.getBytes());
	     newmuseum.setMuseumPic4(file4.getBytes());
	     newmuseum.setMuseumPic5(file5.getBytes());
	     newmuseum.setMuseumPic6(file6.getBytes());	  
         museumService.addMuseum(newmuseum);

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
    
    // delete museum details from database
    @GetMapping("/delete/museum/{museumId}/{role}/{id}")
    public String deleteMuseumDetailsById(@PathVariable("id") Long id, @PathVariable("role") String role,
    		@PathVariable("museumId") Long museumId, Model model) {
    	museumService.deleteById(museumId);
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
    
    // display museum image
    @GetMapping("/museum/display/{id}/{imageId}")
	@ResponseBody
	void showMuseumImage(@PathVariable("id") Long id, @PathVariable("imageId") String imageId, 
			HttpServletResponse response, Optional<Museum> museum) throws ServletException, IOException {
		museum = museumService.findById(id);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		if(imageId.equalsIgnoreCase("1")) {
			response.getOutputStream().write(museum.get().getMuseumPic1());
		} else if(imageId.equalsIgnoreCase("2")) {
			response.getOutputStream().write(museum.get().getMuseumPic2());
		} else if(imageId.equalsIgnoreCase("3")) {
			response.getOutputStream().write(museum.get().getMuseumPic3());
		} else if(imageId.equalsIgnoreCase("4")) {
			response.getOutputStream().write(museum.get().getMuseumPic4());
		} else if(imageId.equalsIgnoreCase("5")) {
			response.getOutputStream().write(museum.get().getMuseumPic5());
		} else if(imageId.equalsIgnoreCase("6")) {
			response.getOutputStream().write(museum.get().getMuseumPic6());	
		}
		response.getOutputStream().close();
	}
    
    // display museum details by id
    @GetMapping("/show/museumDetails/{museumId}/{role}/{id}")
    String showMuseumDetails(@PathVariable("museumId") Long museumId,
    		@PathVariable("role") String role, @PathVariable("id") Long id,
    		Museum museum, Model model) {
    	museum = museumService.getById(museumId);
    	model.addAttribute("museum", museum);
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);
    	if(role.equalsIgnoreCase("USER")) {
    		return "museumDetails1";
    	}else {
    		return "museumDetails";
    	}   	
    }
    
    // show monument form
    @GetMapping("/monument/form/{role}/{id}")
    public String getMonumentForm(@PathVariable("id") Long id,
    	   @PathVariable("role") String role, Model model) {
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);
    	model.addAttribute("monument", new Monument());
    	return "monumentForm";
    }
    
    // add monument details into database
    @PostMapping("/add/monument/{role}/{id}")
	public String addMonument(@PathVariable("id") Long id, @PathVariable("role") String role, 
			@ModelAttribute("monument") @Valid Monument monument,BindingResult result,
			@RequestParam("monumentPic1") MultipartFile file1, @RequestParam("monumentPic2") MultipartFile file2,
			@RequestParam("monumentPic3") MultipartFile file3, @RequestParam("monumentPic4") MultipartFile file4, 
			@RequestParam("monumentPic5") MultipartFile file5, @RequestParam("monumentPic6") MultipartFile file6, 
			Model model) throws IOException{
	     Monument newmonu = new Monument();
	     newmonu.setMonumentName(monument.getMonumentName());
	     newmonu.setAbout(monument.getAbout());
	     newmonu.setAddress(monument.getAddress());
	     newmonu.setOpeningTime(monument.getOpeningTime());
	     newmonu.setClosingTime(monument.getClosingTime());
	     newmonu.setTicketCharges(monument.getTicketCharges());
	     newmonu.setMonumentPic1(file1.getBytes());
	     newmonu.setMonumentPic2(file2.getBytes());
	     newmonu.setMonumentPic3(file3.getBytes());
	     newmonu.setMonumentPic4(file4.getBytes());
	     newmonu.setMonumentPic5(file5.getBytes());
	     newmonu.setMonumentPic6(file6.getBytes());
         monumentService.addMonument(newmonu);
         
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
    
    // delete monument details from database
    @GetMapping("/delete/monument/{monumentId}/{role}/{id}")
    public String deleteMonumentDetailsById(@PathVariable("id") Long id, @PathVariable("role") String role,
    		@PathVariable("monumentId") Long monumentId, Model model) {
    	monumentService.deleteById(monumentId);
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
    
    // display monument image
    @GetMapping("/monument/display/{id}/{imageId}")
	@ResponseBody
	void showMonumentImage(@PathVariable("id") Long id, @PathVariable("imageId") String imageId,
			HttpServletResponse response, Optional<Monument> monument) throws ServletException, IOException {
		monument = monumentService.findById(id);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		if(imageId.equalsIgnoreCase("1")) {
			response.getOutputStream().write(monument.get().getMonumentPic1());
		} else if(imageId.equalsIgnoreCase("2")) {
			response.getOutputStream().write(monument.get().getMonumentPic2());
		} else if(imageId.equalsIgnoreCase("3")) {
			response.getOutputStream().write(monument.get().getMonumentPic3());
		} else if(imageId.equalsIgnoreCase("4")) {
			response.getOutputStream().write(monument.get().getMonumentPic4());
		} else if(imageId.equalsIgnoreCase("5")) {
			response.getOutputStream().write(monument.get().getMonumentPic5());
		} else if(imageId.equalsIgnoreCase("6")) {
			response.getOutputStream().write(monument.get().getMonumentPic6());
		}
		response.getOutputStream().close();
	}
    
    // display monument details by id
    @GetMapping("/show/monumentDetails/{monumentId}/{role}/{id}")
    String showMonumentDetails(@PathVariable("monumentId") Long monumentId,
    		@PathVariable("role") String role, @PathVariable("id") Long id,
    		Monument monument, Model model) {
    	monument = monumentService.getById(monumentId);
    	model.addAttribute("monument", monument);
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);  	
    	if(role.equalsIgnoreCase("USER")) {
    		return "monumentDetails1";
    	}else {
    		return "monumentDetails";
    	}
    }
       
    // show cafe form
    @GetMapping("/cafe/form/{role}/{id}")
    public String getCafeForm(@PathVariable("id") Long id,
    	   @PathVariable("role") String role, Model model) {
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);
    	model.addAttribute("cafe", new Cafe());
    	return "cafeForm";
    }
    
    // add cafe details into database
    @PostMapping("/add/cafe/{role}/{id}")
	public String addCafe(@PathVariable("id") Long id, @PathVariable("role") String role,
			@ModelAttribute("cafe") @Valid Cafe cafe, BindingResult result,
			@RequestParam("cafePic1") MultipartFile file1, @RequestParam("cafePic2") MultipartFile file2, 
			@RequestParam("cafePic3") MultipartFile file3, @RequestParam("cafePic4") MultipartFile file4, 
			@RequestParam("cafePic5") MultipartFile file5, @RequestParam("cafePic6") MultipartFile file6, 
			Model model) throws IOException{
	     Cafe newcafe = new Cafe();
	     newcafe.setCafeName(cafe.getCafeName());
	     newcafe.setAbout(cafe.getAbout());
	     newcafe.setAddress(cafe.getAddress());
	     newcafe.setPopularDish(cafe.getPopularDish());
	     newcafe.setAverageCost(cafe.getAverageCost());
	     newcafe.setOpeningTime(cafe.getOpeningTime());
	     newcafe.setClosingTime(cafe.getClosingTime());
	     newcafe.setCafePic1(file1.getBytes());
	     newcafe.setCafePic2(file2.getBytes());
	     newcafe.setCafePic3(file3.getBytes());
	     newcafe.setCafePic4(file4.getBytes());
	     newcafe.setCafePic5(file5.getBytes());
	     newcafe.setCafePic6(file6.getBytes());
	     
	     cafeService.addCafe(newcafe);
	     
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
   
    // delete cafe details from database
    @GetMapping("/delete/cafe/{cafeId}/{role}/{id}")
    public String deleteCafeDetailsById(@PathVariable("id") Long id, @PathVariable("role") String role,
    		@PathVariable("cafeId") Long cafeId, Model model) {
    	cafeService.deleteById(cafeId);
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
    
    // display cafe image
    @GetMapping("/cafe/display/{id}/{imageId}")
	@ResponseBody
	void showCafeImage(@PathVariable("id") Long id, @PathVariable("imageId") String imageId,
			HttpServletResponse response, Optional<Cafe> cafe) throws ServletException, IOException {
		cafe = cafeService.findById(id);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		if(imageId.equalsIgnoreCase("1")) {
			response.getOutputStream().write(cafe.get().getCafePic1());	
		} else if(imageId.equalsIgnoreCase("2")) {
			response.getOutputStream().write(cafe.get().getCafePic2());
		} else if(imageId.equalsIgnoreCase("3")) {
			response.getOutputStream().write(cafe.get().getCafePic3());
		} else if(imageId.equalsIgnoreCase("4")) {
			response.getOutputStream().write(cafe.get().getCafePic4());
		} else if(imageId.equalsIgnoreCase("5")) {
			response.getOutputStream().write(cafe.get().getCafePic5());
		} else if(imageId.equalsIgnoreCase("6")) {
			response.getOutputStream().write(cafe.get().getCafePic6());
		}
		response.getOutputStream().close();
	}
    
    // display cafe details by id
    @GetMapping("/show/cafeDetails/{cafeId}/{role}/{id}")
    String showCafeDetails(@PathVariable("cafeId") Long cafeId,
    		@PathVariable("role") String role, @PathVariable("id") Long id,
    		Cafe cafe, Model model) {
    	cafe = cafeService.getById(cafeId);
    	model.addAttribute("cafe", cafe);
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);   	
    	if(role.equalsIgnoreCase("USER")) {
    		return "cafeDetails1";
    	}else {
    		return "cafeDetails";
    	}
    }
    
    // show restaurant form
    @GetMapping("/restaurant/form/{role}/{id}")
    public String getRestaurantForm(@PathVariable("id") Long id, 
    	   @PathVariable("role") String role, Model model) {
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);
    	model.addAttribute("restaurant", new Restaurant());
    	return "restaurantForm";
    }
    
    // add restaurant details into database
    @PostMapping("/add/restaurant/{role}/{id}")
	public String addRestaurant(@PathVariable("id") Long id, @PathVariable("role") String role, 
			@ModelAttribute("restaurant") @Valid Restaurant restaurant, BindingResult result, 
			@RequestParam("restaurantPic1") MultipartFile file1, @RequestParam("restaurantPic2") MultipartFile file2,
			@RequestParam("restaurantPic3") MultipartFile file3, @RequestParam("restaurantPic4") MultipartFile file4,
			@RequestParam("restaurantPic5") MultipartFile file5, @RequestParam("restaurantPic6") MultipartFile file6,
			Model model) throws IOException{
	     Restaurant newrest = new Restaurant();
	     newrest.setRestaurantName(restaurant.getRestaurantName());
	     newrest.setAbout(restaurant.getAbout());
	     newrest.setAddress(restaurant.getAddress());
	     newrest.setPopularDish(restaurant.getPopularDish());
	     newrest.setAverageCost(restaurant.getAverageCost());
	     newrest.setOpeningTime(restaurant.getOpeningTime());
	     newrest.setClosingTime(restaurant.getClosingTime());
         newrest.setRestaurantPic1(file1.getBytes());
         newrest.setRestaurantPic2(file2.getBytes());
         newrest.setRestaurantPic3(file3.getBytes());
         newrest.setRestaurantPic4(file4.getBytes());
         newrest.setRestaurantPic5(file5.getBytes());
         newrest.setRestaurantPic6(file6.getBytes());	     
	     restService.addRestaurant(newrest);
	     
	     List<Restaurant> restaurants = restService.getListOfRestaurantDetails();
		 model.addAttribute("restaurants", restaurants);
		 model.addAttribute("id", id);
		 model.addAttribute("role", role);
		 if(role.equalsIgnoreCase("USER")) {
			return "restaurantList";
		 }else {
			return "restaurantCRUD";
		 }
	}
    
    // delete restaurant details from database
    @GetMapping("/delete/restaurant/{restaurantId}/{role}/{id}")
    public String deleteRestaurantDetailsById(@PathVariable("id") Long id, 
    		@PathVariable("role") String role, @PathVariable("restaurantId") Long restaurantId, 
    		Model model) {
    	restService.deleteById(restaurantId);
    	List<Restaurant> restaurants = restService.getListOfRestaurantDetails();
		model.addAttribute("restaurants", restaurants);
		model.addAttribute("id", id);
		model.addAttribute("role", role);
		if(role.equalsIgnoreCase("USER")) {
		   return "restaurantList";
		}else {
		   return "restaurantCRUD";
		}
    }
    
    // display restaurant image
    @GetMapping("/restaurant/display/{id}/{imageId}")
	@ResponseBody
	void showRestaurantImage(@PathVariable("id") Long id, @PathVariable("imageId") String imageId,
			HttpServletResponse response, Optional<Restaurant> restaurant) throws ServletException, IOException {
		restaurant = restService.findById(id);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		if(imageId.equalsIgnoreCase("1")) {
			response.getOutputStream().write(restaurant.get().getRestaurantPic1());
		} else if(imageId.equalsIgnoreCase("2")) {
			response.getOutputStream().write(restaurant.get().getRestaurantPic2());
		} else if(imageId.equalsIgnoreCase("3")) {
			response.getOutputStream().write(restaurant.get().getRestaurantPic3());
		} else if(imageId.equalsIgnoreCase("4")) {
			response.getOutputStream().write(restaurant.get().getRestaurantPic4());
		} else if(imageId.equalsIgnoreCase("5")) {
			response.getOutputStream().write(restaurant.get().getRestaurantPic5());
		} else if(imageId.equalsIgnoreCase("6")) {
			response.getOutputStream().write(restaurant.get().getRestaurantPic6());
		}		
		response.getOutputStream().close();
	}
    
    // display restaurant details by id
    @GetMapping("/show/restaurantDetails/{restaurantId}/{role}/{id}")
    String showRestaurantDetails(@PathVariable("restaurantId") Long restaurantId,
    		@PathVariable("role") String role, @PathVariable("id") Long id,
    		Restaurant restaurant, Model model) {
    	restaurant = restService.getById(restaurantId);
    	model.addAttribute("restaurant", restaurant);
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);  	
    	if(role.equalsIgnoreCase("USER")) {
    		return "restaurantDetails1";
    	}else {
    		return "restaurantDetails";
    	}
    }
    
    
    // show hotel form
    @GetMapping("/hotel/form/{role}/{id}")
    public String getHotelForm(@PathVariable("id") Long id, 
    	   @PathVariable("role") String role, Model model) {
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);
    	model.addAttribute("hotel", new Hotel());
    	return "hotelForm";
    }
    
    // add hotel details into database
    @PostMapping("/add/hotel/{role}/{id}")
	public String addHotel(@PathVariable("id") Long id, @PathVariable("role") String role, 
			@ModelAttribute("hotel") @Valid Hotel hotel, BindingResult result, 
			@RequestParam("hotelPic1") MultipartFile file1, @RequestParam("hotelPic2") MultipartFile file2,
			@RequestParam("hotelPic3") MultipartFile file3, @RequestParam("hotelPic4") MultipartFile file4, 
			@RequestParam("hotelPic5") MultipartFile file5, @RequestParam("hotelPic6") MultipartFile file6,
			Model model) throws IOException{
	     Hotel newhotel = new Hotel();
	     newhotel.setHotelName(hotel.getHotelName());
	     newhotel.setAbout(hotel.getAbout());
	     newhotel.setAddress(hotel.getAddress());
	     newhotel.setPhoneNo(hotel.getPhoneNo());
	     newhotel.setServices(hotel.getServices());
	     newhotel.setRoom(hotel.getRoom());
	     newhotel.setRating(hotel.getRating());
	     newhotel.setPrice(hotel.getPrice());
         newhotel.setHotelPic1(file1.getBytes());
         newhotel.setHotelPic2(file2.getBytes());
         newhotel.setHotelPic3(file3.getBytes());
         newhotel.setHotelPic4(file4.getBytes());
         newhotel.setHotelPic5(file5.getBytes());
         newhotel.setHotelPic6(file6.getBytes());	     
         hotelService.addHotel(newhotel);	
         
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
    
    // delete hotel details from database
    @GetMapping("/delete/hotel/{hotelId}/{role}/{id}")
    public String deleteHotelDetailsById(@PathVariable("id") Long id, 
    		@PathVariable("role") String role, @PathVariable("hotelId") Long hotelId, 
    		Model model) {
    	hotelService.deleteById(hotelId);
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
    
    // display hotel image
    @GetMapping("/hotel/display/{id}/{imageId}")
	@ResponseBody
	void showHotelImage(@PathVariable("id") Long id, @PathVariable("imageId") String imageId,
			HttpServletResponse response, Optional<Hotel> hotel) throws ServletException, IOException {
		hotel = hotelService.findById(id);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		if(imageId.equalsIgnoreCase("1")) {
			response.getOutputStream().write(hotel.get().getHotelPic1());
		} else if(imageId.equalsIgnoreCase("2")) {
			response.getOutputStream().write(hotel.get().getHotelPic2());
		} else if(imageId.equalsIgnoreCase("3")) {
			response.getOutputStream().write(hotel.get().getHotelPic3());
		} else if(imageId.equalsIgnoreCase("4")) {
			response.getOutputStream().write(hotel.get().getHotelPic4());
		} else if(imageId.equalsIgnoreCase("5")) {
			response.getOutputStream().write(hotel.get().getHotelPic5());
		} else if(imageId.equalsIgnoreCase("6")) {
			response.getOutputStream().write(hotel.get().getHotelPic6());
		}		
		response.getOutputStream().close();
	}
    
    // display hotel details by id
    @GetMapping("/show/hotelDetails/{hotelId}/{role}/{id}")
    String showHotelDetails(@PathVariable("hotelId") Long hotelId, 
    		@PathVariable("role") String role, @PathVariable("id") Long id,
    		Hotel hotel, Model model) {
    	hotel = hotelService.getById(hotelId);
        model.addAttribute("hotel", hotel);
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);
    	if(role.equalsIgnoreCase("USER")) {
    		return "hotelDetails1";
    	}else {
    		return "hotelDetails";
    	}
    }
    
    // show health form
    @GetMapping("/health/form/{role}/{id}")
    public String getHealthForm(@PathVariable("id") Long id, 
    	   @PathVariable("role") String role, Model model) {
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);
    	model.addAttribute("clinic", new Clinic());
    	return "healthForm";
    }
    
    // add clinic details into database
    @PostMapping("/add/clinic/{role}/{id}")
	public String addClinic(@PathVariable("id") Long id, @PathVariable("role") String role,
		   @ModelAttribute("clinic") @Valid Clinic clinic, BindingResult result,
		   @RequestParam("clinicPic1") MultipartFile file1, @RequestParam("clinicPic2") MultipartFile file2,
		   @RequestParam("clinicPic3") MultipartFile file3, @RequestParam("clinicPic4") MultipartFile file4,
		   @RequestParam("clinicPic5") MultipartFile file5, @RequestParam("clinicPic6") MultipartFile file6,
		   Model model) throws IOException{
	     Clinic newclinic = new Clinic();
	     newclinic.setClinicName(clinic.getClinicName());
	     newclinic.setAbout(clinic.getAbout());
	     newclinic.setAddress(clinic.getAddress());
	     newclinic.setOpeningTime(clinic.getOpeningTime());
	     newclinic.setClosingTime(clinic.getClosingTime());
	     newclinic.setClinicFees(clinic.getClinicFees());
         newclinic.setClinicPic1(file1.getBytes());
         newclinic.setClinicPic2(file2.getBytes());
         newclinic.setClinicPic3(file3.getBytes());
         newclinic.setClinicPic4(file4.getBytes());
         newclinic.setClinicPic5(file5.getBytes());
         newclinic.setClinicPic6(file6.getBytes());
         healthService.addClinic(newclinic);
         
         List<Clinic> clinics = healthService.getListOfClinicDetails();
 		 model.addAttribute("clinics", clinics);		
	     model.addAttribute("id", id);
	     model.addAttribute("role", role);	     
	     if(role == "USER") {
			return "healthList";
		 }else {
			return "healthCRUD";	
		 }
	}
    
    // delete health details from database
    @GetMapping("/delete/clinic/{clinicId}/{role}/{id}")
    public String deleteClinicDetailsById(@PathVariable("id") Long id, 
    		@PathVariable("role") String role, @PathVariable("clinicId") Long clinicId, 
    		Model model) {
    	healthService.deleteById(clinicId);
    	List<Clinic> clinics = healthService.getListOfClinicDetails();
		model.addAttribute("clinics", clinics);		
	    model.addAttribute("id", id);
	    model.addAttribute("role", role);	     
	    if(role == "USER") {
		   return "healthList";
		}else {
		   return "healthCRUD";	
		}
    }

    // display clinic image
    @GetMapping("/clinic/display/{id}/{imageId}")
	@ResponseBody
	void showClinicImage(@PathVariable("id") Long id, @PathVariable("imageId") String imageId, 
			HttpServletResponse response, Optional<Clinic> clinic) throws ServletException, IOException {
		clinic = healthService.findById(id);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		if(imageId.equalsIgnoreCase("1")) {
			response.getOutputStream().write(clinic.get().getClinicPic1());
		} else if(imageId.equalsIgnoreCase("2")) {
			response.getOutputStream().write(clinic.get().getClinicPic2());
		} else if(imageId.equalsIgnoreCase("3")) {
			response.getOutputStream().write(clinic.get().getClinicPic3());
		} else if(imageId.equalsIgnoreCase("4")) {
			response.getOutputStream().write(clinic.get().getClinicPic4());
		} else if(imageId.equalsIgnoreCase("5")) {
			response.getOutputStream().write(clinic.get().getClinicPic5());
		} else if(imageId.equalsIgnoreCase("6")) {
			response.getOutputStream().write(clinic.get().getClinicPic6());
		}
		response.getOutputStream().close();
	}
    
    // display clinic details by id
    @GetMapping("/show/clinicDetails/{clinicId}/{role}/{id}")
    String showClinicDetails(@PathVariable("clinicId") Long clinicId, 
    		@PathVariable("role") String role, @PathVariable("id") Long id,
    		Clinic clinic, Model model) {
    	clinic = healthService.getById(clinicId);
    	model.addAttribute("clinic", clinic);
    	model.addAttribute("id", id);
    	model.addAttribute("role", role); 	
    	if(role.equalsIgnoreCase("USER")) {
    		return "clinicDetails1";
    	}else {
    		return "clinicDetails";
    	}
    }
    
    // show cab form
    @GetMapping("/cab/form/{role}/{id}")
    public String getCabForm(@PathVariable("id") Long id,
    	   @PathVariable("role") String role, Model model) {
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);
    	model.addAttribute("driver", new Driver());
    	return "cabForm";
    }
    
    // add cab driver details into database
    @PostMapping("/add/driver/{role}/{id}")
	public String addCabDriver(@PathVariable("id") Long id, @PathVariable("role") String role,
			@ModelAttribute("driver") @Valid Driver driver, BindingResult result,
			@RequestParam("driverPic") MultipartFile file, Model model) throws IOException{
	     Driver newdriver = new Driver();
	     newdriver.setDriverName(driver.getDriverName());
	     newdriver.setPhoneNo(driver.getPhoneNo());
	     newdriver.setCabNo(driver.getCabNo());
	     newdriver.setZone(driver.getZone());
	     newdriver.setRating(driver.getRating());
	     newdriver.setDriverPic(file.getBytes());
	     cabService.addCabDriver(newdriver);
	     
	     List<Driver> drivers = cabService.getListOfCabDriverDetails();			
	     model.addAttribute("id", id);
	     model.addAttribute("role", role);	     
	     model.addAttribute("drivers", drivers);	     
	     if(role.equalsIgnoreCase("USER")) {
			return "cabList";
		 }else {
			return "cabCRUD";	
		 }
	}
    
    // delete cab driver details from database
    @GetMapping("/delete/driver/{driverId}/{role}/{id}")
    public String deleteCabDriverDetailsById(@PathVariable("id") Long id, 
    		@PathVariable("role") String role, @PathVariable("driverId") Long driverId, 
    		Model model) {
    	cabService.deleteById(driverId);
    	List<Driver> drivers = cabService.getListOfCabDriverDetails();			
	    model.addAttribute("id", id);
	    model.addAttribute("role", role);	     
	    model.addAttribute("drivers", drivers);	     
	    if(role.equalsIgnoreCase("USER")) {
		   return "cabList";
		}else {
		   return "cabCRUD";	
		}
    }
    
    // display driver image
    @GetMapping("/driver/display/{id}")
	@ResponseBody
	void showDriverImage(@PathVariable("id") Long id, HttpServletResponse response, 
			   Optional<Driver> driver) throws ServletException, IOException {
		driver = cabService.findById(id);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		response.getOutputStream().write(driver.get().getDriverPic());
		response.getOutputStream().close();
	}
    
    // display cab driver details by id
    @GetMapping("/show/cabDetails/{driverId}/{role}/{id}")
    String showCabDetails(@PathVariable("driverId") Long driverId, @PathVariable("role") String role, 
    		@PathVariable("id") Long id, Driver driver, Model model) {
    	driver = cabService.getById(driverId);
    	model.addAttribute("driver", driver);
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);
    	model.addAttribute("driver", driver);   	
    	if(role.equalsIgnoreCase("USER")) {
    		return "cabDetails1";
    	}else {
    		return "cabDetails";
    	}
    }
    
    // show guide form
    @GetMapping("/guide/form/{role}/{id}")
    public String getGuideForm(@PathVariable("id") Long id, 
    	   @PathVariable("role") String role, Model model) {
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);
    	model.addAttribute("guide", new Guide());
    	return "guideForm";
    }
    
    // add guide details into database
    @PostMapping("/add/guideDetails/{role}/{id}")
	public String addGuide(@PathVariable("id") Long id, @PathVariable("role") String role, 
			@ModelAttribute("guide") @Valid Guide guide, BindingResult result, 
			@RequestParam("guidePic") MultipartFile file, Model model) throws IOException{
	     Guide newGuide = new Guide();
	     newGuide.setGuideName(guide.getGuideName());
	     newGuide.setPhoneNo(guide.getPhoneNo());
	     newGuide.setRating(guide.getRating());
	     newGuide.setLangPreference(guide.getLangPreference());
	     newGuide.setChargePerHour(guide.getChargePerHour());
	     newGuide.setGuidePic(file.getBytes());
	     guideService.addGuide(newGuide);
	     
	     List<Guide> guides = guideService.getListOfTouristGuideDetails();					
	     model.addAttribute("id", id);
	     model.addAttribute("role", role);	     
	     model.addAttribute("guides", guides);	     
	     if(role.equalsIgnoreCase("USER")) {
			return "guideList";
		 }else {
			return "guideCRUD";	
		 }
	}
    
    // delete tourist guide details from database
    @GetMapping("/delete/guide/{guideId}/{role}/{id}")
    public String deleteTouristGuideDetailsById(@PathVariable("id") Long id, 
    		@PathVariable("role") String role, @PathVariable("guideId") Long guideId, 
    		Model model) {
    	guideService.deleteById(guideId);
    	List<Guide> guides = guideService.getListOfTouristGuideDetails();					
	    model.addAttribute("id", id);
	    model.addAttribute("role", role);	     
	    model.addAttribute("guides", guides);	     
	    if(role.equalsIgnoreCase("USER")) {
		   return "guideList";
		}else {
		   return "guideCRUD";	
		}
    }
    
    // display guide image
    @GetMapping("/guide/display/{id}")
	@ResponseBody
	void showGuideImage(@PathVariable("id") Long id, HttpServletResponse response, 
			   Optional<Guide> guide) throws ServletException, IOException {
		guide = guideService.findById(id);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		response.getOutputStream().write(guide.get().getGuidePic());
		response.getOutputStream().close();
	}
    
    // display tourist guide details by id
    @GetMapping("/show/guideDetails/{guideId}/{role}/{id}")
    String showGuideDetails(@PathVariable("guideId") Long guideId,
    		@PathVariable("role") String role, @PathVariable("id") Long id,
    		Guide guide, Model model) {
    	guide = guideService.getById(guideId);
    	model.addAttribute("id", id);
    	model.addAttribute("role", role);
    	model.addAttribute("guide", guide);
    	if(role.equalsIgnoreCase("USER")) {
    		return "guideDetails1";
    	}else {
    		return "guideDetails";
    	}
    }    
}
