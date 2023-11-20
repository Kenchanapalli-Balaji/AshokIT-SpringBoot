package com.ashokit;

import com.ashokit.entities.Employee;
import com.ashokit.services.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OneToManyApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctxt=SpringApplication.run(OneToManyApplication.class, args);
		EmployeeService employeeService=ctxt.getBean(EmployeeService.class);
		//employeeService.saveData();
		//employeeService.getEmpData();
		employeeService.getAddrData();
	}

}
