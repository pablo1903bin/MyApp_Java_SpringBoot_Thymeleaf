package com.Jobs.HomeController;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.Jobs.Models.Entitys.Empleo;
import com.Jobs.Servicios.MetodosEmpleo;

@Controller
@RequestMapping("/app")
public class EmpleosController {

	@Autowired
	MetodosEmpleo metodosEmpleo;
	
	@GetMapping("empleos")
	public String getHomeEmp(Model model) {
		List<Empleo> li = metodosEmpleo.lista();
		System.out.println(li);
		model.addAttribute("lista", li);
		return "Empleos/Emphome";
	}
	
	@PostMapping(path="/save", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String save(@RequestBody Empleo empleo  ) {
	//	metodosEmpleo.guardar(empleo);
		System.out.println(empleo);
		//model.addAttribute(empleo);
		return "redirect:empleos";
	}
	
	@GetMapping("newEmp")
	public String newEmp() {
		return "Empleos/newEmp";
	}
	/*
	@InitBinder
	public void initBinder(WebDataBinder webdataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		webdataBinder.registerCustomEditor(Date.class,  new CustomDateEditor(dateFormat, false));
	}*/
}
