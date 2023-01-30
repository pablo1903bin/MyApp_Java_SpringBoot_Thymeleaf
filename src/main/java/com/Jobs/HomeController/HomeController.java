package com.Jobs.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app")
public class HomeController {

	@GetMapping("home")
	public String mostrarHome(Model model) {

		int numero = 7;
		model.addAttribute("datoServidor", numero);
		return "home";
	}

}
