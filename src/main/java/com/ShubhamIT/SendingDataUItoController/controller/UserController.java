package com.ShubhamIT.SendingDataUItoController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.ShubhamIT.SendingDataUItoController.model.User;

@Controller
public class UserController {
	@GetMapping("/loadForm")
	public String loadForm() {
		
		return "userReg";
		
	}
	
	@GetMapping("/saveUser")
	public String saveUser( User user, Model model) {
		
		
		System.out.println(user);
		model.addAttribute("USER",user);
		return "userSuccess";
		
	}
}
