package com.Jobs.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app")
public class LoginController {

	@GetMapping("/login")
	public String login() {
		 System.out.println("Se ejecuto el login controller");
		return "login";
	}
	
	@PostMapping("/home")
	public String dataForLogin(Model model, @RequestParam("name")String nombre, @RequestParam("password")String password ) {
	    System.out.println(nombre + " " + password);
		model.addAttribute("nombre", nombre);
		return "home";
	}
}
