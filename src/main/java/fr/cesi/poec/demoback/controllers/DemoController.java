package fr.cesi.poec.demoback.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hello-all")
	public String demo() {
		return "Hello World";
	}
	
}
