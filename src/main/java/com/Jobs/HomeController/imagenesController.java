package com.Jobs.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class imagenesController {

	@GetMapping("/images")
	public String mostrarBuscadorImgs() {
		
		return"BusqImg";
	}
}
