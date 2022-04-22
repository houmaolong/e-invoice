package com.lanpikj.invoice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 

@Controller
public class EnrollController {
 
	@GetMapping({ "/", "/index" })
	public String index() {
		return "index";
	}
}
