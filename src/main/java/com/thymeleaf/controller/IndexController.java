package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@RequestMapping(method = RequestMethod.GET,value = "/index")
	public String inicioPrincipal() {
		return "/index";
	}
}
