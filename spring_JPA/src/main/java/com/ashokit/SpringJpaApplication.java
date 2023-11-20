package com.ashokit;

import com.ashokit.entities.ContactsEntity;
import com.ashokit.repositories.ContactsRepo;
import com.ashokit.repositories.PersonRepo;
import com.ashokit.repositories.ProductRepo;
import com.ashokit.services.*;
import org.springframework.aot.generate.GeneratedTypeReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctxt= SpringApplication.run(SpringJpaApplication.class, args);
		ContactsService contactsService=ctxt.getBean(ContactsService.class);
		//contactsService.saveUsers();
		//contactsService.deleteUser();
		//contactsService.getUser();
		//contactsService.getUsers();
		//contactsService.test();
		//contactsService.testFindByMethods1();
		//contactsService.testFindByMethods2();
		//contactsService.customQuiries();


		ProductService productService=ctxt.getBean(ProductService.class);
		//productService.saveProducts();
		//productService.getProducts();
		//productService.pagination();
		//productService.queryByExample();


		BookService bookService=ctxt.getBean(BookService.class);
		//bookService.saveBooks();


		PersonService personService=ctxt.getBean(PersonService.class);
		//personService.savePerson();
		//personService.getPersons();
		//personService.getPerson();

	EmployeeService employeeService=ctxt.getBean(EmployeeService.class);
	employeeService.saveData();
	}

}
