package com.qa.ui.testScriptExecutor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
	
	@RequestMapping(value = "/home")
	public String welcome() throws Exception {
		System.out.println("AppController->welcome()");
		return "forward:index.html";
	}

}
