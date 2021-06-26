package com.crt.lisp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LispApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(LispApplication.class);
		//application.
		application.run(args);
	}

}
