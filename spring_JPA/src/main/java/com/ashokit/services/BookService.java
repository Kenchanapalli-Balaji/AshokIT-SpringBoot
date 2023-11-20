package com.ashokit.services;

import com.ashokit.entities.Book;
import com.ashokit.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BookService
{
    @Autowired
    private BookRepo bookRepo;

    public void saveBooks()
    {
        Book b1=new Book("Java", 5000);
        Book b2=new Book("Python", 700);
        Book b3=new Book("HTML", 500);
        Book b4=new Book("SQL", 150);
        Book b5=new Book("Hibernate", 100);
        bookRepo.saveAll(Arrays.asList(b1,b2,b3,b4,b5));

        System.out.print("Succeesfully Inserted Data into Database");
    }

}
