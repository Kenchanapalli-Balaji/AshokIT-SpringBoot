package com.ashokit;

import com.ashokit.services.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OneToOneApplication {

	public static void main(String[] args)
	{
		 ConfigurableApplicationContext ctxt = SpringApplication.run(OneToOneApplication.class, args);
		PersonService personService= ctxt.getBean(PersonService.class);
		personService.saveData();
	}

}
