package com.ashokIT;

import com.ashokIT.services.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=SpringApplication.run(PracticeApplication.class, args);
		//PersonService personService=ctxt.getBean(PersonService.class);
		//personService.savePerson();
	}

}
