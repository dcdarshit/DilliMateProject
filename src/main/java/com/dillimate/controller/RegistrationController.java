package com.dillimate.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
import com.dillimate.entities.Role;
import com.dillimate.entities.User;
import com.dillimate.service.UserService;
import com.dillimate.web.UserRegistrationDto;

@Controller
public class RegistrationController {
	
	 @Autowired
	 private UserService userService;
	 
	 private final Logger log = LoggerFactory.getLogger(this.getClass());
	 
	 @ModelAttribute("user")
	 public UserRegistrationDto userRegistrationDto() {
	     return new UserRegistrationDto();
	 }

	 @GetMapping("/signup")
	 public String showRegistrationForm(Model model) {
	     return "signup";
	 }
	 
	 @PostMapping("/register/newuser")
	 public String registerUserAccount(@ModelAttribute("user") @Valid UserRegistrationDto userDto,
	        BindingResult result, @RequestParam("profilePic") MultipartFile file) throws IOException {
	     log.info("profile pic " + file.getName());
		 User existing = userService.findByEmail(userDto.getEmail());
	     if (existing != null) {
	          result.rejectValue("email", null, "There is already an account registered with that email");
	     }

	   /*  if (result.hasErrors()) {
	          return "signup";
	     }*/
	     BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	     User user = new User();
	     user.setFirstName(userDto.getFirstName());
	     user.setLastName(userDto.getLastName());
	     user.setEmail(userDto.getEmail());
	     user.setPassword(passwordEncoder.encode(userDto.getPassword()));
	     user.setCreateDate(new Date());
	     user.setProfilePic(file.getBytes());
	     user.setRoles(Arrays.asList(new Role("ROLE_USER")));
	     userService.save(user);
	   //  return "redirect:/signup?success";
	     return "login";
	 }
	 
	 @GetMapping("/profile/display/{id}")
	 @ResponseBody
	 void showImage(@PathVariable("id") Long id, HttpServletResponse response, 
			   Optional<User> user) throws ServletException, IOException {
		user = userService.findById(id);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		response.getOutputStream().write(user.get().getProfilePic());
		response.getOutputStream().close();
	}

}
