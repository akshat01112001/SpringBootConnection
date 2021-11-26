package com.example.demo;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Controller
public class ParkingController {
	@Autowired
	//RegistrationDetailsRepo repo;
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("This is the Login Page");
		return "Login";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(/*@RequestBody RegistrationDetails regdetails*/) {
		//repo.save(regdetails);
		System.out.println("This is the Dashboard");
		return "DashBoard";
	}
	
	@RequestMapping("/registrationdetails")
	public String registrationdetails() {
		System.out.println("This is the Registration Details.");
		return "RegistrationDetails";
	}
}
