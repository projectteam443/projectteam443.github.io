package com.qa.ui.testScriptExecutor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.qa.ui.testScriptExecutor.controllers"})

public class TestScriptExecutorApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TestScriptExecutorApplication.class, args);
	}

}
